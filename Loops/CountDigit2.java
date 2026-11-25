package Loops;

import java.util.Scanner;

public class CountDigit2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
System.out.println("this number is " + count + " digit number");
    }
    
}
