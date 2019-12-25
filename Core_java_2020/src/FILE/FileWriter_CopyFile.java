package FILE;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_CopyFile {
	 public static void main(String args[]) throws IOException
	   {
	      FileReader in = null;
	      FileWriter out = null;

	      try {
	         in = new FileReader("D:/input.txt");
	         out = new FileWriter("D:/output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	   }
}
