package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_6_middle;

class WeekDay {
    private int num;
    private String day;

    public WeekDay() {
        this.num = 0;
        this.day = "";
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public String getWeekDay(int num) {
        setNum(num);
        switch (num) {
            case 1 -> this.day = "Понедельник";
            case 2 -> this.day = "Вторник";
            case 3 -> this.day = "Среда";
            case 4 -> this.day = "Четверг";
            case 5 -> this.day = "Пятница";
            case 6 -> this.day = "Суббота";
            case 7 -> this.day = "Воскресенье";
        }
        return day;
    }
    public void printDay() {
        System.out.println("День :" + num);
        System.out.println("День недели: " + day);
    }
}
