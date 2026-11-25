package Arrays;

public class OddMultiplyEvenSum {
    public static void print(int []arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
    int[]arr={2,5,7,9,1,7,-7,-2};
    print(arr);
    for(int i=0;i<arr.length;i++){
        if(i%2==1) arr[i] *=2;
        else arr[i]+=10;
    }
    print(arr);
}
}

