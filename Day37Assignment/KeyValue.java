/*Write a Java program to create a HashMap and add key-value pairs to it.*/
import java.util.HashMap;

class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<String, Integer> myMap = new HashMap<>();

       
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);

        
        System.out.println(myMap);
    }
}
