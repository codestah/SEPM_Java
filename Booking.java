public class Booking {


    private String refNo,movieName,movieLocation,movieDate,movieTime,email;


    public Booking(String refNo, String movieName, String movieLocation, String movieDate, String movieTime, String email)
    {
        this.refNo=refNo;
        this.movieName=movieName;
        this.movieLocation=movieLocation;
        this.movieDate=movieDate;
        this.movieTime=movieTime;
        this.email=email;
    }

    public String getRefNo() {
        return refNo;
    }

    public String getMovieName() {
        return movieName;
    }


    public String getMovieLocation() {
        return movieLocation;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public String getEmail() {
        return email;
    }

}
