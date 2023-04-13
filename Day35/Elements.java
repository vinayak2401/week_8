import java.util.*;
class Elements {
  public static void main(String args[]) {
    List ls = new ArrayList();
    ls.add(12);
    ls.add("Carrots");
    ls.add("Gold");
    System.out.println(ls);
    for (Object obj : ls) {
      System.out.println(obj);
    }
  }

}