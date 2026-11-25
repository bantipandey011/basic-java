package Arrays;

public class MinElement2 {
     public static void main(String[] args) {
        int[]arr={7,6,-5,23,-45,78,96,0,1,-98};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min) min=arr[i];

        }
        System.out.println(min);
        

    }
    
}
