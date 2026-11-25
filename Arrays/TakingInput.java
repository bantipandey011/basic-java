package Arrays;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]karan=new int[7];
        
        //input
        for(int i=0;i<7;i++){
            karan [i]=sc.nextInt();
        }
        //print
        for(int i=0;i<7;i++){
            System.out.print(karan[i]+" ");
        }
    }
    
}
