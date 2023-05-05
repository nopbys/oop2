import java.awt.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class MyClock extends JLabel implements Runnable{
    public void run(){
        while(true){
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            
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
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}