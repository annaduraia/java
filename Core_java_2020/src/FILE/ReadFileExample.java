package FILE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileExample
{
    public static void main (String[] args) throws IOException
    {
        File file = new File ("D:/filename.txt");
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream (file);
            System.out.println ("Total file size to read (in bytes) : " + fis.available ());
            int content;
            while ((content = fis.read ()) != -1)
            {
                System.out.print ((char) content);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace ();
        }
        finally
        {
            try
            {
                if (fis != null)
                    fis.close ();
            }
            catch (IOException ex)
            {
                ex.printStackTrace ();
            }
        }

        System.out.println ("\n--------------------------------------");
        BufferedReader br;
        br = new BufferedReader (new FileReader ("D:/filename.txt"));
        while (br.ready ())
        {
            System.out.println ("test---:" + br.readLine ());
        }

        /*
         * BufferedWriter bw; bw = new BufferedWriter(new FileWriter("D:/filename.txt")); bw.write("2222222222");
         */
    }
}
