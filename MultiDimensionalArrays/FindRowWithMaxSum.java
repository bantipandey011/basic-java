package MultiDimensionalArrays;

public class FindRowWithMaxSum {
    public static void main(String[] args) {
        int[][]arr={{2,8,3,7,4},{7,2,1,6,3},{5,5,404,1,4},{3,1,8,2,6}};
         int maxSum = Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
             int  sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
             maxSum=Math.max(maxSum, sum);
         }
         System.out.println("max sum of row:"+(maxSum));
    }

    
}
