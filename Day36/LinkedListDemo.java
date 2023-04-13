import java.util.LinkedList;

 class Extract {
    public static void main(String[] args) {
        
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        
        LinkedList<Integer> portion = new LinkedList<>(numbers.subList(1, 4));

        
        System.out.println("Original ArrayList: " + numbers);
        System.out.println("Extracted portion: " + portion);
    }
}
