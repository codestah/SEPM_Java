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
    	 int totalAttempts = 3;
    	 
    String user="", pass="",userT="",passT="";
    System.out.println("===============Welcome to ABC Cineplex===============\n\tPlease enter your credentials.\n");
    
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
      
      do {
    	  
      System.out.println("Enter your username: ");
      user = login.nextLine();

      System.out.println("Enter your password: ");
      pass = login.nextLine();
      
    if(user.equals(userT) && (pass.equals(passT))) {
      //System.out.println("Welcome to JMoSS");
      return true;
      
    } else {
    	 totalAttempts--;
    	 
    if (totalAttempts>0)
      System.out.println("You have entered the wrong details.");
    else 
    	System.out.println("Total Attempts Exceeded");
      
    }
      }
    while(totalAttempts>0); 
      
    return false; 
      }
}

    	 
    	

