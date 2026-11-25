package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr={12,3,27,53,18,62,88,6,53};
        int target=18;
        boolean flag=false; //false means target array me nahi hai
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true; //true means target array me hai
                break;
            }
        }
        if(flag==true){
         System.out.println("target existing in array");


        }
        else{ System.out.println("target missing in array");}
        

}

    
}
