import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.*;
import javax.swing.*;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener{
    JFrame fr;
    JPanel p;
    JTextArea ta;
    JTextField tf;
    JButton bt1,bt2;
    private int va;

    public int getVa() {
        return va;
    }

    public void setVa(int va) {
        this.va = va;
    }
    
    public ChatDemo(){
        fr = new JFrame();
        p = new JPanel();
        ta = new JTextArea(20,45);
        tf = new JTextField(45);
        bt1 = new JButton("Submit");
        bt2 = new JButton("Reset");
     
        fr.setLayout(new BorderLayout());
        fr.add(ta,BorderLayout.NORTH);
        ta.setEditable(false);
        fr.add(tf,BorderLayout.CENTER);
        fr.add(p,BorderLayout.SOUTH);
        p.setLayout(new FlowLayout());
        p.add(bt1); p.add(bt2);
        
        fr.addWindowListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(bt1)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String txtTime = (dtf.format(LocalDateTime.now()));
            ta.setText(ta.getText() + txtTime + " : " + tf.getText()+ "\n");
            tf.setText("");
            
            this.setVa(this.getVa()+1);
            
        }else if(ae.getSource().equals(bt2)){
            ta.setText("");
        }
    }
    public void windowClosing(WindowEvent we){
        try(FileOutputStream fout = new FileOutputStream("ChatDemo.dat");){
            for(int i = 0; i < ta.getText().length(); i++){
                fout.write(ta.getText().charAt(i));
            }
            System.out.println("Done");
        }catch(FileNotFoundException e){
            System.out.println(e);
            try{
                File ChatDemo = new File("ChatDemo.dat");
                ChatDemo.createNewFile();
                System.out.println("Creat File");
            }catch(IOException e2){
                System.out.println("can't create file : " + e2);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
    @Override
    public void windowOpened(WindowEvent we){
        if(new File("ChatDemo.dat").exists()){
            try(FileInputStream fin = new FileInputStream("ChatDemo.dat");){
                int i = fin.read();
                while(i != -1){
                    ta.setText(ta.getText()+ (char)i);
                    i = fin.read();
                }
            }catch(IOException e){
                System.out.println(e);
            }
        }else{
            
        }
    }
    
    public void windowDeactivated(WindowEvent we){}
    public void windowActivated(WindowEvent we){}
    public void windowDeiconified(WindowEvent we){}
    public void windowIconified(WindowEvent we){}
    public void windowClosed(WindowEvent we){}
    public static void main(String[] args) {
        new ChatDemo();
    }
}
