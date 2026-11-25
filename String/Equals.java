package String;

public class Equals {
    public static void main(String[] args) {
        String s1="raghav";
        String s2="raghav";
        System.out.println(s1==s2);
        String s3="raghav";
        String s4=new String("raghav");
        System.out.println(s3==s4);
        String s5=new String("raghav");
        String s6=new String("raghav");
        System.out.println(s5==s6);
        System.out.println(s1.charAt(0)==s2.charAt(0)); // because yha par character check ho rahe hi
    }
    
}
