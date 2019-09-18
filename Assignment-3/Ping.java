import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.*;

public class Ping 
{
	/**
	 * Java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
	 * The system ping utility is used.
	 * 
	 * Input : HostName(String) and No. of pings(Integer)
	 * Output: The median time taken to ping.
	 */
	
  public static void runCommand(String command,int times) 
  {
	try
	{
	    Process process = Runtime.getRuntime().exec(command);
	    BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    ArrayList<Float> f = new ArrayList<>();
	    String s  = "";
	    String ms = "";
	    int len = times, flag = 0;
	    while ((s = br.readLine()) != null)
	    {
		   if(Pattern.matches(".*time=.*",s))
		   {
             String ss[] = s.split(" ");
          	 ms = ss[ss.length-2].substring(5);
          	 System.out.println(s);
		  	 f.add(Float.parseFloat(ms));
		  	 flag = 1;
		   }
		}
	    Collections.sort(f);
	    if (flag == 0)
          System.out.println("\nunreachable");
	    else
	    {   
          if(len % 2 == 0)
		  	System.out.println("\nMedian time = "+(f.get(len/2) + f.get(len/2 -1))/2 );
		  else
		    System.out.println("\nMedian time = "+f.get(len/2));
	    }
    }  
    catch (Exception e) 
    {
	   e.printStackTrace();
	}  
  }

  public static void main(String[] args) 
  {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter url of the host: ");
	String url = sc.nextLine();
	System.out.print("Enter number of times to ping (eg:1-20): ");
	int t = sc.nextInt();
	runCommand("ping -c"+t+" "+url,t);
   }
   
}
