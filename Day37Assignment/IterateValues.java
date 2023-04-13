/*Write a Java program to iterate over the values of a Map using the values() method.*/
import java.util.HashMap;
import java.util.Map;

 class MapExample {
    public static void main(String[] args) {
       
        Map<String, Integer> myMap = new HashMap<>();

        
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        
        for (Integer value : myMap.values()) {
            System.out.println(value);
        }
    }
}
