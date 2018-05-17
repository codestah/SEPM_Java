import java.util.Scanner;
public class Main
{
  
  public static void main(String[] args) {
    Login loginObj=new Login();


    if(loginObj.login())
    {
      BookingClerk clerkObj=new BookingClerk();
        clerkObj.getMenu();
    }
    else
    {
        System.out.println("Exiting application");
    }

  } // End Main Menu
} // End Class


