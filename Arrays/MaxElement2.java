package Arrays;

public class MaxElement2 {
    public static void main(String[] args) {
        int[]arr={7,6,-5,23,-45,78,96};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];

        }
        System.out.println(max);
        

    }
    
}
