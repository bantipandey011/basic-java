package Arrays;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[]arr={12,3,27,53,18,62,88,6,53};
        int target=18;
        boolean flag=false; //false means target array me nahi hai
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("target exist in array at index "+ i);
                flag=true; //true means target array me hai
                break;
            }
        }
        if(flag==false){
         System.out.println("target missing in array");


        }
    }
      
    
}
