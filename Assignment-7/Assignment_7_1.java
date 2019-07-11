abstract class Rodent
{
    int speed;
    static int noOfLegs=4;
    Rodent()
    {

        System.out.println("I belong to Rodent class");
        System.out.println("I have "+noOfLegs+" legs");
    }
    abstract public void getSpeed();
    abstract public void eat();
}

class Mouse extends Rodent
{
    Mouse()
    {
        //super();
        System.out.println("I am a Mouse");
        speed = 19;
    }
    public void getSpeed()
    {
        System.out.println("I can move at a pace of "+speed+" mph");
        System.out.println("I'm a lot faster than others!");
    }
    public void eat()
    {
        System.out.println("I am an omnivore, I eat everything.\n");
    }
}

class Gerbil extends Rodent
{
    Gerbil()
    {
        //super();
        System.out.println("I am a Gerbil");
        speed = 4;
    }
    
    public void getSpeed()
    {
        System.out.println("I can move at a pace of "+speed+" mph");
        System.out.println("I'm slower than a mouse, but I'm faster than a hamster!");
    }
    public void eat()
    {
        System.out.println("I am a herbivore, I like leaves and herbs.\n");
    }
}

class Hamster extends Rodent
{
    Hamster()
    {
        //super();
        System.out.println("I am a Hamster");
        speed = 2;
    }
   
    public void getSpeed()
    {
        System.out.println("I can move at a pace of "+speed+" mph");
        System.out.println("I too lazy to move..");
    }
    public void eat()
    {
        System.out.println("I am a herbivore, I love carrots!\n");
    }
}
class Assignment_7_1
{
    public static void main(String args[])
    {
        Rodent obj[] = new Rodent[3];
        obj[0] = new Mouse();
        obj[0].getSpeed();
        obj[0].eat();
        obj[1] = new Gerbil();
        obj[1].getSpeed();
        obj[1].eat();
        obj[2] = new Hamster();
        obj[2].getSpeed();
        obj[2].eat();
    }
}
