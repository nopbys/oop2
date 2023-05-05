import java.awt.*;
import javax.swing.*;
public class MyClock2 extends JLabel implements Runnable{
    public void run(){
        int sec=0,min=0,hour = 0;
        while(true){
            sec += 1;
            if(sec>= 60){
                sec = 0;
                min += 1;
            }if(min >= 60){
                min = 0;
                hour += 1;
            }
            
            if(hour < 10){
                this.setText("0"+hour+":");
            }else{
                this.setText(hour+":");
            }
            if(min < 10){
                this.setText(this.getText()+"0"+min+":");
            }else{
                this.setText(this.getText()+min+":");
            }
            if(sec < 10){
                this.setText(this.getText()+"0"+sec);
            }else{
                this.setText(this.getText()+sec);
            }
            this.setFont(new Font(this.getText(), Font.ITALIC, 25));
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}