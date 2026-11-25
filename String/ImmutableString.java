package String;

public class ImmutableString {
    public static void main(String[] args) {
       String s="Bishal";
       s=s.substring(0,3)+'m'+s.substring(4);
       System.out.println(s);

    }
    
}
