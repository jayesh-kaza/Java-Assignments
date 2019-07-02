class C
{
    String s;
    C(String s)
    {
        this.s = s;
        System.out.println(s);

    }

}

class Assignment_2_4
{
    public static void main(String args[])
    {
        C obj[]  = new C[10];
        // The initialization messages from the constructor calls are not printed here.

        for(int i=0;i<10;i++)
            //The initialization messages are printed here.
            obj[i] = new C(String.valueOf(i));
    }
}
