package MultiDimensionalArrays;

import java.util.ArrayList;

public class ArrayListOf2DArray {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(9);a.add(8);a.add(4);a.add(2);
         ArrayList<Integer>b=new ArrayList<>();
        b.add(2);b.add(7);b.add(4);b.add(1);
         ArrayList<Integer>c=new ArrayList<>();
        c.add(3);c.add(5);c.add(1);c.add(9);
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");

            }
            System.out.println();
        }
    }
    
}
