/*Create a class called "Rectangle" with attributes "length" and "width". Create an ArrayList of Rectangle objects and add 4 rectangles to it. Print the length and width of each rectangle. Calculate and print the area of each rectangle.*/
import java.util.*;
class Rectangle{
  double length,width;
  Rectangle(double length,double width){
    this.length=length;
    this.width=width;
  }
  double calculateArea(){
    return length*width;
  }
}
class RectangleDemo{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    ArrayList<Rectangle> rect=new ArrayList();
    for(int i=0;i<4;i++){
      System.out.println("Enter values for rectangle "+(i+1)+" :");
      System.out.println("Enter length: ");
      double length=s.nextDouble();
      System.out.println("Enter width: ");
      double width=s.nextDouble();
      rect.add(new Rectangle(length,width));
    }
    for(Rectangle rectangle:rect){
      System.out.println("Area is: "+rectangle.calculateArea());
    }
  }
}