interface in1
{
    void in1Method1();
    void in1Method2();
}
interface in2
{
    void in2Method1();
    void in2Method2();
}
interface in3 
{
    void in3Method1();
    void in3Method2();
}

interface in4 extends in1,in2,in3
{
    void in4Method1();
}

class X
{
    int data;
    void display()
    {
        System.out.println("Data");
    }
}

class Y extends X implements in4
{
    public void in1Method1(){}
    public void in1Method2(){}
    public void in2Method1(){}
    public void in2Method2(){}
    public void in3Method1(){}
    public void in3Method2(){}
    public void in4Method1(){}

}

class Assignment_7_3
{
    public static void m1(in1 obj){ obj.in1Method1(); }
    public static void m2(in2 obj){ obj.in2Method1(); }
    public static void m3(in3 obj){ obj.in3Method1(); }
    public static void m4(in4 obj){ obj.in4Method1(); }
    public static void main(String args[])
    {
        Y obj = new Y();
        m1(obj);
        m2(obj);
        m3(obj);
        m4(obj);
    }
}
