package MultiDimensionalArrays;

public class TransposeOfMatrix {
    private static void print(int[][]arr){
        for(int[]a:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][]arr={{5,7,9,3},{5,8,2,5},{1,7,9,4},{4,9,7,2}};
        print(arr);
        //transpose
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }

        }
        print(arr);
        
    }
    
}
