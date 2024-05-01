package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_4;

class Appointment {

    private String patientName;
    private String patientSurname;
    private String diagnostic;
    private int price;

    public Appointment(String patientName, String patientSurname, String diagnostic, int price) {
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.diagnostic = diagnostic;
        this.price = price;
    }

    public String getPatientName() {
        return this.patientName;
    }

    public String getPatientSurname() {
        return  this.patientSurname;
    }

    public String getDiagnostic() {
        return this.diagnostic;
    }

    public int getPrice() {
        return this.price;
    }
}
