import java.util.*;
class ArrayList1{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    List<Integer> list=new ArrayList();
    for(int i=0;i<5;i++){
      list.add(s.nextInt());
    }
    System.out.println("Before:");
    System.out.println(list);

  for(Integer num:list){
  if(num%2==0){
    
    System.out.print(num);
  }
  }
}
}