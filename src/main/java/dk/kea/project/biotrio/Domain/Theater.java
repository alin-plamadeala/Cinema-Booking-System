package dk.kea.project.biotrio.Domain;

public class Theater {

    private int theaterId;
    private String theaterName;

    //constructors

    public Theater(){}

    public Theater(int theaterId, String theaterName) {
        this.theaterId = theaterId;
        this.theaterName = theaterName;
    }

    //getters and setters


    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "theaterId=" + theaterId +
                ", theaterName='" + theaterName + '\'' +
                '}';
    }
}
