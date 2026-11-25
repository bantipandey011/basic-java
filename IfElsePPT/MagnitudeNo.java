package IfElsePPT;

import java.util.Scanner;
//question--Take Integer Input And Tells If Its magnitude is smaller than 69 or not and print magnitude value in to integer value

public class MagnitudeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number : ");
        int n=sc.nextInt();
        int x=(int)-n;
        System.out.println(x);
        if(n>-69 && n<69)
        System.out.println("true");
    
    else 
        System.out.println("false");
    }
    
}
