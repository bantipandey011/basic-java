package Loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        int i;
        for(i=2;i<=3*n-1;i=i+3){
            System.out.println(i);
        }

    }
    
}
