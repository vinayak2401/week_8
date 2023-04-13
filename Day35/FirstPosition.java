import java.util.*;
class FirstPosition{
  public static void main(String args[]){
    List<Integer> list=new ArrayList<Integer>();
    list.add(12);
    list.add(34);
    list.add(90);
    System.out.println(list);
    list.set(0,55);
    System.out.println(list);
    
  }
}