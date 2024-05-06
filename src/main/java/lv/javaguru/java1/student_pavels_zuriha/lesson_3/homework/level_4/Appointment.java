package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_4;

class Appointment {

    private String patientName;
    private String diagnosis;
    private int price;

    public Appointment(String patientName, String diagnosis, int price) {

        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.price = price;

    }

    public String getPatientName() {
        return this.patientName;

    }

    public String getDiagnosis() {
        return this.diagnosis;

    }

    public int getPrice() {
        return this.price;

    }



}
