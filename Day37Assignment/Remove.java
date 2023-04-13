/*Write a Java program to remove a key-value pair from a Map.*/
import java.util.HashMap;
import java.util.Map;

 class MapExample {
    public static void main(String[] args) {
       
        Map<String, Integer> myMap = new HashMap<>();

   
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        
        String keyToRemove = "banana";
        Integer removedValue = myMap.remove(keyToRemove);

        
        if (removedValue != null) {
            System.out.println("Removed key-value pair: (" + keyToRemove + ", " + removedValue + ")");
        } else {
            System.out.println("No key-value pair was removed.");
        }

    
        System.out.println("Updated HashMap: " + myMap);
    }
}
