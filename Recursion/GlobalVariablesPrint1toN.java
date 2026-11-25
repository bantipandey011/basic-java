package Recursion;

import java.util.Scanner;

public class GlobalVariablesPrint1toN {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        print(1);

    }
    public static void print(int x){
        if(x>n) return;
        System.out.println(x+" ");  //print number 1toN
        print(x+1);
        System.out.println(x+" ");  //print number Nto1

    }
    
}
