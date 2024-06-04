package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.lessoncode;

public class SumArrayTest {

    public static void main(String[] args){
        SumArrayTest test = new SumArrayTest();
        test.evaluation(100, "Test 100");
        test.evaluation(44, "Test 44");

    }

    public void evaluation(int number, String testName){
        SumArray sum100 = new SumArray();
        double sumGauss = ((number + 1) / 2) * (number-1);
        if((int)sumGauss == sum100.sum(number)){
            System.out.println("OK " + testName);
        }
        else{
            System.out.println("Error " + testName);
        }
    }


}
