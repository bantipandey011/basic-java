package String;

public class StringBasic {
    public static void main(String[] args) {
        char[]arr={'r','a','g','h','a','v'};
        System.out.println(arr[2]);
        char[]a={'r','a','g','h','a','v'};
        for(int ele:a) {                     //print ascaii value in given string
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        for(char ele:a){                    //print priya in type casting method
            System.out.print(ele+" ");
        }

    }
    
}
