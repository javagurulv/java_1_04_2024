package lv.javaguru.java1.student_pavels_zuriha.lesson_3.lessoncode;

import java.util.Date;

class PlaneTicket {

    private String departureAirport;
    private String arrivalAirport;
    private Date departureTime;
    private Date arrivalTime;

    public PlaneTicket(String departureAirport, String arrivalAirport, Date departureTime, Date arrivalTime) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;

    }

    String getDepartureAirport() {
        return this.departureAirport;

    }

    String getArrivalAirport() {
        return this.arrivalAirport;

    }

    Date getDepartureTime() {
        return this.departureTime;

    }

    Date getArrivalTime() {
        return this.arrivalTime;
    }

}


class PlaneTicketApp {

    public static void main(String[] args) {

        Date departureTime = new Date (2024, 2, 1, 12, 0);
        Date arrivalTime = new Date (2024, 2, 1, 13, 0);

        PlaneTicket planeTicket = new PlaneTicket("RIX", "TLL", departureTime, arrivalTime);

        System.out.println("Departure Airport: " +planeTicket.getDepartureAirport());
        System.out.println("Arrival Airport: " +planeTicket.getArrivalAirport());
        System.out.println("Departure Time: " +planeTicket.getDepartureTime());
        System.out.println("Arrival Time: " +planeTicket.getArrivalTime());


    }

}
