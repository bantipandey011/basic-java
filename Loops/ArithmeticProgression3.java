package Loops;

import java.util.Scanner;

public class ArithmeticProgression3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        System.out.println("enter a: ");
        int a=sc.nextInt();
        System.out.println("enter d: ");
        int d=sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            System.out.println(a);
            a=a+d;
        }
    }
    
}
