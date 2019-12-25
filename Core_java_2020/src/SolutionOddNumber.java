import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionOddNumber {



    // Complete the oddNumbers function below.
    static List<Integer> oddNumbers(int l, int r) {
       List<Integer> list = new ArrayList<>();
        for(int i=l;i<=r;i++){
            if(i%2!=0){
                System.out.println(i);
                list.add(i);
            }
        }
        return list;

    }

    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());*/

        List<Integer> res = oddNumbers(2, 12);
System.out.println(res);
       /* for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}
