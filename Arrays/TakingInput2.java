package Arrays;

import java.util.Scanner;

public class TakingInput2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values: ");
         
        int[]karan=new int[7];
         int n=karan.length;
       
        //input
        for(int i=0;i<n;i++){
            karan [i]=sc.nextInt();
        }
        //print
        for(int i=0;i<n;i++){
            System.out.print(karan[i]+" ");
        }
    }
    
}
