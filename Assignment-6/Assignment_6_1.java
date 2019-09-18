import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

class Assignment_6_1 {

    public static int numberOfDigits(long n)
    {
        return Long.toString(n).length();
    }

    public static boolean isVampire(long n, long x, long y)
    {
        if(Long.toString(x).endsWith("0") && Long.toString(y).endsWith("0")) 
            return false;

        int originalLength = numberOfDigits(n);
        if(numberOfDigits(x) != originalLength / 2 || numberOfDigits(y) != originalLength / 2) 
            return false;

        byte[] originalBytes = Long.toString(n).getBytes();
        byte[] xyBytes = (Long.toString(x) + Long.toString(y)).getBytes();
        Arrays.sort(originalBytes);
        Arrays.sort(xyBytes);
        return Arrays.equals(originalBytes, xyBytes);

    }

    public static void main(String[] args)
    {
        ArrayList<Long> vampireNumbers = new ArrayList<Long>();
        for(long i=1260; vampireNumbers.size()<100; i++)
        {
            if((numberOfDigits(i) % 2) != 0) 
            {
                i = i * 10 - 1; 
                continue; 
            }

            for(long x=2; x<=Math.sqrt(i)+1; x++){

                if(i%x==0)
                {
                    long y= i/x;
                    if(isVampire(i,x,y) && x<=y)
                    {
                        vampireNumbers.add(i);
                        System.out.println(vampireNumbers.size()+" "+i);
                        break;
                    }
                }
            }
        }

    }
}
