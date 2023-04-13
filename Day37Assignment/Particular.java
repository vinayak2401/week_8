/*Write a Java program to check if a particular key is present in a Map.*/
import java.util.HashMap;
import java.util.Map;

 class MapExample {
    public static void main(String[] args) {
       
        Map<String, Integer> myMap = new HashMap<>();

        
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);


        String keyToCheck = "banana";
        boolean isPresent = myMap.containsKey(keyToCheck);

       
        if (isPresent) {
            System.out.println("Key '" + keyToCheck + "' is present in the HashMap.");
        } else {
            System.out.println("Key '" + keyToCheck + "' is not present in the HashMap.");
        }
    }
}
