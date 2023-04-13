import java.util.*;
class Shuffle{
  public static void main(String args[]){
     List<Integer> list=new ArrayList<Integer>();
    list.add(12);
    list.add(34);
    list.add(90);
    list.add(33);
    list.add(11);
    Collections.shuffle(list);
    System.out.println(list);
  }
}