package Loops;

import java.util.Scanner;

public class CountDigitnew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        if(n==0) n=1;
        int count=0;
        while(n!=0){
            n=n/10;
            System.out.println(n);
            count++;
        }
        System.out.println("this number is " + count + " digit number");

    }
    
    
}
