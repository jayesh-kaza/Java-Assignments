import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

class KYC
{
    /**
     * Given the signup date and the current date, this program provides the allowable date range for the form date.
     * 
     * Input : No. of Test Cases followed by the signup date and current date(in format dd-mm-yyyy dd-mm-yyyy ).
     * Output: Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy 
     */
    public static void setDate(Calendar c,int date,int month,int year)
    {
        c.set(Calendar.DATE,date);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.YEAR,year);
    }

    public static int[] getDate(String str)
    {
        StringTokenizer st = new StringTokenizer(str,"-");
        int x[]= new int[3];
        int i=0;
        while(st.hasMoreTokens())
            x[i++] = Integer.parseInt(st.nextToken());
        return x;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        int t = Integer.parseInt(br.readLine());
        while(t>0)
        {
            t--;
            String input[] = br.readLine().split(" ");

            int joiningDate[] = getDate(input[0]);
            int currentDate[] = getDate(input[1]);

            Calendar c1 = Calendar.getInstance();
            setDate(c1, joiningDate[0], joiningDate[1]-1, joiningDate[2]);

            Calendar c2 = Calendar.getInstance();
            setDate(c2,currentDate[0],currentDate[1]-1,currentDate[2]);
            
            if(c1.getTime().after(c2.getTime()))
            {
                System.out.println("No ranges");
                continue;
            }

            c1.set(Calendar.YEAR, currentDate[2]);
            Date currDate = c2.getTime();

            c1.add(Calendar.DATE,-30);
            System.out.print(df.format(c1.getTime()));

            c1.add(Calendar.DATE,60);
            if(c1.getTime().after(currDate))
                System.out.println(" "+df.format(currDate));
            else
                System.out.println(" "+df.format(c1.getTime()));
        }
    }

}
