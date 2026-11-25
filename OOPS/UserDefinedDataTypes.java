package OOPS;

public class UserDefinedDataTypes {
    public static class baccha{
        String name;
        int rollno;
        double cgpa;
        }
    public static void main(String[] args) {
        baccha s1=new baccha();
        s1.name="ram";
        s1.rollno=23;
        s1.cgpa=7.45;

        baccha s2=new baccha();
        s2.name="banti";
        s2.rollno=33;
        s2.cgpa=9.45;
        System.out.println(s1.name+" "+ s1.rollno+" "+ s1.cgpa);
        s2.cgpa=8.63;
        System.out.println(s2.cgpa);

        
    }
    
}
