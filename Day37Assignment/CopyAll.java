/*Write a Java program to copy all the key-value pairs of one Map to another Map.*/
import java.util.HashMap;
import java.util.Map;

 class MapExample {
    public static void main(String[] args) {
       
        Map<String, Integer> myMap1 = new HashMap<>();

        
        myMap1.put("apple", 1);
        myMap1.put("banana", 2);
        myMap1.put("orange", 3);

        
        Map<String, Integer> myMap2 = new HashMap<>();

        
        myMap2.putAll(myMap1);

       
        System.out.println("Contents of the second HashMap:");
        for (String key : myMap2.keySet()) {
            System.out.println(key + " : " + myMap2.get(key));
        }
    }
}
