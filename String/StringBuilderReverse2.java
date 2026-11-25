package String;

public class StringBuilderReverse2 {
    public static void main(String[] args) {
        String s="banti";
        java.lang.StringBuilder sb=new java.lang.StringBuilder(s);
        System.out.println(sb);
        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            char temp1=sb.charAt(i);
            char temp2=sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);
            i++;
            j--;
        }
        System.out.println(sb);

    }
    
}
