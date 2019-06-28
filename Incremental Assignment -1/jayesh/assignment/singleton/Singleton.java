package jayesh.assignment.singleton;

public class Singleton
{

  public String str;
  
  public static Singleton initialize(String str)
  {
    Singleton s = new Singleton();
    s.str = str;
    return s;
  }
  
  public void print()
  {
   System.out.println(this.str);
  }
}
