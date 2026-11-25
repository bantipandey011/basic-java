package IfElsePPT;

import java.util.Scanner;

public class NoIsDivisibleBY5or3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.println("yes it is divisible");
        }
        else{
            System.out.println("no it is not divisible");
        }
    }
    
}
