package Loops;

import java.util.Scanner;

public class PrimeNumber3 {
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
        if(n==1 || n==0){
            System.out.println("neither prime nor composite ");
        }
        else if(flag==false){
            System.out.println("composite number");
        }
        else if(flag==true){
            System.out.println("prime number");
        }
        
    }
    
}
