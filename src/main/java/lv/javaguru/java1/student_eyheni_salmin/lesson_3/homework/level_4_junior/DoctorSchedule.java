package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_4_junior;

public class DoctorSchedule {
    private String doctorName;
    private String doctorSurName;
    private String doctorSpeciality;
    private String aMpM;

    public DoctorSchedule(String doctorName, String doctorSurName, String doctorSpeciality, String aMpM) {
        this.doctorName = doctorName;
        this.doctorSurName = doctorSurName;
        this.doctorSpeciality = doctorSpeciality;
        this.aMpM = aMpM;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSurName() {
        return doctorSurName;
    }

    public void setDoctorSurName(String doctorSurName) {
        this.doctorSurName = doctorSurName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public String getaMpM() {
        return aMpM;
    }

    public void setaMpM(String aMpM) {
        this.aMpM = aMpM;
    }

    public String getTimeReception() {
        String time;
        if (aMpM.equalsIgnoreCase("am")) {
            time = "10:00-12:00";
        }if (aMpM.equalsIgnoreCase("pm")) {
            time = "14:00-16:00";
        }else {
            time = "10:00-12:00";
        }
        return time;
    }
    public void printDocShed() {
        System.out.println(getDoctorName() + " " + getDoctorSurName() + "\n" +
                getDoctorSpeciality() + "\n" +
                getTimeReception());
    }


}
