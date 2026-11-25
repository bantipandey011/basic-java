package Arrays;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[]x={10,30,5,78,45};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[]x) {
        x[2]=99;
        
    }
    
}
