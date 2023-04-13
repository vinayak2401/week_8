/*Write a Java program to retrieve a value from a Map using its key.*/
import java.util.HashMap;
import java.util.Map;

 class MapExample {
    public static void main(String[] args) {
        
        Map<String, Integer> myMap = new HashMap<>();

        
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        
        int value = myMap.get("banana");

       
        System.out.println("The value for key 'banana' is: " + value);
    }
}
