import java.awt.Toolkit;
import java.awt.print.Book;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingClerk {
    FileManager fileSession, fileBooking;
    FilterRules po;
    List<String[]> csv;
    ArrayList<Movie> movieList;
    ArrayList<Cinema> cinemaList;

    public BookingClerk() {
        // Allows no-arg constructor to be called when creating a booking clerk
        fileSession = new FileManager("SessionList.csv");
        movieList = new ArrayList<>();
        cinemaList = new ArrayList<>();
        po = new FilterRules();

        //cinemaList=po.filterCinema(csv);
        try {
            csv = fileSession.parseCSV();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        movieList = po.filterMovie(csv);
    }
  
 /* public BookingClerk(String username, String password) {
    super(username, password);
  }*/

    public void getMenu() {
        int menuNumber = 0;
        Scanner mainMenuOption = new Scanner(System.in);

        do {
        System.out.println("\nMain Menu");
        System.out.println("-------------------------\n");
        System.out.println("1. Search Movie Sessions By Cinema");
        System.out.println("2. Search Movie Sessions By Movie Title");
        System.out.println("3. Create a Booking");
        System.out.println("4. Search for a Booking");
        System.out.println("5. Delete a Booking");
        System.out.println("6. Exit");
        System.out.println("\n");
        System.out.print("Enter Menu Number: ");
        menuNumber = mainMenuOption.nextInt();


            switch (menuNumber) {
                case 1:
                    Scanner searchByCinemaMenuOption = new Scanner(System.in);
                    int cinemaMenu = 0;
                    System.out.println("Display Movie Sessions By Cinema");
                    System.out.println("----------------------------------\n");
                    System.out.println("1. St Kilda");
                    System.out.println("2. Melbourne CBD");
                    System.out.println("3. Fitzroy");
                    System.out.println("4. Lilydale");
                    System.out.println("5. Sunshine");
                    System.out.println("6. Back");
                    System.out.println("7. Exit");
                    System.out.println("\n");
                    System.out.print("Enter Menu Number: ");
                    cinemaMenu = searchByCinemaMenuOption.nextInt();

                    if (cinemaMenu == 1) {
                        System.out.println("All Movie Sessions at St Kilda Cinema");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Movie Sessions at St Kilda Cinemas

                        po.DisplayByCinema(csv, "St Kilda");
                        {

                        }
                    }

                    if (cinemaMenu == 2) {
                        System.out.println("All Movie Sessions at Melbourne CBD Cinema");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Movie Sessions at Melbourne CBD Cinemas

                        po.DisplayByCinema(csv, "St Kilda");

                    }

                    if (cinemaMenu == 3) {
                        System.out.println("All Movie Sessions at Fitzroy Cinema");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Movie Sessions at Fitzroy Cinemas
                        po.DisplayByCinema(csv, "Fitzroy");
                    }

                    if (cinemaMenu == 4) {
                        System.out.println("All Movie Sessions at Lilydale Cinema");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Movie Sessions at Lilydale Cinemas
                        po.DisplayByCinema(csv, "Lilydale");
                    }

                    if (cinemaMenu == 5) {
                        System.out.println("All Movie Sessions at Sunshine Cinema");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Movie Sessions at Sunshine Cinemas
                        po.DisplayByCinema(csv, "Sunshine");
                    }
                    if (cinemaMenu == 6) {
                        getMenu();
                    }

                    if (cinemaMenu == 7)

                    {
                        Exit();
                    }

                    System.out.println("Enter 1 to Go Back To Main Menu");
                    System.out.println("Enter 2 to exit");

                    cinemaMenu = searchByCinemaMenuOption.nextInt();

                    if (cinemaMenu == 1) {
                        getMenu();
                    } else if (cinemaMenu == 2)

                        Exit();

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

                    if (movieNumber == 1) {
                        System.out.println("All Cinema Sessions for Black Panther");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Cinema Sessions for Black Panther

                        po.DisplayByMovieName(csv, "Black Panther");

                    }

                    if (movieNumber == 2) {
                        System.out.println("All Cinema Sessions for The Avengers");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Cinema Sessions for The Avengers
                        po.DisplayByMovieName(csv, "The Avengers");
                    }

                    if (movieNumber == 3) {
                        System.out.println("All Cinema Sessions for Guardians of the Galaxy");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Cinema Sessions for Guardians of the Galaxy
                        po.DisplayByMovieName(csv, "Guardians of the Galaxy");
                    }

                    if (movieNumber == 4) {
                        System.out.println("All Cinema Sessions for Pacific Rim: Uprising");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Cinema Sessions for Pacific Rim: Uprising
                        po.DisplayByMovieName(csv, "Pacific Rim: Uprising");
                    }

                    if (movieNumber == 5) {
                        System.out.println("All Cinema Sessions for Tomb Raider");
                        System.out.println("----------------------------------\n");
                        // Enter logic here to display: All Cinema Sessions for Tomb Raider
                        po.DisplayByMovieName(csv, "Tomb Raider");
                    }
                    if (movieNumber == 6) {
                        getMenu();
                    }

                    if (movieNumber == 7) {
                        Exit();
                    }
                    System.out.println("Enter 1 to Go Back To Main Menu");
                    System.out.println("Enter 2 to exit");

                    movieNumber = searchByMovieMenuOption.nextInt();

                    if (movieNumber == 1) {
                        getMenu();
                    } else if (movieNumber == 2)

                        Exit();

                    break;

                case 3:
                    Scanner createBookingOption = new Scanner(System.in);
                    int bookingNumber = 0;
                    System.out.println("Create a Booking");
                    System.out.println("----------------------------------\n");
                    System.out.println("1. Enter Movie Title");
                    System.out.println("2. Cancel this Booking");
                    System.out.println("3. Exit");
                    System.out.print("Enter Menu Number: ");
                    bookingNumber = createBookingOption.nextInt();
                    System.out.println("\n");

                    fileBooking = new FileManager("Booking.csv");
                    List<String[]> bookingList = new ArrayList<String[]>();
                    try {
                        bookingList=fileBooking.parseCSV();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    if (bookingNumber == 1) {
                        // Auto generate booking number
                       // final AtomicInteger count = new AtomicInteger(0);
                        int bookingID;
                        if(bookingList.isEmpty()) bookingID=0;
                        else
                            bookingID = Integer.parseInt(bookingList.get(bookingList.size()-1)[0])+1;

                        // Set up variables to store booking information
                        Scanner choice = new Scanner(System.in);
                        String movieName, movieLocation, movieDate, movieTime;
                        // Enter Movie Title
                        System.out.println("Enter Movie Title Option: ");
                        int movieChoice;
                        do {
                            for (Movie m : movieList) {
                                System.out.println((movieList.indexOf(m) + 1) + ". " + m.movieName);
                            }
                            movieChoice = choice.nextInt();
                            if (movieChoice > 5 || movieChoice < 1)
                                System.out.println("Invalid movie choice. Please select a movie from the above options.");
                        } while (movieChoice > 5 || movieChoice < 1);

                        movieName = movieList.get(movieChoice - 1).movieName;

                        // Enter Cinema Location
                        System.out.println("Enter Cinema Location:");
                        int cineChoice;
                        ArrayList<Cinema> cine = movieList.get(movieChoice - 1).cinemaList;
                        do {
                            for (Cinema c : cine) {
                                System.out.println((cine.indexOf(c) + 1) + ". " + c.cinemaName);
                            }

                            cineChoice = choice.nextInt();

                            if (cineChoice > 5 || cineChoice < 1)
                                System.out.println("Invalid cinema choice. Please select a cinema from the above options.");
                        } while (cineChoice > 5 || cineChoice < 1);
                        //String cinema = bookingCinema.nextLine();

                        movieLocation = cine.get(cineChoice - 1).cinemaName;


                        System.out.println("Select a session - Date(DDMM) Time(HHMM) from below: \n");

                        System.out.println("Choice No.\tDate\tTime\t\tSeats available");
                        int sessionChoice;
                        ArrayList<MovieTime> sessions = cine.get(cineChoice - 1).cinemaTimeList;

                        do {
                            for (MovieTime c : sessions) {
                                System.out.println((sessions.indexOf(c) + 1) + "\t\t\t" + c.getDate() + "\t" + c.getTime() + "\t\t" + c.getSeats());
                            }

                            sessionChoice = choice.nextInt();

                            if (sessionChoice > sessions.size() || sessionChoice < 1)
                                System.out.println("Invalid session choice. Please select a valid cinema from the above options.");
                        } while (sessionChoice > sessions.size() || sessionChoice < 1);


                        movieDate = sessions.get(sessionChoice - 1).getDate();
                        movieTime = sessions.get(sessionChoice - 1).getTime();

                        System.out.println("The following booking details have been selected:\nMovie: " + movieName + "\nCinema: " + movieLocation + "\nDate: " + movieDate + "\nSession: " + movieTime);
                        // Enter Customer Email
                        System.out.print("Enter Customer Email: ");
                        choice.nextLine();
                        String email;
                        do {
                            email = choice.nextLine();
                            if(email.isEmpty()) System.out.println("Please enter a valid email ID");
                        }while(email.isEmpty());
                        System.out.print("Finalise Booking Y / N: ");
                        String confirmation = "";
                        do {
                            confirmation = choice.nextLine();
                            if (confirmation.equalsIgnoreCase("Y")) {
                                // Enter logic to save this booking using the createBooking arraylist and include the booking number
                                Booking booking = new Booking(Integer.toString(bookingID), movieName, movieLocation, movieDate, movieTime, email);
                                fileBooking.writeFile("Booking.csv", booking);
                                fileSession.updateSeatAvailability("SessionList.csv",booking,1);
                                refreshFile();
                                System.out.println("Booking made successfully");
                            } else if (confirmation.equalsIgnoreCase("N")) {
                                System.out.print("This booking has been cancelled.");
                            } else {
                                System.out.print("Invalid choice. Please select Yes(Y) or No(N)");
                            }
                        } while (!(confirmation.equalsIgnoreCase("Y") || confirmation.equalsIgnoreCase("N")));

                    }
                    if (bookingNumber == 2) {
                        getMenu();
                    }

                    if (bookingNumber == 3) {
                        Exit();

                    }

                    break;
                case 4: System.out.println("Enter booking email address");
                        Scanner search =new Scanner(System.in);
                        String custEmail=search.nextLine();
                    fileBooking = new FileManager("Booking.csv");
                    try {
                        List<String[]> bookList= fileBooking.parseCSV();
                        po.searchBooking(bookList,custEmail,0);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:System.out.println("Enter booking email address");
                    Scanner delete =new Scanner(System.in);
                    String customerEmail=delete.nextLine();
                    fileBooking = new FileManager("Booking.csv");

                    try {
                        List<String[]> bookList= fileBooking.parseCSV();
                        int deleteSession = po.searchBooking(bookList,customerEmail,1);
                        if(deleteSession==-1) break;
                        String confirmation = "";
                        Scanner choice=new Scanner(System.in);
                        do {
                            confirmation = choice.nextLine();
                            if (confirmation.equalsIgnoreCase("Y")) {
                                fileBooking.deleteBookingEntry("Booking.csv", Integer.toString(deleteSession));
                                Booking deleteBooking = po.deleteBooking(bookList,Integer.toString(deleteSession));
                                fileSession.updateSeatAvailability("SessionList.csv",deleteBooking ,2);
                                refreshFile();
                                System.out.println("Booking deleted successfully");
                            } else if (confirmation.equalsIgnoreCase("N")) {
                                System.out.print("This booking has been cancelled.");
                            } else {
                                System.out.print("Invalid choice. Please select Yes(Y) or No(N)");
                            }
                        }while (!(confirmation.equalsIgnoreCase("Y") || confirmation.equalsIgnoreCase("N")));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    Exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid choice from the menu.");
            }
        } while (true);
    }

        void Exit()
        {
            // Makes a beep sound upon exiting the system
            Toolkit tk = Toolkit.getDefaultToolkit();
            tk.beep();
            System.out.println("Application exited");
            System.exit(0);
        }

        void refreshFile(){

            fileSession = new FileManager("SessionList.csv");
            fileBooking=new FileManager("Booking.csv");
            try {
                csv = fileSession.parseCSV();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            movieList = po.filterMovie(csv);

        }

}