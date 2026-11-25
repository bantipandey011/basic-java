package IfElsePPT;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first no ");
        int a=sc.nextInt();
        System.out.println("enter a second no ");
        int b=sc.nextInt();
        System.out.println("enter a third no ");
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=c && b>=a){
            System.out.println(b);
        }
        else if(c>=a && c>=b){
            System.out.println(c);
        }
        
        
    }
    
}
