package String;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder s=new  java.lang.StringBuilder("raghav");  //isko empty rakh sakte hi or isme ham koi bhi value bhi daal sakte hi or string bhi
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.append("garg");
        System.out.println(s);
         System.out.println(s.length()+" "+s.capacity());
         System.out.println(s);
         s.setCharAt(1, 'v');
         System.out.println(s);
         s.delete(0, 2);
         System.out.println(s);
         s.deleteCharAt(0);
         System.out.println(s);
         String t=s.toString();
         System.out.println(t);
         s.append("hisdgehfjefojff");
         System.out.println(s.length()+" "+s.capacity());
         s.append("t");
         System.out.println(s.length()+" "+s.capacity());
         s.append("fhsdgeudfsgfw");
         System.out.println(s.length()+" "+s.capacity());
         System.out.println(s);
         System.out.println(t);

    }
    
}
