package OOPS;

public class UserDefinedDataTypes3 {
     public static class student{
        String name;
        int rollno;
        double cgpa;
        void print(){
            System.out.println(name+" "+cgpa+" "+rollno+" ");
        }
        }
    public static void main(String[] args) {
        student s1=new student();
        s1.name="ram";
        s1.rollno=23;
        s1.cgpa=7.45;

        student s2=new student();
        s2.name="banti";
        s2.rollno=33;
        s2.cgpa=9.45;
        s1.print();
        System.out.println(s2.cgpa);

        
    }
    
}
