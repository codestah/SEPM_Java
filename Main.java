public class Main
{
  
  Scanner loginInput = new Scanner(System.in);
  Scanner mainMenuOption = new Scanner(System.in);
  Scanner searchMenuOption = new Scanner(System.in);
  Scanner bookingMenuOption = new Scanner(System.in);

  
  public static string login() {
    string id;
    
    System.out.println("Movie Plaze Theatre Booking System");
    System.out.println("-------------------------\n");
    System.out.println("Enter User ID to Login.");
    System.out.println("\n");
    
    
    System.out.print("Enter User ID: ");
    
    id = loginInput; // Enter Login Logic here
    return mainMenu();
  }
  
  public static int mainMenu() {

          int menuNumber = 0;

          System.out.println("Main Menu");
          System.out.println("-------------------------\n");
          System.out.println("1. Display Movie Sessions By Cinema");
          System.out.println("2. Display Movie Sessions By Movie Title");
          System.out.println("3. Search");
          System.out.println("4. Bookings");
          System.out.println("5. Exit");

          System.out.print("Enter Menu Number: ");
	        menuNumber = select.nextInt();
          return menuNumber; 
    
    if(menuNumber==1)
	    {
        System.out.println("Display Movie Sessions By Cinema");
        System.out.println("----------------------------------\n");
      }
    
    if(menuNumber==2)
	    {
        System.out.println("Display Movie Sessions By Movie Title");
        System.out.println("----------------------------------\n");
      }
    
    if(menuNumber==3)
	    {
        int searchMenu;
  
        System.out.println("Search");
        System.out.println("----------------------------------\n");
        System.out.println("1. Search By Movie Title");
        System.out.println("2. Search By Cinema");
        System.out.println("3. Back");
        System.out.println("4. Exit");
        System.out.println("\n");
    
        System.out.print("Enter Menu Number: ");
    
        searchMenu = searchMenuOption;
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
      } // End Menu Number 3
    
    if(menuNumber==4)
	    {
        int bookingMenu;
  
        System.out.println("Bookings");
        System.out.println("----------------------------------\n");
        System.out.println("1. Create a Booking");
        System.out.println("2. Delete a Booking");
        System.out.println("3. Back");
        System.out.println("4. Exit");
        System.out.println("\n");
    
        System.out.print("Enter Menu Number: ");
    
        bookingMenu = bookingMenuOption;
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
      } // End Menu Number 4 
    } // End Main Menu
} // End Class


