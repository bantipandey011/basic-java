package IfElsePPT;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number: ");
        int a=sc.nextInt();
        System.out.println("enter a second number: ");
        int b=sc.nextInt();
        System.out.println("enter a third number: ");
        int c=sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("yes its side of triangle");
        }
        else{
            System.out.println("its not sides of triangle");
        }
    }
    
}
