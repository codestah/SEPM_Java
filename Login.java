import java.util.Scanner;

public class Login {

    Scanner login ;
    File file ;
    public Login()
    {
      login = new Scanner(System.in);
      file = new File("login.csv");
    }
    void Login()
    {

    String user, pass,userT,passT;

    System.out.println("Enter your username: ");
    user = input.nextLine();

    System.out.println("Enter your password: ");
    pass = input.nextLine();
      try {
        sc = new Scanner(file);
        sc.useDelimiter(",");
        // Check if there is another line of input
        while(sc.hasNextLine()){
          String str = sc.nextLine();
          while (sc.hasNext())
          {
            userT=sc.next();
            passT=sc.next();
          }
        }

      } catch (IOException  exp) {
        // TODO Auto-generated catch block
        exp.printStackTrace();
      }
    
    if(user.equals(userT) && (pass.equals(passT))) {
      System.out.println("Welcome to JMoSS");  
     getMenu();
    } else {
      System.out.println("You have entered the wrong details. Please try again.")
    }

  }
}