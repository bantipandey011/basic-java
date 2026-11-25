package MultiDimensionalArrays;

public class PrintUsingForEachLoop {
    public static void main(String[] args) {
        int[][]arr={{5,6,7,8},{3,7,9,1},{3,7,5,9}};
        for(int i=0;i<arr.length;i++){
            for(int ele:arr[i]){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    
}
}