package OOPS;
class baccha{                 //abb isse iss foldet ke andar kahi bhi access kar sakte hi abb isse package ke andar export kiya hi
        String name;
        int rollno;
        double cgpa;
        }

public class UserDefinedDataTypes2 {
    public static void main(String[] args) {
        UserDefinedDataTypes.baccha s1=new UserDefinedDataTypes.baccha();
        s1.name="ram";
        s1.rollno=23;
        s1.cgpa=7.45;

        UserDefinedDataTypes.baccha s2=new UserDefinedDataTypes.baccha();
        s2.name="banti";
        s2.rollno=33;
        s2.cgpa=9.45;
        System.out.println(s1.name+" "+ s1.rollno+" "+ s1.cgpa);
        s2.cgpa=8.63;
        System.out.println(s2.cgpa);

        
    }
    
}
