package String;

public class BuiltInMethod2 {
    public static void main(String[] args) {
        String s="harshita";
        System.out.println(s.contains("harsh"));
        if(s.contains("arsh")){
            System.out.println("happy");
        }
        System.out.println(s.contains("harsha"));
        System.out.println(s.startsWith("harsh"));
        System.out.println(s.startsWith("arsh"));
        System.out.println(s.endsWith("ita"));
        System.out.println(s.endsWith("ars"));
        s.toUpperCase();
        System.out.println(s);
        s=s.toUpperCase();
        System.out.println(s);
    }
    
}
