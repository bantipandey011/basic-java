package OOPS;

public class Polymorphism {
    public static class dog{
        void speak(){
            System.out.println("bhav bhav");
        }
    }
    public static class cat{
        void speak(){
            System.out.println("meow meow");
        }
    }
    public static class lion{
        void speak(){
            System.out.println("umm umm");
        }
    }
    public static class pikachu{
        void speak(){
            System.out.println("pika pika");
        }
    }
    public static class human{
        void speak(){
            System.out.println("hello pandey ji");
        }
    }
    public static void main(String[] args) {
        dog d=new dog();
        cat c=new cat();
        lion l=new lion();
        pikachu p=new pikachu();
        human h=new human();
        d.speak();
        h.speak();
        p.speak();
        c.speak();
        l.speak();
    }
    
}
