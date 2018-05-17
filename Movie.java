import java.util.ArrayList;

public class Movie
{
    String movieName;
    ArrayList<MovieTime> movieTimeList;
    ArrayList<Cinema> cinemaList;

  public Movie(String name)
  {
      movieName=name;
      movieTimeList=new ArrayList<MovieTime>();
      this.cinemaList=new ArrayList<>();
  }


  public void addCinema(String cinemaName,MovieTime timeList)
  {
      Cinema cine=new Cinema(cinemaName);
      cine.cinemaTimeList.add(timeList);
      cinemaList.add(cine);
  }
}