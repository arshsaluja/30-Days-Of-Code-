//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> mymap=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            // Write code here
            mymap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(mymap.get(s)==null)
            {
                System.out.println("Not found");
            }
            else
            System.out.println(s+"="+mymap.get(s));
        }
        in.close();
    }
}
