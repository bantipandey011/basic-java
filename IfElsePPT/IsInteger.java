package IfElsePPT;

import java.util.Scanner;

public class IsInteger {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        double n=sc.nextDouble();
        int x=(int)n;
        System.out.println(x);
        if(n-x==0){
            System.out.println("is an integer");
        }
        else{
            System.out.println("is it not integer");
        }
        
       

    }
}
