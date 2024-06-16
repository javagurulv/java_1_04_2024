package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_3_junior;

public class BookPrintingYear {
    private int day;
    private int month;
    private int year;

    public BookPrintingYear(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
