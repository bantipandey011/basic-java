package IfElsePPT;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("it is fout digit number ");
        }
        else{
            System.out.println("it is not fout digit number");
        }
    }
    
}
