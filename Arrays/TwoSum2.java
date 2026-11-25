package Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        System.out.println("two sum");
    
        int[]arr={2,7,11,15};
        int target=18;
        System.out.println(twosum(arr,target));
    }

    public static boolean twosum(int arr[],int target){
        int n=arr.length;
       for (int i = 0; i < n; i++) {
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==target){
                return true;
            }
        }
    }
        return false;

          
           
       } 
    }
        
    
    
