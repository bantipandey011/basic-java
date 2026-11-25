package Loops;

public class OddNoDivisibleBy3 {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=100;i++){
            if(i%3==0 && i%2==1){
                System.out.println(i);
            }
        }
    }
    
}
