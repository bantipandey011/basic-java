package IfElsePPT;

import java.util.Scanner;

public class TernaryBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        System.out.println((n%2==0) ?"even" :"odd");
        System.out.println(n +" "+((n%2==0) ?"even" :"odd"));

    }
    
}
