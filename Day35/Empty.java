import java.util.*;
 class Empty {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        
        System.out.println("Original ArrayList: " + fruits);

    
        fruits.clear();

        
        System.out.println("Modified ArrayList: " + fruits);
    }
}
