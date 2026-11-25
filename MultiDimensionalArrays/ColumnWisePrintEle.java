package MultiDimensionalArrays;

public class ColumnWisePrintEle {
    public static void main(String[] args) {
        int[][]arr={{2,8,3,7,4},{101,2,1,6,3},{5,5,404,1,4},{3,1,8,2,6}};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][0]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][1]+" ");
        }                                                           //using  without loop
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][2]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][3]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][4]+" ");
        }
        System.out.println();
    }
     
    }

