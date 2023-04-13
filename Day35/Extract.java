import java.util.ArrayList;

 class Extract {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        
        ArrayList<Integer> portion = new ArrayList<>(numbers.subList(1, 4));

        
        System.out.println("Original ArrayList: " + numbers);
        System.out.println("Extracted portion: " + portion);
    }
}
