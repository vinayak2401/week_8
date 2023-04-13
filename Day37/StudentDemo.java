/*Create a class called "Student" with attributes "name", "id", and "major". Create an ArrayList of Student objects and add 6 students to it. Print the name and major of each student. Change the major of one student and print the updated information.*/
import java.util.*;
class Student{
  String name;
  int id;
  Student(String name,int id){
    this.name=name;
    this.id=id;
  }
  String getname(){
    return this.name;
  }
  int getId(){
    return this.id;
  }
}
class StudentDemo{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    ArrayList<Student> stu=new ArrayList();
    for(int i=0;i<3;i++){
      System.out.println("Enter name: ");
      String name=s.next();
      System.out.println("Enter Id: ");
      int id=s.nextInt();
      stu.add(new Student(name,id));
    }
    for(Student st:stu){
      System.out.println(st.getname());
      System.out.println(st.getId());
    }
  }
}
/*
import java.util.*;

 

class Student {
    String name, major;
    int id;

 

    Student(String name, String major, int id) {
        this.name = name;
        this.major = major;
        this.id = id;
    }
}

 

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> st = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            st.add(new Student(sc.next(), sc.next(), sc.nextInt()));
        }

 

        System.out.println("befor updating");
        for (Student student : st) {
            System.out.println("name : " + student.name + "\tmajor : " + student.major);
        }

 

        for (Student student : st) {
            st.set(1, new Student(student.name, "BBB", student.id));
        }

 

        System.out.println("after updating");
        for (Student student : st) {
            System.out.println("name : " + student.name + "\tmajor : " + student.major);
        }
    }
}*/