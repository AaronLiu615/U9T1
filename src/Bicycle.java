public class Bicycle extends Vehicle
{
    private int gearcount;

    public Bicycle(String name, int wheels, int gearcount)
    {
        super(name, wheels);
        this.gearcount = gearcount;
    }

    public int getGearcount()
    {
        return gearcount;
    }

    public void ringBell()
    {
        System.out.println("The bell has been rung");
    }
}
