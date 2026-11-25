package Basic;

import java.util.Scanner;

public class NoOfSquares {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        double number=sc.nextDouble();
        System.out.println("no of squares is: ");
        double numberofsquares=number*number;
        System.out.println(numberofsquares);
    }
    
}
