package PatternPrinting;

import java.util.Scanner;

public class Basic2 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of rows: ");
        int rows=sc.nextInt();
        // System.out.println("number of columns: ");
        // int columns=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for (int j=1;j<=rows;j++){
            System.out.print(" * ");
        }
       
            System.out.println();
        }
    }
    
}
