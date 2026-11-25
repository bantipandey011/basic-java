package MultiDimensionalArrays;

public class OuterLoopUsingForEach {
    public static void main(String[] args) {
        int[][]arr={{5,6,7,8},{3,7,9,1},{3,7,5,9}};
        for(int[]a:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    
}
