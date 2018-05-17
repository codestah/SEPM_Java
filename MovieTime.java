public class MovieTime
{
  private String time; //in the format hhmm
  private String date; //in the format ddmm
  private int seats;
  public MovieTime(String date,String time,int seats)
  {
    this.date=date;
    this.time=time;
    this.seats=seats;
  }
  
  public String getDate()
  {
    return date;
  }
  
  public String getTime()
  {
    return time;
  }
  public int getSeats(){ return seats;}
  public void setSeats(int seat){
    seats=seat;
  }
 //No setter methods since edit feature is disabled
}