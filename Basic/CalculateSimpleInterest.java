package Basic;

import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("principle is : ");
        double p=sc.nextDouble();
        System.out.println("rate is : ");
        double r=sc.nextDouble();
        System.out.println("time is : ");
        double t=sc.nextDouble();
        System.out.println("simple interest is : ");
        double Si =(p*r*t)/100;
        System.out.println(Si);
    }
    
}
