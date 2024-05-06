package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

class Questionnaire {

    private String name;
    private Question question1;
    private Question question2;

    ///////constructor for Questionnaire
    public Questionnaire(String name,
                         Question question1,
                         Question question2) {

           this.name = name;
           this.question1 = question1;
           this.question2 = question2;
    }

    public String getName() {
        return this.name;
    }

    public Question getQuestion1(){
        return this.question1;
    }

    public Question getQuestion2(){
        return this.question2;
    }

}
