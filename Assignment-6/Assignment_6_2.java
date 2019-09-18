class C1
{
    int x,y;
    C1()
    {
        this(10,20);
    }
    C1(int x,int y)
    {
        this.x = x;
        this.y = y; 
    }
}

class Assignment_6_2
{
    public static void main(String args[])
    {
        C1 obj = new C1();
        System.out.println(obj.x+" "+obj.y);
    }
}
