package Loops;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        int i;
        for(i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("composite numbers");
                break;
            }
        }
    }
    
}
