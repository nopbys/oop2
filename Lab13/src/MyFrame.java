import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;
public class MyFrame{
    public MyFrame(){

    }
//    ClockListen ct = new ClockListen(this);
//    JFrame fr = new JFrame();
//    MyClock2 clock = new MyClock2();
//    Thread t = new Thread(clock);
    
//    public MyFrame(){
//        
//    }
//    public static void main(String[] args) {
//        JFrame fr = new JFrame();
//        MyClock2 clock = new MyClock2();
//        Thread t = new Thread(clock);
//        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        t.start();
//        fr.add(clock);
//        fr.setSize(150,150);
//        fr.setVisible(true);
//    }
    
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        MyClock3 clock = new MyClock3();
        MyClock3 clock2 = new MyClock3();
        Thread t = new Thread(clock);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.addMouseListener(new MouseLisAction(clock,clock2));
        fr.add(clock);
        
        fr.setSize(150,150);
        fr.setVisible(true);
        
        t.start();
        
        
    }
    
    
}