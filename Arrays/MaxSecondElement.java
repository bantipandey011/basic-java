package Arrays;

public class MaxSecondElement {
    public static void main(String[] args) {
        int[] arr={4,10,10,6,3,9,9,8,9,11};
        int max=Integer.MIN_VALUE;
        int Smax=Integer.MIN_VALUE;
        //calculated maximum
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];


        }
        // calculate second maximum
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Smax && arr[i]!=max) Smax=arr[i];
        }
        System.out.println(max);
        System.out.println(Smax);
    }
    
}
