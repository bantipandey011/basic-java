package Loops;

import java.util.Scanner;

public class PowerLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a is: ");
        int a=sc.nextInt();
        System.out.println("enter value of b is: ");
        int b=sc.nextInt();
        int power=1;
        for(int i=1;i<=b;i++){
            power=power*a;
        }
        System.out.println(a+" raised to the power "+b+" is "+power);
    }
    
}
