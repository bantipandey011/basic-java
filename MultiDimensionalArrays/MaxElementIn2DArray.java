package MultiDimensionalArrays;

public class MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][]arr={{4,5,8,9},{4,8,89,3},{6,8,107,34}};
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("max element is:"+max);
    }
    
}
