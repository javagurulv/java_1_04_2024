package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.lessoncode;

class MaxNumberTest {

    public static void main(String[] args){
        MaxNumberTest test = new MaxNumberTest();

        test.test1();
        test.test2();
        test.test3();
    }

    void test1(){
        int number1 = 5;
        int number2 = 8;
        Calculator calculator = new Calculator();
        if(calculator.maxOfTwo(number1, number2) == number2){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }

    void test2(){
        int number1 = 5;
        int number2 = -8;
        Calculator calculator = new Calculator();
        if(calculator.maxOfTwo(number1, number2) == number1){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }
    void test3(){
        int number1 = 0;
        int number2 = 0;
        Calculator calculator = new Calculator();
        if(calculator.maxOfTwo(number1, number2) == number1){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }

}
