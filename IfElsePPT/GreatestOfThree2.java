package IfElsePPT;

import java.util.Scanner;

public class GreatestOfThree2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first no ");
        int a=sc.nextInt();
        System.out.println("enter a second no ");
        int b=sc.nextInt();
        System.out.println("enter a third no ");
        int c=sc.nextInt();
        if(a>b){
            if(a>c)
            System.out.println(a);
            else
                System.out.println(c);
        }
        else{
            if(b>=c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

        }


        }
    

