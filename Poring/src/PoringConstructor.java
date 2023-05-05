import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PoringConstructor implements ActionListener{
    int kill = 0;
    JFrame fr;
    JPanel p;
    JButton bt;
    JLabel l1;
    
    public PoringConstructor(){
        fr = new JFrame();
        p = new JPanel();
        bt = new JButton("Add");
        l1 = new JLabel("poringkill = " + kill);
        fr.add(p);
        p.add(bt);
        p.add(l1);
        bt.addActionListener(this);
        
        fr.pack();
        fr.setVisible(true);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(bt)){
            new Poring();
        }
    }
}