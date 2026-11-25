package MultiDimensionalArrays;

public class OutputOf_2DArrays3 {
    public static void main(String[] args) {
        // int[][]arr=new int[3][4];
        int[][]arr={{6,4,3,7},{8,2,7,8},{5,9,4,7}};
         System.out.println(arr.length+" "+arr[0].length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }

    }
    
}
