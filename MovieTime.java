public MovieTime
{
  private int time; //in the format hhmm
  private int date; //in the format ddmm
  
  public MovieTime(int date,int time)
  {
    this.date=date;
    this.time=time;
  }
  
  public int getDate()
  {
    return date;
  }
  
  public int getTime()
  {
    return time;
  }
  
 //No setter methods since edit feature is disabled
}