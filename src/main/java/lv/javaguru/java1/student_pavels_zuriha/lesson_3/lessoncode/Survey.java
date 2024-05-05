package lv.javaguru.java1.student_pavels_zuriha.lesson_3.lessoncode;

class Survey {

    private String textSurvey1;
    private String textSurvey2;
    private boolean answerSurvey1;
    private boolean answerSurvey2;
    private String participantName;


    public Survey(String textSurvey1, String textSurvey2, boolean answerSurvey1, boolean answerSurvey2, String participantName) {
        this.textSurvey1 = textSurvey1;
        this.textSurvey2 = textSurvey2;
        this.answerSurvey1 = answerSurvey1;
        this.answerSurvey2 = answerSurvey2;
        this.participantName = participantName;

    }

    String getTextSurvey1() {
        return this.textSurvey1;

    }

    String getTextSurvey2() {
        return this.textSurvey2;
    }

    boolean getAnswerSurvey1() {
        return this.answerSurvey1;

    }

    boolean getAnswerSurvey2() {
        return this.answerSurvey2;

    }

    String getParticipantName() {
        return this.participantName;
    }

}

class SurveyApp {
    public static void main (String[] args) {

        Survey survey1 = new Survey("Text of the Survey1", "Text of the Survey2", true, false, "Vasya Pupkin");

        System.out.println("Participant Name: " + survey1.getParticipantName());
        System.out.println("Survey 1: " + survey1.getTextSurvey1());
        System.out.println("Survey 2: " + survey1.getTextSurvey2());
        System.out.println("Answer of Survey 1: " + survey1.getAnswerSurvey1());
        System.out.println("Answer of Survey 2: " + survey1.getAnswerSurvey2());


    }

}
