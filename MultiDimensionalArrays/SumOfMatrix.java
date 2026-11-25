package MultiDimensionalArrays;

public class SumOfMatrix {
    public static void main(String[] args) {
        int[][]arr={{4,5,6,7,4},{3,5,7,7,8},{4,5,5,7,8}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("the sum of matrix is:"+sum);
    }
    
}
