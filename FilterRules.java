import java.util.*;

public class FilterRules {

    String mov[]={"St Kilda","Fitzroy","CBD","Sunshine","Lilydale"};

    void displayData(List<ArrayList<String>> csv)
    {
        for(int i=0;i<csv.size();i++)

        {
            for (int j=0;j<csv.get(i).size();j++)
            {
                System.out.print(csv.get(i).get(j)+" | ");
            }
        }
    }


    ArrayList<Movie> filterMovie(List<String[]> csv)
    {

        ArrayList<Movie> movies=new ArrayList<>();
        Movie currMovie=null;
        for(int i=1;i<csv.size();) {
            int movieIndex= searchMovie(movies,csv.get(i)[0]);
          //  if(movieIndex==-1 )
            //{
                //if(csv.get(i)[0].equals(currMovie.movieName) || searchMovie(movies,csv.get(i)[0]))
             //   movieIndex= searchMovie(movies,csv.get(i)[0]);
                if(movieIndex>=0 )
                {
                    for(int j=i;j<csv.size();j++)
                    {
                        int cinemaIndex = searchCinema(movies.get(movieIndex).cinemaList,csv.get(j)[1]);
                        if(csv.get(j)[0].equals(movies.get(movieIndex).movieName)) {
                            if (cinemaIndex >= 0 && !sessionExists(new MovieTime(csv.get(j)[2], csv.get(j)[3] + " - " + csv.get(j)[4], Integer.parseInt(csv.get(j)[5])),movies.get(movieIndex).cinemaList.get(cinemaIndex).cinemaTimeList)) {
                                movies.get(movieIndex).cinemaList.get(cinemaIndex).addSession(new MovieTime(csv.get(j)[2], csv.get(j)[3] + " - " + csv.get(j)[4], Integer.parseInt(csv.get(j)[5])));
                            } else {
                                if(cinemaIndex==-1)
                                movies.get(movieIndex).addCinema(csv.get(j)[1], new MovieTime(csv.get(j)[2], csv.get(j)[3] + " - " + csv.get(j)[4], Integer.parseInt(csv.get(j)[5])));
                            }
                        }
                    }
                    i+=movies.get(movieIndex).cinemaList.size();
                }
                else
                {
                    currMovie=new Movie(csv.get(i)[0]);
                    currMovie.addCinema(csv.get(i)[1],new MovieTime(csv.get(i)[2],csv.get(i)[3]+" - "+csv.get(i)[4],Integer.parseInt(csv.get(i)[5])));
                    movies.add(currMovie);
                    i++;
                }
            //}
            /*else
            {
                currMovie=new Movie(csv.get(i)[0]);
                currMovie.addCinema(csv.get(i)[1],new MovieTime(csv.get(i)[2],csv.get(i)[3]+" - "+csv.get(i)[4],Integer.parseInt(csv.get(i)[5])));
                movies.add(currMovie);
            }*/

        }
        return movies;
    }

    Booking deleteBooking(List<String[]> bookingList,String refNo)
    {
        Booking a=null;
        for(int i=0;i<bookingList.size();i++)
        {
            if(bookingList.get(i)[0].equals(refNo))
                a=new Booking(bookingList.get(i)[0],bookingList.get(i)[1],bookingList.get(i)[2],bookingList.get(i)[3],bookingList.get(i)[4],bookingList.get(i)[5]);
        }
        return a;
    }
    int searchBooking(List<String[]> bookingList,String email,int operation)
    {
        int delete=-1;
        Scanner choice =new Scanner(System.in);
        ArrayList<String[]> selectedBooking=new ArrayList<>();
        for(int i=0;i<bookingList.size();i++)
        {
            if(bookingList.get(i)[5].equals(email))
                selectedBooking.add(bookingList.get(i));
        }

        if(selectedBooking.isEmpty())
            System.out.println("No bookings exist for given email address");
        else {
            System.out.printf("%-15s","Ref No.");
            System.out.printf("%-25s","Movie");
            System.out.printf("%-25s","Cinema");
            System.out.printf("%-15s","Date");
            System.out.printf("%-15s","Time");
            System.out.println();
            for (int j = 0; j < selectedBooking.size(); j++) {
                System.out.printf("%-15s",selectedBooking.get(j)[0]);
                System.out.printf("%-25s",selectedBooking.get(j)[1] );
                System.out.printf("%-25s",selectedBooking.get(j)[2]);
                System.out.printf("%-15s",selectedBooking.get(j)[3]);
                System.out.printf("%-15s",selectedBooking.get(j)[4]);
                System.out.println();
            }
            if (operation == 1) {
                System.out.println("Select the reference number for booking session you wish to cancel");
                delete = choice.nextInt();
                System.out.println("Do you confirm to delete booking? (Y/N)");
            }
        }
        return delete;
    }
    int searchCinema(ArrayList<Cinema> cinema,String search)
    {
        for(Cinema item:cinema)
        {
            if(item.cinemaName.equals(search))
                return cinema.indexOf(item);
        }
        return -1;
    }

    int searchMovie(ArrayList<Movie> movie,String search)
    {
        for(Movie item:movie)
        {
            if(item.movieName.equals(search))
                return movie.indexOf(item);
        }
        return -1;
    }

    boolean sessionExists(MovieTime session,ArrayList<MovieTime> sessionList)
    {
        for(MovieTime mt:sessionList)
        {
            if(mt.getTime().equals(session.getTime()) && mt.getDate().equals(session.getDate()))
                return true;
        }
        return false;
    }

    void DisplayByMovieName(List<String[]> csv,String movie)
    {
        for(int i=0;i<csv.size();i++)
        {
            if(csv.get(i)[0].equals(movie))
            {
                System.out.println("Cinema: " + csv.get(i)[1]);
                System.out.println("Date(DDMM): " + csv.get(i)[2]);
                System.out.println("Session time: " + csv.get(i)[3] + " - " + csv.get(i)[4]);
                System.out.println("Number of seats available " + csv.get(i)[5]);
                System.out.println();
            }
        }
    }

    void DisplayByCinema(List<String[]> csv,String cinema)
    {
        for(int i=0;i<csv.size();i++)
        {
            if(csv.get(i)[1].equals(cinema))
            {
                System.out.println("Movie : " + csv.get(i)[0]);
                System.out.println("Date(DDMM): " + csv.get(i)[2]);
                System.out.println("Session time: " + csv.get(i)[3] + " - " + csv.get(i)[4]);
                System.out.println("Number of seats available " + csv.get(i)[5]);
                System.out.println();
            }
        }
    }



}
