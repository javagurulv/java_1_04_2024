package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.lesson;

public class QuestionnaireApplication {

    public static void main(String[] args) {

        Question question1 = new Question("Is it Tuesday ?", true);
        Question question2 = new Question("Is it rainy ?" , false);

        Questionnaire questionnaire = new Questionnaire("Denzel", question1, question2);

        String name = questionnaire.getName();
        //// returns question1 object for class Question
        Question q1 = questionnaire.getQuestion1();
        //// returns question2 object for class Question
        Question q2 = questionnaire.getQuestion2();

        String questionText1 = q1.getQuestion();
        boolean answerText1 = q1.getAnswer();

        String questionText2 = q2.getQuestion();
        boolean answerText2 = q2.getAnswer();

        System.out.println("Questionanaire 1");
        System.out.println("Name: " + name);
        System.out.println("question 1: " + questionText1);
        System.out.println("answer 1: " + answerText1);
        System.out.println("question 2: " + questionText2);
        System.out.println("answer 2: " + answerText2);

    }

}
