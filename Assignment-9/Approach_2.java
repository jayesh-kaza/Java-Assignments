import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;


class Assignment_9
{
    public static void main(String args[])throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("^[A-Z].*[.]");
        String input = reader.readLine();
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches())
            System.out.println("Sentence starts with a Capital letter and ends with '.' ");
        else
            System.out.println("Sentence does not start with a Capital letter and/or end with a '.'");
    }
}
