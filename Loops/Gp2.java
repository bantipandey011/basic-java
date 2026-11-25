package Loops;

import java.util.Scanner;

public class Gp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        System.out.println("enter a: ");
        int a=sc.nextInt();
        System.out.println("enter r: ");
        int r=sc.nextInt();
        for(int i = 1; i <=n; i++){
            System.out.println(a);
            a=a*r;

            
        }
    }
    
}
