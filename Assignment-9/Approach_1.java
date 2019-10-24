import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;


class Assignment_9
{
    public static void main(String args[])throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "^[A-Z].*[.]";
        String input = reader.readLine();
        if(Pattern.matches(regex,input))
            System.out.println("Sentence starts with a Capital letter and ends with '.' ");
        else
            System.out.println("Sentence does not start with a Capital letter and/or end with a '.' ");
    }
}
