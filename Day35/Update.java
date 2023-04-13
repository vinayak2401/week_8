import java.util.*;

 class Update{
    public static void main(String[] args) {
     
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

    
        System.out.println("Original ArrayList: " + colors);

        
        colors.set(1, "Orange");

        
        System.out.println("Modified ArrayList: " + colors);
    }
}
