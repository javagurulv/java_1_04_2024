package lv.javaguru.student_maksims_latkovskis.level_5_methods.lessoncode;

public class MaxOfTwoTest {

    public static void main(String[] args){

        MaxOfTwoTest maxOfTwoTest = new MaxOfTwoTest();
        maxOfTwoTest.test1();
        maxOfTwoTest.test2();
        maxOfTwoTest.test3();
    }

    //2,5->5
    public void test1(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwo(2,5);
        if (result == 5){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }

    //2,5->5
    public void test2(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwo(5,2);
        if (result == 5){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }

    //2,5->5
    public void test3(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwo(5,5);
        if (result == 5){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }

}
