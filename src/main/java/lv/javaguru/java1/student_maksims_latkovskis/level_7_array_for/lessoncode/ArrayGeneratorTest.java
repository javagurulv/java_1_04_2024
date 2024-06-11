package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.lessoncode;

class ArrayGeneratorTest {

    public static void main(String[] args){
        ArrayGeneratorTest test = new ArrayGeneratorTest();
        test.test1();
        test.test2();
    }

    void test1() {
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        int[] array = arrayGenerator.createEmptyArray();

        for (int i = 0;  i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println("Test 1 Fail");
                return;
            }
        }
        System.out.println("Test 1 Pass");
    }

    void test2() {
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        int[] array = arrayGenerator.createEmptyArray(20);

        for (int i = 0;  i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println("Test 2 Fail");
                return;
            }
        }
        System.out.println("Test 2 Pass");
    }



}
