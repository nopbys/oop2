import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener{
    private JFrame fr;
    private JLabel lb1, lb2, lb3;
    private JButton bt1, bt2;
    private JTextField tf, tfbox1, tfbox2;
    private JPanel p, p2;
    private Student std;
    public StudentView(){
        std = new Student();
        fr = new JFrame();
        lb1 = new JLabel("ID: ");
        lb2 = new JLabel("Name: ");
        lb3 = new JLabel("Money: ");
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        tf = new JTextField("0"); //money
        tfbox1 = new JTextField(); //Id
        tfbox2 = new JTextField(); //Name
        
        fr.setLayout(new BorderLayout());
        p = new JPanel();
        p2 = new JPanel();
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        fr.addWindowListener(this);
        tf.setEditable(false);
        p.setLayout(new GridLayout(3, 2));
        p.add(lb1); p.add(tfbox1);
        p.add(lb2); p.add(tfbox2);
        p.add(lb3); p.add(tf);
        fr.add(p, BorderLayout.NORTH);
        p2.add(bt1); p2.add(bt2);
        fr.add(p2);
        fr.setVisible(true);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new StudentView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(bt1)){
            int amount = Integer.parseInt(tf.getText());
            int total = amount + 100;
            tf.setText(total+"");
        }
        else if(e.getSource().equals(bt2)){
            int amount = Integer.parseInt(tf.getText());
            int total = amount - 100;
            tf.setText(total+"");
        }
    }
    public void windowClosing(WindowEvent e){
        try(FileOutputStream fOut = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);){
            if(tfbox1.getText().equals("")){
                std.setID(-1);
            }else{
                std.setID(Integer.parseInt(tfbox1.getText()));
            }
            std.setName(tfbox2.getText());
            std.setMoney(Integer.parseInt(tf.getText()));
            oout.writeObject(std);
            //fOut.close();
            //oout.close();
        }catch (IOException ev){
            ev.printStackTrace();
        }
    }
    public void windowOpened(WindowEvent e){
        try(FileInputStream fin = new FileInputStream("StudentM.dat");
            ObjectInputStream in = new ObjectInputStream(fin);){
            std = (Student) in.readObject();
            tfbox2.setText(""+std.getName());
             if(std.getID() == -1){
                tfbox1.setText("");
            }else{
                tfbox1.setText(""+std.getID());
            }
            tf.setText(""+std.getMoney());
            in.close();
            fin.close();
        }catch(IOException ev){
//            ev.printStackTrace();
        }catch(ClassNotFoundException c){
//            c.printStackTrace();
        }
    }
    @Override
    public void windowClosed(WindowEvent e) {
    }
    @Override
    public void windowIconified(WindowEvent e) {
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
    }
    @Override
    public void windowActivated(WindowEvent e) {
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}