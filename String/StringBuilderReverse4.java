package String;

public class StringBuilderReverse4 {
    public static void main(String[] args) {
        String s="aditya";
        java.lang.StringBuilder sb=new java.lang.StringBuilder(s);
        sb.insert(1, "q");
        sb.reverse();
        s=sb.toString();
        System.out.println(s);
    }
    
}
