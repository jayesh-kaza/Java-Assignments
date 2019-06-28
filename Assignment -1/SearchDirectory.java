import java.io.*;
import java.util.*;
import java.util.regex.*; 

public class SearchDirectory
{
    /**
     * Java program to search through the home directory and look for files that match a regular expression. 
     * This program takes inputs repeatedly and prints out the full absolute path of the matching files found.
     * 
     * Input : a regex
     * Output: absolute path of the files matching the regex
     * */

    // Method to find the files matching the given regex
    public static void finding(String reg,String ROOT_FILE_PATH) throws NullPointerException
    {
        File f = new File(ROOT_FILE_PATH);
        if(!f.exists())
            return;

        File[] allSubFiles = f.listFiles();
        for (File file : allSubFiles) 
        {
            // Recursive call if it is a directory, to check the files inside it.
            if(file.isDirectory())
                finding(reg,file.getAbsolutePath());

            else
            {
                String fileName = file.getName();
                if(Pattern.matches(reg,fileName))
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
            String reg = sc.nextLine();
            finding(reg,ROOT_FILE_PATH);
            
            System.out.print("Search again(Y/N):");
            String ch = sc.nextLine();
            if(ch.equals("N") || ch.equals("n"))
                break;
        }
    }

}