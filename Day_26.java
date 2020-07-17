import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        int day=sc.nextInt();
        int mon=sc.nextInt();
        int yea=sc.nextInt();
        int fine=0;
        if(d<=day)
        {
            if(m<=mon)
            {
                if(y<=yea)
                {
                   fine=0;
                }
                else
                {
                    fine=10000;
                }
            }
            else if(m>mon)
            {
                if(y==yea){
                fine=500*Math.abs((mon-m));
                }
                else if(y>yea)
                {
                    fine=10000;
                }
            }
        }
        else if(d>day)
        {
            if(m==mon)
            {
                if(y==yea){
                fine=15*Math.abs((day-d));
                }
                else if(y>yea)
                {
                    fine=10000;
                }
            }
            else if(m>mon)
            {
                if(y==yea){
                fine=500*Math.abs((mon-m));
                }
                else if(y>yea)
                {
                    fine=10000;
                }
            }

        }
        System.out.println(fine);
    }
}
