import java.util.HashMap;
import java.util.Map;
class HashMapDemo{
  public static void main(String args[]){
    HashMap<Integer,String> take=new HashMap();
    take.put(100, "vinayak");
    take.put(101, "Hello");
    take.put(102, "greet");
    take.putIfAbsent(103, "Vishnu");
    
    Integer key=103;
    take.remove(101);
    System.out.println(take);
    for(Map.Entry m:take.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
      if(m.getKey()==key){
        System.out.println(m.getValue());
      }
    }
  }
}