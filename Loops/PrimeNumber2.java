package Loops;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        boolean flag=true;// true means prime
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                flag=false; //false composite number
                break;
            }
        }
        if(flag==false){
            System.out.println("composite number");
        }
        if(flag==true){
            System.out.println("prime number");
        }
        
    }
    
}
