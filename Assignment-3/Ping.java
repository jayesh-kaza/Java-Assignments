import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.*;

public class Ping 
{
	/**
	 *@author : Jayesh
	 * Java function that will ping any host ( given as input ) and computes the median of the time taken to ping.
	 * The system ping utility is used.
	 * 
	 * Input : HostName(String) and No. of pings(Integer)
	 * Output: The median time taken to ping.
	 */
	
  public static void runCommand(String command,int pingCount) 
  {
	try
	{
	    Process process = Runtime.getRuntime().exec(command);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    ArrayList<Float> latencyList = new ArrayList<>();
	    String output;
            boolean success = false;
	    while ((output = reader.readLine()) != null)
	    {
	      if(Pattern.matches(".*time=.*",output))
	      {
                 String splitOutput[] = output.split(" ");
          	 String latencyValue = splitOutput[splitOutput.length-2].substring(5);
          	 System.out.println(output);
		 latencyList.add(Float.parseFloat(latencyValue));
		 success = true;
	      }
	    }
	     
	    Collections.sort(latencyList);
	    if (!success)
        	System.out.println("\nUnreachable");
	    else
	    {
	      int length = latencyList.size();
              if(pingCount % 2 == 0)
		  System.out.println("\nMedian time = "+(latencyList.get(length/2) + latencyList.get(length/2-1))/2);
	      else
		  System.out.println("\nMedian time = "+latencyList.get(length/2));
	    }
       }

      catch (Exception exception) 
      {
	   exception.printStackTrace();
       }  
  }

  public static void main(String[] args) 
  {
	Scanner scanner= new Scanner(System.in);
	System.out.print("Enter url of the host: ");
	String url = scanner.nextLine();
	System.out.print("Enter number of times to ping (eg:1-20): ");
	int pingCount = scanner.nextInt();
	runCommand("ping -c" + pingCount + " " + url, pingCount);
   }
}
