package String;

public class StringBuilderReverse3 {
    public static void main(String[] args) {
        String s="devesh";
        java.lang.StringBuilder sb=new java.lang.StringBuilder(s);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);
        sb.insert(1, 'w');
        System.out.println(sb);
        sb.delete(0, 2);
        System.out.println(sb);
    }
    
}
