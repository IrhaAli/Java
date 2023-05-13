import java.util.Scanner;

class helloWorld {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

class inputProgram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = input.next();

    System.out.print("Enter your lasat name: ");
    String lasttName = input.next();

    System.out.println("Your Full Name is " + firstName + " " + lasttName);
  }
}