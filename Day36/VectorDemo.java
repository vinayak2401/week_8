import java.util.Vector;

 class Extract {
    public static void main(String[] args) {
        
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        
        Vector<Integer> portion = new Vector<>(numbers.subList(1, 4));

        
        System.out.println("Original ArrayList: " + numbers);
        System.out.println("Extracted portion: " + portion);
    }
}
