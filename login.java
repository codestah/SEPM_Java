import java.util.Scanner;

public class Login {
  public static void main(String[] args) {
    Scanner login = new Scanner(System.in);
    
    String user, pass;
    
    System.out.print("Enter your username: ");
    user = input.nextLine();
    
    System.out.print("Enter your password: ");
    pass = input.nextLine();
    
    if(user.equals("admin") && (pass.equals("password"))) {
      System.out.println("Welcome to JMoSS");   
    } else {
      System.out.println("You have entered the wrong details. Please try again.")
    }

  }
}