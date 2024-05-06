package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

import java.util.Scanner;

public class TicketApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input departure Airport: ");
        String departureAirport1 = scanner.nextLine();

        System.out.println("Please input arrival Airport: ");
        String arrivalAirport1 = scanner.nextLine();

        System.out.println("Please input departure Date/Time: ");
        String departureDateTime1 = scanner.nextLine();

        System.out.println("Please input arrival Date/Time: ");
        String arrivalDateTime1 = scanner.nextLine();

        Ticket ticket1 = new Ticket(departureAirport1, arrivalAirport1, departureDateTime1, arrivalDateTime1) ;

        System.out.println("\nTicket information");
        System.out.println("Departure airport: " + ticket1.getDepartureAirport());
        System.out.println("Arrival airport: " + ticket1.getArrivalAirport());
        System.out.println("Departure Date/Time: " + ticket1.getDepartureDateTime());
        System.out.println("Arrival Date/Time: " + ticket1.getArrivalDateTime());

    }
}
