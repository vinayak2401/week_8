import java.util.*;
class Remove{
  public static void main(String args[]){
    List<Integer> list=new ArrayList<Integer>();
    list.add(12);
    list.add(34);
    list.add(90);
     System.out.println(list);
    System.out.println(list.remove(2));
    System.out.println(list);
  }
}