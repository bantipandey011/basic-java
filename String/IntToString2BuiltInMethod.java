package String;

import java.util.Scanner;

public class IntToString2BuiltInMethod {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);  // Built in method conversion of int to string
        System.out.println(s);
    }
    
}
