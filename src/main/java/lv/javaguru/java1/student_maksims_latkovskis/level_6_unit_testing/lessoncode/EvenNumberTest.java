package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.lessoncode;

import lv.javaguru.java1.student_jelena_k.lesson5.Calculator;

 // 1. Podgotovka testovih dannih
 // 2. Vizov prodaksh koda
//  3. Proverka rezultata

class EvenNumberTest {

    public static void main(String[] args){
        EvenNumberTest evenNumberTest = new EvenNumberTest();
        evenNumberTest.isEvenTest(2);
        evenNumberTest.isEvenTest(0);
        evenNumberTest.isEvenTest(-1);

    }


    public void isEvenTest(int number){
        Calculator calculator = new Calculator();

        if((number % 2 == 0) == calculator.isEven(number)){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }
    }

}
