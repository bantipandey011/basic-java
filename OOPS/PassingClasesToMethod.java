package OOPS;

public class PassingClasesToMethod {
    public static class car{
        int seats=5;
        String name="kia sonet";
        String type="suv";
        double length=3.99;
        int torque=178;
        void print(){
            System.out.println(name+" "+seats+" "+type+" "+length);
        }
    }
    public static void main(String[] args) {
        car c=new car();
        c.print();
        change(c);
       System.out.println(c.torque);
        c.print();


    }
    public static void change(car c){
        c.seats=4;

    }
    
}
