import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int c=0;
            int n=sc.nextInt();
            if(n>=2)
            {
                for(int j=2;j<=Math.sqrt(n);j++)
                {
                 if(n%j==0)
                 {
                     c=1;
                 }
                 
                }
                if(c==1)
                {
                    System.out.println("Not prime");
                }
                else
                 {
                     System.out.println("Prime");
                 }
            }
            else
            {
                System.out.println("Not prime");
            }
        }
    }
}



