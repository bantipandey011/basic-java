package Basic;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number: ");
        int x=sc.nextInt();
        System.out.println("enter a second number: ");
        int y=sc.nextInt();
        System.out.println("enter a third number: ");
        int z=sc.nextInt();
        System.out.print("sum of all nunmers: ");
        System.out.println(x+y+z);
    }
    
}
