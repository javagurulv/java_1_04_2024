package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.lessoncode;

class FindMaxMarkTest {

    public static void main(String[] args){
        FindMaxMarkTest test = new FindMaxMarkTest();
        test.test1();
        test.test2();
    }

    void test1(){
        FindMaxMark findMaxMark = new FindMaxMark();
        int[] marks = {5, 6, 8, 3, 4};
        int max = findMaxMark.maxMark(marks);

        if (max == 8) System.out.println("Test 1 pass");
        else System.out.println("Test 1 fail");
    }

    void test2(){
        FindMaxMark findMaxMark = new FindMaxMark();
        int[] marks = {5, 6, 5, 3, 6};
        int max = findMaxMark.maxMark(marks);

        if (max == 6) System.out.println("Test 2 pass");
        else System.out.println("Test 2 fail");
    }


}
