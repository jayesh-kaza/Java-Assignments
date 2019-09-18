import java.io.*;
import java.util.*;
import java.util.regex.*; 

/**
     * Input : a regex
     * Output: absolute path of the files matching the regex
     * */

public class FileFinder
{
    public static void finding(String regex,String ROOT_FILE_PATH) throws NullPointerException
    {
        File f = new File(ROOT_FILE_PATH);
        if(!f.exists())
            return;

        File[] allSubFiles = f.listFiles();
        for (File file : allSubFiles) 
        {
            // Recursive call if it is a directory, to check the files inside it.
            if(file.isDirectory())
                finding(regex,file.getAbsolutePath());

            else
            {
                String fileName = file.getName();
                if(Pattern.matches(regex,fileName))
                    System.out.println(file.getAbsolutePath());
            }
        }
    }
	
    public static void main(String args[]) throws NullPointerException
    {
        String ROOT_FILE_PATH="/home";
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.print("Enter regex: ");
            String regex = sc.nextLine();
            finding(regex,ROOT_FILE_PATH);
            
            System.out.print("Search again(Y/N):");
            String ch = sc.nextLine();
            if(ch.equals("N") || ch.equals("n"))
                break;
        }
    }

}
