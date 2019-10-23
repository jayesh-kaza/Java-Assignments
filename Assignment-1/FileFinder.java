import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern; 

/**
     * @author : Jayesh 
     * Input : a regex
     * Output: absolute path of the files matching the regex
**/

public class FileFinder
{
    public static void findMatchingFiles(String regex,String ROOT_FILE_PATH) throws NullPointerException
    {
        File file = new File(ROOT_FILE_PATH);
        if(!file.exists())
            return;

        File[] allSubFiles = file.listFiles();
        for (File subFile : allSubFiles) 
        {
            // Recursive call if it is a directory, to check the files inside it.
            if(subFile.isDirectory())
                findMatchingFiles(regex,subFile.getAbsolutePath());

            else
            {
                String fileName = subFile.getName();
                if(Pattern.matches(regex,fileName))
                    System.out.println(subFile.getAbsolutePath());
            }
        }
    }
	
    public static void main(String args[]) throws NullPointerException
    {
        String ROOT_FILE_PATH="/home";
        Scanner scanner = new Scanner(System.in);
        
        while(true)
        {
            System.out.print("Enter regex: ");
            String regex = scanner.nextLine();
            findMatchingFiles(regex,ROOT_FILE_PATH);
            
            System.out.print("Search again(Y/N):");
            String ch = scanner.nextLine();
            if(ch.equals("N") || ch.equals("n"))
                break;
        }
        scanner.close();
    }

}
