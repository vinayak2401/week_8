import java.util.*;
class ArrayListDemo{
  public static void main(String args[]){
    // List list=new ArrayList();
    // list.add(799);
    // list.add("Vinayak");
    // list.add("37.6f");
    // System.out.println(list);
    Scanner s=new Scanner(System.in);
    List<String> list=new ArrayList();
    list.add(s.next());
    list.add(s.next());
    list.add(s.next());
    
    for(Object obj:list){
      System.out.println(obj);
    }
  }
}