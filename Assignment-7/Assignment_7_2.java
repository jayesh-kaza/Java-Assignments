class Cycle
{
    int wheels;
    Cycle()
    {
        System.out.println("This is a cycle");
    }
    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }
}

class Unicycle extends Cycle
{
    Unicycle()
    {
        super();
        System.out.println("It is a unicycle\n");
        
    }
    public void setWheels()
    {
        this.wheels = 1;
    }
    public void balance()
    {
        System.out.println("A unicycle is balanced\n");
    }
}

class Bicycle extends Cycle
{
    Bicycle(){
        super();
        System.out.println("It is a bicycle\n");
    }
    public void setWheels()
    {
        this.wheels = 2;
    }
    public void balance()
    {
        System.out.println("A bicycle is balanced\n");
    }
}

class Tricycle extends Cycle
{
    Tricycle(){
        super();
        System.out.println("It is a tricycle\n");
    }
    public void setWheels()
    {
        this.wheels = 3;
    }
}

class Assignment_7_2
{
    public static void main(String args[])
    {
        Cycle cycle[] = new Cycle[3];

        cycle[0] = new Unicycle();
        cycle[1] = new Bicycle();
        cycle[2] = new Tricycle();

        //upcasting
        // cycle[0].balance();
        // cycle[1].balance();
        // cycle[2].balance();

       //downcasting
        ((Unicycle)cycle[0]).balance();
        ((Bicycle)cycle[1]).balance();
        //((TriCycle)cycles[2]).balance() won't work as there is no balance method defined

    }
}
