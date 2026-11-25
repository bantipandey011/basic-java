package Recursion;

public class FunctionCallingItSelf {
    public static void main(String[] args) {
        ajay();
    }
    public static void ajay(){
        System.out.println("priya");
        ajay();
        
    }
}
//it is infinite loop
