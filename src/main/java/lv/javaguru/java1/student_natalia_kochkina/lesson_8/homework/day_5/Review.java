package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_5;

class Review {

    private String nick;
    private String text;
    private int grade;

    public Review(String nick, String text, int grade) {
        this.nick = nick;
        this.text = text;
        this.grade = grade;
    }

    public String getText() {
        return text;
    }

    public int getGrade() {
        return grade;
    }

    public String getNick() {
        return nick;
    }

}
