package lv.javaguru.java1.student_anton_pereloma.lesson_6.lessoncode;

class EvenNumberTest {

    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.testEvenNumber();
        test.testOddNumber();
    }

    public void testEvenNumber() {
        int number = 4;

        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(number);
        checkResult(result,true);
    }

    public void testOddNumber() {
        int number = 3;

        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(number);
        checkResult(result,false);
    }

    private void checkResult(boolean realResult,
                             boolean expectedResult) {
        if (expectedResult == realResult) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }
    }
}

