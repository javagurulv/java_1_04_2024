package lv.javaguru.java1.student_eyheni_salmin.lesson_3.class_work;

import java.util.Date;

public class PlaneTicket {
    private String airportDeparture;
    private String AirportNameArrival;
    private Date timeDeparture;
    private Date timeArrival;

    public PlaneTicket() {}
    public PlaneTicket(String airportDeparture, String airportNameArrival, Date timeDeparture, Date timeArrival) {
        this.airportDeparture = airportDeparture;
        AirportNameArrival = airportNameArrival;
        this.timeDeparture = timeDeparture;
        this.timeArrival = timeArrival;
    }

    public String getAirportDeparture() {
        return airportDeparture;
    }

    public void setAirportDeparture(String airportDeparture) {
        this.airportDeparture = airportDeparture;
    }

    public String getAirportNameArrival() {
        return AirportNameArrival;
    }

    public void setAirportNameArrival(String airportNameArrival) {
        AirportNameArrival = airportNameArrival;
    }

    public Date getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(Date timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public Date getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(Date timeArrival) {
        this.timeArrival = timeArrival;
    }

    @Override
    public String toString() {
        return "PlaneTicket{" +
                "airportDeparture='" + getAirportDeparture() + '\'' +
                ", AirportNameArrival='" + getAirportNameArrival() + '\'' +
                ", timeDeparture=" + getTimeDeparture() +
                ", timeArrival=" + getTimeArrival() +
                '}';
    }
}
