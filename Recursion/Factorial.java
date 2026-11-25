package Recursion;

import java.util.Scanner;

public class Factorial {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        int ans= fact(n);
        System.out.println("factorial->" +ans);
    }
    public static int fact(int n){
        if(n==0 || n==1) return 1 ;
        int ans = n * fact(n - 1);
        return ans;
    }
    
}
