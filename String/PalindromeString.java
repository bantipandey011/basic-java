package String;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("enter input-->");
      String str=sc.next();
      int i=0;
      int j=str.length()-1;
      while(i<=j){
        if(str.charAt(i)!=str.charAt(j)){
            System.out.println("it is not palindrome");
           break;
        }
        else{
            System.out.println("its palindrome");
            break;

        }
        
      }
       
}
}