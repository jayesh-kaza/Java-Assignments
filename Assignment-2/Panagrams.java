import java.io.*;
import java.util.*;
 
    

public class Panagrams
{
    /** 
     * Java program that checks if the input string contains all the letters of the alphabet a-z (case-insensitive). 
     * Time complexity:  O(n)
     * Space Complexity: O(1)
     * 
     * Input  : A string (as command line argument)
     * Output : A string stating if input is a panagram or not.
    */
 
    public static void main(String args[])
    {
        try
        {
            args[0] = args[0].toLowerCase().replaceAll("\\s+","");
            int characterCount[] = new int[26];

            for(int i=0;i<26;i++)
                characterCount[i]=0;

            for(int i=0;i<args[0].length();i++)
                characterCount[args[0].charAt(i)-'a']+=1;

            int flag = 1;
            for(int i=0;i<26;i++)
                if(characterCount[i]==0){
                    flag = 0;
                    break;
                }

            if(flag==0)
                System.out.println("Not a panagram");
            else
                System.out.println("It's a panagram");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Give a valid input String");
        }
    }
}
