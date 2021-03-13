import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatingA {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int acount = 0;
        char[] c = s.toCharArray();
        for (int i=0; i< c.length; i++) {
            if (c[i] == 'a') acount++;
        }
        System.out.println(n/s.length());
        long count = acount * n/s.length();
        System.out.println(s.length());
        System.out.println(acount);
        System.out.println(count);
        long bal = n%s.length();
        System.out.println(bal);
        for (int i=0; i<bal; i++) {
            if (c[i] == 'a') {
                count++;
            }
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(repeatedString(s, n));



        scanner.close();
    }
}
