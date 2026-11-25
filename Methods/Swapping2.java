package Methods;

import java.util.Scanner;

public class Swapping2 {
    public static void swap(int a ,int b) {
          int temp=a;
        a=b;
        b=temp;
        System.out.println(a + " after " + b);
       
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a: ");
        int a=sc.nextInt();
        System.out.println("enter b: ");
        int b=sc.nextInt();System.out.println(a +" previous "+ b);
        swap(a, b);
        
        
    }
    
}
