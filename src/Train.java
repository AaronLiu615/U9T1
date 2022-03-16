public class Train extends Vehicle
{
    private int speed;

    public Train(String name, int wheels, int speed){
        super(name, wheels);
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void speedUp(){
        System.out.println("The train speeds up to" + speed + " mph");
    }
}
