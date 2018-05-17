import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

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
        for(int i=1;i<csv.size();i++) {
            if(currMovie!=null)
            {
                //if(csv.get(i)[0].equals(currMovie.movieName) || searchMovie(movies,csv.get(i)[0]))
                int movieIndex= searchMovie(movies,csv.get(i)[0]);
                if(movieIndex>=0)
                {
                    for(int j=1;j<csv.size();j++)
                    {
                        int cinemaIndex = searchCinema(movies.get(movieIndex).cinemaList,csv.get(j)[1]);
                        if(cinemaIndex>=0)
                        {
                            movies.get(movieIndex).cinemaList.get(cinemaIndex).addSession(new MovieTime(csv.get(j)[2],csv.get(j)[3]+" - "+ csv.get(j)[4],Integer.parseInt(csv.get(j)[5])));
                        }
                        else
                        {
                            movies.get(movieIndex).addCinema(csv.get(j)[1],new MovieTime(csv.get(j)[2],csv.get(j)[3]+" - "+ csv.get(j)[4],Integer.parseInt(csv.get(j)[5])));
                        }
                    }
                }
                else
                {
                    currMovie=new Movie(csv.get(i)[0]);
                    currMovie.addCinema(csv.get(i)[1],new MovieTime(csv.get(i)[2],csv.get(i)[3]+" - "+csv.get(i)[4],Integer.parseInt(csv.get(i)[5])));
                    movies.add(currMovie);
                }
            }
            else
            {
                currMovie=new Movie(csv.get(i)[0]);
                currMovie.addCinema(csv.get(i)[1],new MovieTime(csv.get(i)[2],csv.get(i)[3]+" - "+csv.get(i)[4],Integer.parseInt(csv.get(i)[5])));
                movies.add(currMovie);
            }

        }
        return movies;
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
