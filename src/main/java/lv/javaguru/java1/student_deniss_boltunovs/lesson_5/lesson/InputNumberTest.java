package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

class InputNumberTest {

    public static void main(String[] args) {
        InputNumberTest test = new InputNumberTest();
        test.test1();
        test.test2();
    }

    public void test1(){
        InputNumber hint = new InputNumber();
        String result = hint.textHint();
        String expectedResult = "Please, enter the number: ";

        if (result.equals(expectedResult)) {
            System.out.println("test1: OK");
        } else {
            System.out.println("test1: FAILED");
        }
    }

    public void test2(){
        InputNumber hint = new InputNumber();
        String result = hint.textHint("Enter whole number");
        String expectedResult = "Enter whole number";

        if (result.equals(expectedResult)) {
            System.out.println("test2: OK");
        } else {
            System.out.println("test2: FAILED");
        }
    }

}
