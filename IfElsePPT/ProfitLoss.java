package IfElsePPT;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a cost prize: ");
        int cp=sc.nextInt();
        System.out.println("enter a selling prize: ");
        int sp=sc.nextInt();
        if (sp>cp){
            System.out.println("profit is = "+(sp-cp));
        }
        if(sp==cp){
            System.out.println("no loss no profit");
        }
        if(cp>sp){
            System.out.println("loss is = "+(cp-sp));
        }
    }
    
}
