
public class Ship extends Vehicle implements Floatable {
    public Ship(){
        super(0.0);
    }
    public Ship(double fuel){
        super(fuel);
    }
    public void move(){
        this.fl0at();
    }
    public void move(int distance){
        for (int a = 1;a>=distance;a++){
            this.fl0at();
        }
    }
    public void fl0at(){
        this.setFuel(this.getFuel()-50);
        if(this.getFuel()>=50){
            System.out.println("Ship moves");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void startEngine(){
        this.setFuel(this.getFuel()-10);
        if(this.getFuel()>=10){
            System.out.println("Engine Starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    public void honk(){
        System.out.println("Shhhh");
    }
}
