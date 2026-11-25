package Arrays;

public class MinElement {
     public static void main(String[] args) {
        int[]arr={7,6,-5,23,-45,78,96,-78};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];

        }
        System.out.println(min);
        

    }
    
}
