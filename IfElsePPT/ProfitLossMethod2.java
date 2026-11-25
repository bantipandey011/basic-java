package IfElsePPT;

import java.util.Scanner;

public class ProfitLossMethod2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a cost prize: ");
        int cp=sc.nextInt();
        System.out.println("enter a selling prize: ");
        int sp=sc.nextInt();
        if (sp>cp){
            System.out.println("profit is = "+(sp-cp));
        }
        else if(sp==cp){
            System.out.println("no loss no profit");
        }
        else{
            System.out.println("loss is = "+(cp-sp));
        }
    }

    
}
