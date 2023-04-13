import java.util.*;
class Sorting{
  public static void main(String args[]){
    List<Integer> list=new ArrayList<Integer>();
   
    list.add(34);
    list.add(90);
     list.add(12);
     System.out.println(list);
    Collections.sort(list);
     System.out.println(list);
  }
}