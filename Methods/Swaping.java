package Methods;

import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a: ");
        int a=sc.nextInt();
        System.out.println("enter b: ");
        int b=sc.nextInt();System.out.println(a +" previous "+ b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a + " after "+ b);
    }
    
}
