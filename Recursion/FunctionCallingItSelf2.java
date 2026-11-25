package Recursion;

public class FunctionCallingItSelf2 {
    public static void main(String[] args) {
        ajay(1);
    }
    public static void ajay(int n){
        if(n==5) return;
        System.out.println("priya");
        ajay(n+1);
    }
    
}
