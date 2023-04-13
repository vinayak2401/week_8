import java.util.PriorityQueue;

 class Extract {
    public static void main(String[] args) {
        
        PriorityQueue<String> queue = new PriorityQueue();
        queue.add("Hello");
        queue.add("You");
        queue.add("Greet");
        queue.add("Welcome");
        queue.add("Brand");

        
      // PriorityQueue<Integer> portion = new PriorityQueue<>(numbers.subList(1, 4));

        
        System.out.println("Original ArrayList: " + queue);
        //System.out.println("Extracted portion: " + portion);
    }
}
