package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_4_junior;

public class DoctorTimetableApp {
    public static void main(String[] args) {

        DoctorSchedule doctorSchedule1 = new DoctorSchedule("Иван", "Иванов", "Зубной", "am");
        DoctorSchedule doctorSchedule2 = new DoctorSchedule("Петр", "Петров", "Практолог", "PM");
        DoctorSchedule doctorSchedule3 = new DoctorSchedule("Сидр", "Сидоров", "Патологоанатом", "am");


        ReceptionRec receptionRec1 = new ReceptionRec("Козел", "Козлович", "Дурак", 34.56);
        ReceptionRec receptionRec2 = new ReceptionRec("Осел", "Ослович", "Дурак", 50.56);

        doctorSchedule1.printDocShed();
        System.out.println();
        doctorSchedule2.printDocShed();
        System.out.println();
        doctorSchedule3.printDocShed();
        System.out.println();


        receptionRec1.printDocShed();
        System.out.println();
        receptionRec2.printDocShed();




    }
}
