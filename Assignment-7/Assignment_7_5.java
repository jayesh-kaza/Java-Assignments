class P1
{
    class Q1
    {
        Q1(String s)
        {
            System.out.println(s);
        }
    }
}

class P2
{
    P2(String s)
    {
        Q2 obj = new Q2(s);
    }
    class Q2 extends P1.Q1
    {
        Q2(String s)
        {
            new P1().super(s);
        }
    }
}

class Assignment_7_5
{
    public static void main(String args[])
    {
        new P2("Hello, World");
    }
}
