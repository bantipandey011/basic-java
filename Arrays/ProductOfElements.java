package Arrays;

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args) {
        //input lene ke liye
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //output product of elements
        int product=1;
        for (int i = 0; i < n; i++) {
            product=product*arr[i];
        }
        System.out.println("product of numbers"+" "+product);
        
    }
    
}
