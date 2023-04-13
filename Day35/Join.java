import java.util.*;

 class Join {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

       
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);

       
        ArrayList<Integer> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);

       
        System.out.println("Combined ArrayList: " + combinedList);
    }
}
