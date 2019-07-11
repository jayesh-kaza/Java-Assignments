interface cycle
{
    void getWheels();
}

class Unicycle implements cycle
{
    int wheels;
    Unicycle()
    {
        System.out.println("It is a unicycle");
        this.wheels = 1;
    }
    public void getWheels()
    {
        System.out.println("A unicycle has "+wheels+" wheel");
    }
}

class Bicycle implements cycle
{
    int wheels;
    Bicycle()
    {
        System.out.println("It is a bicycle");
        this.wheels = 2;
    }
    public void getWheels()
    {
        System.out.println("A bicycle has "+wheels+" wheels");
    }
}
class Tricycle implements cycle
{
    int wheels;
    Tricycle()
    {
        System.out.println("It is a tricycle\n");
        this.wheels = 3;
    }
    public void getWheels()
    {
        System.out.println("A tricycle has "+wheels+" wheels");
    }
}

class CycleFactory
{
  public static cycle getUnicycle()
  { 
      return new Unicycle(); 
  }
  public static cycle getBicycle()
  { 
      return new Bicycle(); 
  }
  public static cycle getTricycle()
  { 
      return new Tricycle(); 
  }
  
}

class Assignment_7_4
{
  public static void main(String []args)
  {
    cycle cycle1 = CycleFactory.getUnicycle();
    cycle cycle2 = CycleFactory.getBicycle();
    cycle cycle3 = CycleFactory.getTricycle();

    cycle1.getWheels();
    cycle2.getWheels();
    cycle3.getWheels();
  }
}
