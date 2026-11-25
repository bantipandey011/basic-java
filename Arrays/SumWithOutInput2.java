package Arrays;

public class SumWithOutInput2 {
    public static void main(String[] args) {
        int[]arr={12,56,-45,36,28};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("sum of all numbers"+" "+sum);

    }
    
}
