import java.util.*;
class Book{
  private String author,publisher;
  private int bNo;
  Book(String author,String publisher,int bNo){
    setAuthor(author);
    setPublisher(publisher);
    setBno(bNo);
    
  }
  void setAuthor(String author){
    this.author=author;
  }
  String getAuthor(){
    return author;
  }
  void setPublisher(String publisher){
    this.publisher=publisher;
  }
  String getPublisher(){
    return publisher;
  }
  void setBno(int bNo){
    this.bNo=bNo;
  }
  int getBno(){
    return bNo;
  }
}
class LibraryExample{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    ArrayList<Book> book=new ArrayList();
    for(int i=0;i<5;i++){
      book.add(new Book(s.next(),s.next(),s.nextInt()));
    }
    for(Book books:book ){
      System.out.println(books.getAuthor()+" "+books.getPublisher()+" "+books.getBno()+" ");
    }
  }
}
