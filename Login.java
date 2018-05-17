import java.util.Scanner;
import java.io.*;
public class Login {

    Scanner login,fileScan ;
    File file ;
    public Login()
    {
      login = new Scanner(System.in);
      file = new File("login.csv");
    }
    public boolean login()
    {

    String user="", pass="",userT="",passT="";
    System.out.println("===============Welcome to ABC Cineplex===============\n\tPlease enter your credentials.\n");
    System.out.println("Enter your username: ");
    user = login.nextLine();

    System.out.println("Enter your password: ");
    pass = login.nextLine();
      try {
        fileScan = new Scanner(file);
        fileScan.useDelimiter(",");
        String str="";
        // Check if there is another line of input
        while(fileScan.hasNext()){
            userT = fileScan.next();
            passT=fileScan.next();
        }

      } catch (IOException  exp) {
        // TODO Auto-generated catch block
        exp.printStackTrace();
      }

    if(user.equals(userT) && (pass.equals(passT))) {
      //System.out.println("Welcome to JMoSS");
      return true;
    } else {
      System.out.println("You have entered the wrong details.");
      return false;
    }

  }
}