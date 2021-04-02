import java.nio.file.*;
import java.io.*;
public class lab13part2 {
    public static void main(String[] args){
        Path file = Paths.get("directory.txt");
        String o = "";
        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            o = reader.readLine();
            while(o != null)
            {
            System.out.println(o);
            o = reader.readLine();
            }
            reader.close();
        }
        catch (Exception e)
        {
            System.out.println("Message: " + e);
        }
    }
}