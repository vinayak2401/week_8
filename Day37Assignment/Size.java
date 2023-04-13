/*Write a Java program to get the size of a Map.*/
import java.util.HashMap;
import java.util.Map;

 class MapExample {
    public static void main(String[] args) {
      
        Map<String, Integer> myMap = new HashMap<>();

        
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        
        int size = myMap.size();

      
        System.out.println("Size of the HashMap: " + size);
    }
}
