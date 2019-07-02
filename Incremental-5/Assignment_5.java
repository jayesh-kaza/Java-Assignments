import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;


class Assignment_5
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Pattern p = Pattern.compile("^[A-Z].*[.]");
        // String st = br.readLine();
        // Matcher m = p.matcher(st);

        // if(m.matches())
        //     System.out.println("Sentence starts with a Capital letter and ends with '.' ");
        // else
        // System.out.println("Sentence does not start with a Capital letter and ends with '.' ");

        

        String regex = "^[A-Z].*[.]";
        String st = br.readLine();
        if(Pattern.matches(regex,st))
            System.out.println("Sentence starts with a Capital letter and ends with '.' ");
        else
            System.out.println("Sentence does not start with a Capital letter and ends with '.' ");
    }
}
