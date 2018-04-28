import java.util.Scanner;
public class Main
{
 
  public static int login() {
    int id = 0;
    Scanner loginInput = new Scanner(System.in);
    System.out.println("Movie Plaze Theatre Booking System");
    System.out.println("-------------------------\n");
    System.out.println("Enter User ID to Login.");
    System.out.println("\n");
    
    
    System.out.print("Enter User ID: ");
    
    id = loginInput.nextInt(); // Enter Login Logic here
    return mainMenu();
  }
  
  public static int mainMenu() {

          int menuNumber = 0;
					Scanner mainMenuOption = new Scanner(System.in);
          System.out.println("Main Menu");
          System.out.println("-------------------------\n");
          System.out.println("1. Display Movie Sessions By Cinema");
          System.out.println("2. Display Movie Sessions By Movie Title");
          System.out.println("3. Search");
          System.out.println("4. Bookings");
          System.out.println("5. Exit");

          System.out.print("Enter Menu Number: ");
	        menuNumber = mainMenuOption.nextInt();
          return menuNumber; 
    
    switch(menuNumber)
    {
      case 1: System.out.println("Display Movie Sessions By Cinema");
        System.out.println("----------------------------------");
        break;
      case 2: System.out.println("Display Movie Sessions By Movie Title");
        System.out.println("----------------------------------");
        break;
      case 3: int searchMenu = 0;
  			Scanner searchMenuOption = new Scanner(System.in);
        System.out.println("Search");
        System.out.println("----------------------------------\n");
        System.out.println("1. Search By Movie Title");
        System.out.println("2. Search By Cinema");
        System.out.println("3. Back");
        System.out.println("4. Exit");
        System.out.println("\n");
    
        System.out.print("Enter Menu Number: ");
    
        searchMenu = searchMenuOption.nextInt();
        return searchMenu;
      
        if (searchMenu==1)
        {
          System.out.println("Search By Movie Title");
          System.out.println("----------------------------------\n");
        }

        if (searchMenu==2)
        {
          System.out.println("Search By Cinema");
          System.out.println("----------------------------------\n");
        }
      
        break;
      case 4:  int bookingMenu = 0;
  			Scanner bookingMenuOption = new Scanner(System.in);
        System.out.println("Bookings");
        System.out.println("----------------------------------\n");
        System.out.println("1. Create a Booking");
        System.out.println("2. Delete a Booking");
        System.out.println("3. Back");
        System.out.println("4. Exit");
        System.out.println("\n");
    
        System.out.print("Enter Menu Number: ");
    
				bookingMenu=bookingMenuOption.nextInt();
        return bookingMenu;
      
        if (bookingMenu==1)
        {
          System.out.println("Create a Booking");
          System.out.println("----------------------------------\n");
        }

        if (bookingMenu==2)
        {
          System.out.println("Delete a Booking");
          System.out.println("----------------------------------\n");
        }
      
        break;
    }
    } // End Main Menu
} // End Class


