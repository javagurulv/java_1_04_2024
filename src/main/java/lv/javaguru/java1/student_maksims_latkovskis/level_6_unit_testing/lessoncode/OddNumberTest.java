package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.lessoncode;

class OddNumberTest {

    public static void main(String[] args){
        OddNumberTest test = new OddNumberTest();

        test.test1();
        test.test2();
        test.test3();
    }

    public void test1(){
        int number = 3;
        Calculator calculator = new Calculator();
        if(calculator.isOdd(3)){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }

    public void test2(){
        int number = 5;
        Calculator calculator = new Calculator();
        if(calculator.isOdd(5)){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }

    public void test3(){
        int number = -4;
        Calculator calculator = new Calculator();
        if(calculator.isOdd(-4) == false){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }
}
