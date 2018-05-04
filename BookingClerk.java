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
          System.out.println("3. Create a Booking");
          System.out.println("4. Delete a Booking");
          System.out.println("5. Exit");
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
          // Enter logic to exit the system
          Toolkit tk = Toolkit.getDefaultToolkit();
          tk.beep();
        } 
        break;
        
      case 3:  
        Scanner createBookingOption = new Scanner(System.in);
        int createBookingNumber = 0;
        System.out.println("Create a Booking");
        System.out.println("----------------------------------\n");
        System.out.println("1. Enter Movie Title");
        System.out.println("2. Cancel this Booking");
        System.out.println("3. Exit");
        System.out.print("Enter Menu Number: ");
				createBookingNumber = createBookingOption.nextInt();
        System.out.println("\n");
  
        if (createBookingNumber==1)
        {
          // Enter logic here to auto generate booking number
          int bookingNumber = 0;
          
          // Array list to store the booking information
          ArrayList<String> createBooking = new ArrayList<String>();
          
          // Set up variables to store booking information
          Scanner bookingMovie = new Scanner(System.in);
          Scanner bookingCinema = new Scanner(System.in);
          Scanner bookingDate = new Scanner(System.in);
          Scanner bookingSession = new Scanner(System.in);
          Scanner bookingEmail = new Scanner(System.in);
          Scanner bookingBooking = new Scanner(System.in);
          
          // Enter Movie Title
          System.out.print("Enter Movie Title: ");
          String movie = bookingMovie.nextLine();
          // Adding movie to arrayList
          createBooking.add(movie);
          System.out.print("You have selected: " + movie);
          
          // Enter Cinema Location
          System.out.print("Enter Cinema Location: );
          String cinema = bookingCinema.nextLine();   
          // Adding cinema to arrayList
          createBooking.add(cinema);
          System.out.print("You have selected: " + movie + ", " + cinema);
          
          // Enter Date                 
          System.out.print("Enter Date DDMM: ");
          String date = bookingDate.nextLine();
          // Adding date to arrayList
          createBooking.add(date);
          System.out.print("You have selected: " + movie + ", " + cinema + ", " + date);               
                          
          // Enter Session Time                 
          System.out.print("Enter Session HHMM: ");
          String session = bookingSession.nextLine();
          // Adding session to arrayList
          createBooking.add(session);
          System.out.print("You have selected: " + movie + ", " + cinema + ", " + date + ", " + session); 
             
          // Enter Customer Email                
          System.out.print("Enter Customer Email: ");
          String email = bookingEmail.nextLine();
          // Adding session to arrayList
          createBooking.add(email);
          System.out.println("\n");                 
          System.out.print("You have selected: " + movie + ", " + cinema + ", " + date + ", " + session); 
          System.out.println("Customer Email: " + email);
          System.out.println("\n");
          System.out.print("Finalise Booking Y / N: ");
          
          if (bookingBooking.nextChar().equals("Y")) {
            // Enter logic to save this booking using the createBooking arraylist and include the booking number
          } else {
            System.out.print("This booking has been cancelled.")
          }
                           
        }
        if (createBookingNumber==2)
        {
          public void getMenu();
        }
        
        if (createBookingNumber==3)
        { 
          // Makes a beep sound upon exiting the system
          Toolkit tk = Toolkit.getDefaultToolkit();
          tk.beep(); 
          // Enter logic to exit the system
        }
      
        break;
      default: System.out.println("Invalid choice. Please select a valid choice from the menu.");
    }
  }
}