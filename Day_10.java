import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s=Integer.toBinaryString(n);
        int c=0;int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
            c++;
            }
            else
            {
            c=0;
            }
            if(max<c)
            {
                max=c;
            }
            
        }
        System.out.println(max);
        scanner.close();
    }
}
