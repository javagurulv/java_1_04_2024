package lv.javaguru.java1.student_natalia_kochkina.lesson_3.lessoncode;

class QuestionnaireApplication {

    //Task_13

    public static void main(String[] args) {
        Form form1 = new Form("Погода хорошая?", true);
        Form form2 = new Form("Гулять пойдем?", false);
        Questionnaire questionnaire1 = new Questionnaire("Vasja", form1, form2);

        Form form3 = new Form("Сегодня пятница?", true);
        Form form4 = new Form("Выпьем вина?", true);
        Questionnaire questionnaire2 = new Questionnaire("Petja", form3, form4);

    }
}
