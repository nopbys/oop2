import java.awt.event.*;

public class MouseLisAction implements MouseListener{
    MyClock3 t,t2;
    public MouseLisAction(MyClock3 t,MyClock3 t2){
        this.t = t;
        this.t2 = t2;
    }
    public void mouseClicked(MouseEvent me){
        System.out.println("click");
        if(t.pause){
            System.out.println("resume");
            t.resume();
            t.pause = false;
        }else{
            System.out.println("stop");
            t.stop();
            t.pause = true;
        }
    }
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
}