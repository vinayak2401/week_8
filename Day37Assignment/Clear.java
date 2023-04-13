/*Write a Java program to clear all the key-value pairs of a Map.*/
import java.util.HashMap;
import java.util.Map;

 class MapExample {
    public static void main(String[] args) {
        
        Map<String, Integer> myMap = new HashMap<>();

       
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        
        myMap.clear();

      
        System.out.println("Size of the HashMap after clear(): " + myMap.size());
    }
}
