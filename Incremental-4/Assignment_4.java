class MyException1 extends Exception
{
    public MyException1(String s)
    {
        System.out.println(s);
    }
}

class MyException2 extends Exception
{
    public MyException2(String s)
    {
        System.out.println(s);
    }
}

class MyException3 extends Exception
{
    public MyException3(String s)
    {
        System.out.println(s);
    }
}

class Assignment_4
{
    public static void throwing(int x)
    {
        try
        {
            if(x<0)
                throw new MyException1("First Exception");
            if(x==0)
                throw new MyException2("Second Exception");
            if(x>0)
                throw new MyException3("Third Exception");
        }
        catch(Exception e)
        {
            System.out.println("Exception is caught");
        }
        finally
        {
            System.out.println("Finally block is executed\n");
        }

    }
    public static void main(String args[])
    {
            throwing(-1);
            throwing(0);
            throwing(1);
            //throwing(); 
    }

}