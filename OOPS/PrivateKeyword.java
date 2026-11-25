package OOPS;
class students{
    String name;
    private int rollno;
    double cgpa;
}

public class PrivateKeyword {
    public static void main(String[] args) {
        students s1=new students();
        //s1.print();
        s1.cgpa=8.9;
        s1.name="hemmant";
        System.out.println(s1.cgpa+" "+s1.name);
       // s1.rollno=76;                            its is private keywords so do not access
       // System.out.println(s1.rollno);
        
    }
    
}
