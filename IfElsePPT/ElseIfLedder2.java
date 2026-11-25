package IfElsePPT;

import java.util.Scanner;

public class ElseIfLedder2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter anumber: ");
        int n=sc.nextInt();
         if(n%5==0 && n%3==0){
            System.out.println("yes number is divisible by 5 and 3");
        }
        else if(n%5==0){
            System.out.println("yes number is divisible by 5");
        }
        else if(n%3==0){
            System.out.println("yes number is divisible by 3");
        }
        else{
            System.out.println("yes no is not divisible by both");
        }
}
}