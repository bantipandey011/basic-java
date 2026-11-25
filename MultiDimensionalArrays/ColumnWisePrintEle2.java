package MultiDimensionalArrays;

public class ColumnWisePrintEle2 {
    public static void main(String[] args) {
        int[][]arr={{2,8,3,7,4},{101,2,1,6,3},{5,5,404,1,4},{3,1,8,2,6}};
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }

    
}
}
