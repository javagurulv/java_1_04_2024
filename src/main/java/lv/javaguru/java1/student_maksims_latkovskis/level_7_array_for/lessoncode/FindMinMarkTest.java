package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.lessoncode;

class FindMinMarkTest {

    public static void main(String[] args){
        FindMinMarkTest test = new FindMinMarkTest();
        test.test1();
        test.test2();
    }

    void test1(){
        FindMinMark findMinMark = new FindMinMark();
        int[] marks = {5, 6, 8, 3, 4};
        int min = findMinMark.minMark(marks);

        if (min == 3) System.out.println("Test 1 pass");
        else System.out.println("Test 1 fail");
    }

    void test2(){
        FindMinMark findMinMark = new FindMinMark();
        int[] marks = {5, 6, 5, 3, 6};
        int min = findMinMark.minMark(marks);

        if (min == 3) System.out.println("Test 2 pass");
        else System.out.println("Test 2 fail");
    }



}
