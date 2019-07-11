import java.io.*;
import java.util.*;

class Assignment_11
{
    public static void main(String args[]) throws Exception
    {
        File file;
        try
        {
            file = new File(args[0]);
            int i = 0;
            char ch = '\0';
            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            FileReader reader = new FileReader(file);
            while ((i = reader.read()) != -1) {
                ch = (char) i;
                if (ch != ' ' && ch != '\t' && ch != '\n') {
                    if (hm.containsKey(ch))
                        hm.put(ch, (int) hm.get(ch) + 1);
                    else
                        hm.put(ch, 1);
                }
            }
            FileWriter writer = new FileWriter("output.txt");
            PrintWriter pw = new PrintWriter(writer);
            pw.printf("Character   Occurances\n");
            for (Map.Entry<Character, Integer> entry : hm.entrySet())
                pw.printf("   " + (char) entry.getKey() + "  \t  \t" + (int) entry.getValue() + "\n");
            System.out.println("Result is stored in output.txt file");
            reader.close();
            writer.close();
            pw.close();
        }
        catch(Exception e){ }
    }
}
