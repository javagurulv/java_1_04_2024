package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

public class Ticket {

     private String departureAirport;
     private String arrivalAirport;
     private String departureDateTime;
     private String arrivalDateTime;

     public Ticket(String departureAirport, String arrivalAirport, String departureDateTime, String arrivalDateTime ) {
         this.departureAirport = departureAirport;
         this.arrivalAirport = arrivalAirport;
         this.departureDateTime = departureDateTime;
         this.arrivalDateTime = arrivalDateTime;
     }

     public String getDepartureAirport(){
         return this.departureAirport;
     }

     public String getArrivalAirport() {
         return this.arrivalAirport;
     }

     public String getDepartureDateTime() {
         return this.departureDateTime;
     }

     public String getArrivalDateTime() {
         return this.arrivalDateTime;
     }

}
