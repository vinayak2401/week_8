/*Write a Java program to iterate over the key-value pairs of a Map using the entrySet() method.*/
import java.util.HashMap;
import java.util.Map;

class MapExample {
    public static void main(String[] args) {
      
        Map<String, Integer> myMap = new HashMap<>();

      
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

       
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
