package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_5;

class Review {

    private String nick;
    private String product;
    private String text;
    private int mark;

    public Review(String nick, String product,
                  String text, int mark) {
        this.nick = nick;
        this.product = product;
        this.text = text;
        this.mark = mark;
    }

    public String getText() {
        return text;
    }

    public int getMark() {
        return mark;
    }

    public String getNick() {
        return nick;
    }

    public String getProduct() {
        return product;
    }

}
