package Arrays;

import java.util.ArrayList;

public class ArrayListInJavaBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(56);
        arr.add(45);
        arr.add(23);
        arr.add(9);
        arr.add(12);
        System.out.println(arr.get(2));
        arr.set(3, 90);
        System.out.println(arr);
        // method1--by for loop
        int n=arr.size();
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println(" ");
        // method2-- by for each loop
        for(int ele:arr){
            System.out.print(ele+" ");
           
        }
        System.out.println("");
        arr.add(78);
        System.out.println(arr);
        arr.add(1, 100);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.remove(arr.size()-1);
        System.out.println(arr);
        

    }
    
}
