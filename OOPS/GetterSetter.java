package OOPS;
class stu{
    String name;
    private int rollno;
    double cgpa;
    void print(){ //getter
        System.out.println(name+" "+cgpa+" "+rollno);
    }
    int getrollno(){
        return rollno;
    }
    void setrollno(int x){
        rollno=x;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        stu s1=new stu();
        s1.cgpa=8.7;
        s1.name="ram";
        s1.setrollno(45);
        System.out.println(s1.name+" "+s1.cgpa+" "+s1.getrollno());
    }
    
}
