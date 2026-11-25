package Methods;

import java.util.Scanner;

public class PermutationandCombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        System.out.println("enter r: ");
        int r=sc.nextInt();
        int nFact=1;
        for(int i=1;i<=n;i++){
            nFact=nFact*i;
        }
        int rFact=1;
        for(int i=1;i<=r;i++){
            rFact=rFact*i;
        }
        int nrFact=1;
        for(int i=1;i<=n-r;i++){
            nrFact=nrFact*i;
        }
        int nCr=nFact/(rFact*nrFact);
        System.out.println(nCr);
        
    }
   
}
