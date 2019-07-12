import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class KYC {
    /**
     * Given the signup date and the current date, this program provides the allowable date range for the form date.
     * 
     * Input : No. of Test Cases followed by the signup date and current date(in format dd-mm-yyyy dd-mm-yyyy ).
     * Output: Range of dates for KYC form in format dd-mm-yyyy dd-mm-yyyy 
     */

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static LocalDate getDate(String date)
    {
        return LocalDate.parse(date,dtf);
    }

    public static int getYear(String date)
    {
        return Integer.parseInt(date.substring(6));
    }

    public static void printDate(LocalDate d1,LocalDate d2)
    {
        System.out.println(dtf.format(d1)+" "+dtf.format(d2));
    }
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t>0)
        {
            t--;
            String input[] = br.readLine().split(" ");

            // storing dates in LocalDate objects
            LocalDate joiningDate = getDate(input[0]);
            LocalDate currentDate = getDate(input[1]);

            // if the joining date is same as the current date
            if(joiningDate.equals(currentDate))
                printDate(joiningDate,joiningDate.plusDays(30));

            // if joining date is after current date
            else if(joiningDate.isAfter(currentDate))
                System.out.println("No ranges");

            else 
            {
                int joiningYear = getYear(input[0]);
                int currentYear = getYear(input[1]);

                // getting to the current year
                joiningDate = joiningDate.plusYears(currentYear-joiningYear);

                // if +30 days crosses current date
                if(joiningDate.plusDays(30).isAfter(currentDate))
                    printDate(joiningDate.minusDays(30), currentDate);

                else
                    printDate(joiningDate.minusDays(30), joiningDate.plusDays(30));
            }
        }
    }
}
