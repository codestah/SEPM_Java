import java.awt.Toolkit;
public class BookingClerk extends Employee {
  
  public BookingClerk () {
    // Allows no-arg constructor to be called when creating a booking clerk
  }
  
  public BookingClerk(String username, String password) {
    super(username, password);
  }
  
  @Override
  public void getMenu() {
          int menuNumber = 0;
					Scanner mainMenuOption = new Scanner(System.in);
          System.out.println("Main Menu");
          System.out.println("-------------------------\n");
          System.out.println("1. Search Movie Sessions By Cinema");
          System.out.println("2. Search Movie Sessions By Movie Title");
          System.out.println("3. Bookings");
          System.out.println("4. Exit");
          System.out.println("\n");
          System.out.print("Enter Menu Number: ");
	        menuNumber = mainMenuOption.nextInt();
           
    switch(menuNumber)
    {
      case 1: 
        Scanner searchByCinemaMenuOption = new Scanner(System.in);
        int cinemaMenu = 0;
        System.out.println("Display Movie Sessions By Cinema");
        System.out.println("----------------------------------\n");
        System.out.println("1. St Kilda");
        System.out.println("2. Melbourne CBD");
        System.out.println("3. Fitzroy");
        System.out.println("4. Lilydale");
        System.out.println("5. Sunbury");
        System.out.println("6. Back");
        System.out.println("7. Exit");
        System.out.println("\n");
        System.out.print("Enter Menu Number: ");
	      cinemaMenu = searchByCinemaMenuOption.nextInt();
         
        if (cinemaMenu==1)
        {
          System.out.println("All Movie Sessions at St Kilda Cinema");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Movie Sessions at St Kilda Cinema
        }
        
        if (cinemaMenu==2)
        {
          System.out.println("All Movie Sessions at Melbourne CBD Cinema");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Movie Sessions at Melbourne CBD Cinema
        }
        
        if (cinemaMenu==3)
        {
          System.out.println("All Movie Sessions at Fitzroy Cinema");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Movie Sessions at Fitzroy Cinema
        }
        
        if (cinemaMenu==4)
        {
          System.out.println("All Movie Sessions at Lilydale Cinema");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Movie Sessions at Lilydale Cinema
        }
        
        if (cinemaMenu==5)
        {
          System.out.println("All Movie Sessions at Sunbury Cinema");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Movie Sessions at Sunbury Cinema
        } 
        if (cinemaMenu==6)
        {
          public void getMenu();
        }
        
        if (cinemaMenu==7)
        {
          Toolkit tk = Toolkit.getDefaultToolkit();
          tk.beep();
        } 
        break;
        
        
        
      case 2: 
        Scanner searchByMovieMenuOption = new Scanner(System.in);
        int movieNumber = 0;
        System.out.println("Display Movie Sessions By Movie Title");
        System.out.println("----------------------------------\n");
        System.out.println("1. Black Panther");
        System.out.println("2. The Avengers");
        System.out.println("3. Guardians of the Galaxy");
        System.out.println("4. Pacific Rim: Uprising");
        System.out.println("5. Tomb Raider");
        System.out.println("6. Back");
        System.out.println("7. Exit");
        System.out.println("\n");
        System.out.print("Enter Menu Number: ");
	      movieNumber = searchByMovieMenuOption.nextInt();
        
        if (movieNumber==1)
        {
          System.out.println("All Cinema Sessions for Black Panther");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Cinema Sessions for Black Panther
        }
        
        if (movieNumber==2)
        {
          System.out.println("All Cinema Sessions for The Avengers");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Cinema Sessions for The Avengers
        }
        
        if (movieNumber==3)
        {
          System.out.println("All Cinema Sessions for Guardians of the Galaxy");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Cinema Sessions for Guardians of the Galaxy
        }
        
        if (movieNumber==4)
        {
          System.out.println("All Cinema Sessions for Pacific Rim: Uprising");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Cinema Sessions for Pacific Rim: Uprising
        }
        
        if (movieNumber==5)
        {
          System.out.println("All Cinema Sessions for Tomb Raider");
          System.out.println("----------------------------------\n");
          // Enter logic here to display: All Cinema Sessions for Tomb Raider
        }
        if (cinemaMenu==6)
        {
          public void getMenu();
        }
        
        if (cinemaMenu==7)
        {
          Toolkit tk = Toolkit.getDefaultToolkit();
          tk.beep();
        } 
        break;
        
      case 3:  
        Scanner bookingMenuOption = new Scanner(System.in);
        int bookingMenu = 0;
        System.out.println("Bookings");
        System.out.println("----------------------------------\n");
        System.out.println("1. Create a Booking");
        System.out.println("2. Delete a Booking");
        System.out.println("3. Back");
        System.out.println("4. Exit");
        System.out.println("\n");
        System.out.print("Enter Menu Number: ");
				bookingMenu = bookingMenuOption.nextInt();
        
      
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
        
        if (bookingMenu==3)
        {
          public void getMenu();
        }
        
        if (bookingMenu==4)
        {
          Toolkit tk = Toolkit.getDefaultToolkit();
          tk.beep();
        }
      
        break;
      default: System.out.println("Invalid choice. Please select a valid choice from the menu.");
    }
  }
}