import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	public static int getHeight(Node root){
      //Write your code here
      int hl=0;
      int hr=0;
      if(root.left!= null)
      {
          hl=getHeight(root.left)+1;
      }
      if(root.right!= null)
      {
          hr=getHeight(root.right)+1;
      }
      return (hl>hr?hl:hr);
    }

	public static Node insert(Node root,int data){
