package MultiDimensionalArrays;

public class MaxElementIn2DArray2 {
    public static void main(String[] args) {
        int[][]arr={{4,5,8,9},{4,8,89,3},{6,8,107,34}};
         int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }

        System.out.println("Maximum element: " + max);

    } 
}
