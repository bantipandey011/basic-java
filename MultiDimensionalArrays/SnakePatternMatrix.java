package MultiDimensionalArrays;

public class SnakePatternMatrix {
    public static void main(String[] args) {
         int[][]arr={{5,6,7,8,7},{3,7,9,1,3},{2,3,7,5,9}};
         for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
         }
    }
    
}
