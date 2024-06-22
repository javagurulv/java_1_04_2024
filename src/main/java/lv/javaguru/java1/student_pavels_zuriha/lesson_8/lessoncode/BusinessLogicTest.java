package lv.javaguru.java1.student_pavels_zuriha.lesson_8.lessoncode;

class BusinessLogicTest {

    public static void main(String[] args) {
        BusinessLogicTest test = new BusinessLogicTest();
        test.findBestMarkTest();
        test.findWorstMarkTest();
        test.findAverageMarkBySubjectTest();
    }

    public void findBestMarkTest() {
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.addMark("Eng", 6);
        businessLogic.addMark("Eng", 7);
        businessLogic.addMark("Math", 10);
        int bestMark = businessLogic.findBestMark("Eng");
        if (bestMark == 7) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }

    public void findWorstMarkTest() {
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.addMark("Eng", 6);
        businessLogic.addMark("Eng", 7);
        businessLogic.addMark("Math", 10);
        int worstMark = businessLogic.findWorstMark("Eng");
        if (worstMark == 6) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }

    public void findAverageMarkBySubjectTest() {
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.addMark("Eng", 6);
        businessLogic.addMark("Eng", 7);
        businessLogic.addMark("Math", 10);
        double averageMark = businessLogic.findAverageMark("Eng");
        if (averageMark == 6.5) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }

}
