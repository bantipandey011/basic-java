package Recursion;

import java.util.Scanner;

public class DecreasingIncreasing2 {
     static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==1){
             System.out.println(n+" "); 
        return;
        }
        System.out.println(n+" ");
        print(n-1);
        System.out.println(n+" ");

    }
    
}
