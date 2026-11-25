package IfElsePPT;

import java.util.Scanner;


public class AreaofRectangleGreaterThanPerimeter {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length of rectangle: ");
    double length =sc.nextDouble();
    System.out.println("enter breadth of rectangle: ");
    double breadth =sc.nextDouble();
    double area=length*breadth;
    double perimeter=2*(length+breadth);
    System.out.println("area: "+area);
    System.out.println("perimeter: "+perimeter);
    if(area>perimeter){
        System.out.println("the area of rectangle is greater than its perimeter");
    }
    else if(area<perimeter){
        System.out.println("the area of rectangle is less than its perimeter");
    }
    else{
        System.out.println("the area of rectangle is equal to its perimeter");
    }
    
    }
}
