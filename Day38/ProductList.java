import java.util.*;

class Product {
  private String name;
  private double price;

  Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

}

class Main {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList();
    int choice;
    do {
      System.out.println("Enter 1 to add product");
      System.out.println("Enter 2 to remove product");
      System.out.println("Enter 3 to exit");
      System.out.print("Enter your choice: ");
      choice = s.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter product name:");
          String name = s.next();
          System.out.println("Enter product price:");
          double price = s.nextDouble();
          products.add(new Product(name, price));
          System.out.println("Product added successfully");
          break;
        case 2:
          if (products.size() == 0) {
            System.out.println("No products to remove.");
          }else{
            System.out.println("Enter product name to remove");
            String productName=s.next();
          }
        case 3:
          System.out.println("Exiting program...");
          break;

        default:
          System.out.println("Invalid choice. Try again.");
          break;
      }

    } while (choice != 3);

  }

}
