import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            String S=sc.next();
            String stre="";
            String stro="";
            for(int k=0;k<S.length();k++)
            {
                if(k%2==0)
                {
                    char ch=S.charAt(k);
                    stre=stre+ch;
                }
                else
                {
                    char ch=S.charAt(k);
                    stro=stro+ch;
                }
            }
            System.out.println(stre+" "+stro);
        }
    }
}
