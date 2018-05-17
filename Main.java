import java.util.Scanner;
public class Main
{
  
  public static void main(String[] args) {
    Login loginObj=new Login();
    BookingClerk clerkObj=new BookingClerk();

    if(loginObj.login())
    {
        clerkObj.getMenu();
    }
    else
    {
        System.out.println("Exiting application");
    }

  } // End Main Menu
} // End Class


