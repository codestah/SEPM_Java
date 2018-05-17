import java.util.ArrayList;

public class Cinema
{
    ArrayList<Movie> movieList;
    String cinemaName;
    ArrayList<MovieTime> cinemaTimeList;

    public Cinema(String name)
    {
        movieList=new ArrayList<>();
        cinemaName= name;
        cinemaTimeList= new ArrayList<>();
    }

    public void addSession(MovieTime session)
    {
        cinemaTimeList.add(session);
    }

    public void addMovie(String movieName,MovieTime timeList)
    {
        Movie movie=new Movie(movieName);
        movie.movieTimeList.add(timeList);
        movieList.add(movie);
    }
}
