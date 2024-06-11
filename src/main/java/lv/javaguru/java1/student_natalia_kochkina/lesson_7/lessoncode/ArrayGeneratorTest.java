package lv.javaguru.java1.student_natalia_kochkina.lesson_7.lessoncode;

class ArrayGeneratorTest {

    public static void main(String[] args) {
        ArrayGeneratorTest test = new ArrayGeneratorTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        ArrayGenerator generator = new ArrayGenerator();
        int[] numberArray = generator.generateNumberArray(0, 10);
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] != 0) {
                System.out.println("Test1 FAIL");
            }
        }
        System.out.println("Test1 OK");
    }

    public void test2() {
        ArrayGenerator generator = new ArrayGenerator();
        int[] numberArray = generator.generateNumberArray(3, 7);
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] != 3) {
                System.out.println("Test2 FAIL");
            }
        }
        System.out.println("Test2 OK");
    }

    public void test3() {
        ArrayGenerator generator = new ArrayGenerator();
        int[] numberArray = generator.generateNumberArray();
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] != 0) {
                System.out.println("Test3 FAIL");
            }
        }
        System.out.println("Test3 OK");
    }


}
