package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode;

class ArrayGeneratorTest {

    public static void main(String[] args) {
        ArrayGeneratorTest test = new ArrayGeneratorTest();
        test.test1();
        test.test2();
    }

    void test1() {
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        int[] arr = arrayGenerator.generateArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println("TEST 1 = FAIL");
            }
        }
        System.out.println("TEST 1 = OK");
    }

    void test2() {
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        int[] arr = arrayGenerator.generateArray(20);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println("TEST 2 = FAIL");
            }
        }
        System.out.println("TEST 2 = OK");
    }

}
