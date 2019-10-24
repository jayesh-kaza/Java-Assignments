import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

class Assignment_11
{
    public static void main(String args[]) throws Exception
    {
        File file;
        try
        {
            file = new File(args[0]);
            int i = 0;
            HashMap<Character, Integer> characterCountMap = new HashMap<Character, Integer>();
            FileReader reader = new FileReader(file);
            
            while ((i = reader.read()) != -1) 
            {
                char ch = (char) i;
                if (ch != ' ' && ch != '\t' && ch != '\n') 
                {
                    if (characterCountMap.containsKey(ch))
                        characterCountMap.put(ch, (int) characterCountMap.get(ch) + 1);
                    else
                        characterCountMap.put(ch, 1);
                }
            }

            FileWriter writer = new FileWriter("output.txt");
            PrintWriter pw = new PrintWriter(writer);
            pw.printf("Character   Occurances\n");
            for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet())
                pw.printf("   " + (char) entry.getKey() + "  \t  \t" + (int) entry.getValue() + "\n");
            System.out.println("Result is stored in output.txt file");
            reader.close();
            writer.close();
            pw.close();
        }
        catch(Exception e){ }
    }
}
