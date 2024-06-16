package lv.javaguru.java1.student_eyheni_salmin.lesson_3.class_work;

import java.util.Date;

public class PlaneTicketApp {
    public static void main(String[] args) {


        PlaneTicket planeTicket = new PlaneTicket("Аэропорт1", "Аэропорт2", new Date(22, 34, 66), new Date(33, 55, 66));

        System.out.println(planeTicket.toString());

    }
}
