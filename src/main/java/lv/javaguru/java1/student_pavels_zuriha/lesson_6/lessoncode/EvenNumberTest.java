package lv.javaguru.java1.student_pavels_zuriha.lesson_6.lessoncode;

class EvenNumberTest {

    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.shouldBeEven();
        test.shouldNotBeEven();
    }

    public void shouldBeEven() {
            EvenNumber evenNumber = new EvenNumber();
            boolean isEven = evenNumber.isEven(10);
        if (isEven) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    public void shouldNotBeEven() {
        EvenNumber evenNumber = new EvenNumber();
        boolean notEven = !evenNumber.isEven(12);
        if (notEven) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }
}
