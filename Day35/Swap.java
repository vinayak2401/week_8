import java.util.*;

 class Swap {
    public static void main(String[] args) {
      
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Original ArrayList: " + colors);

        
        Collections.swap(colors, 1, 2);

     
        System.out.println("Modified ArrayList: " + colors);
    }
}
