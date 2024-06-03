package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.lesson;

class TriangleAreaTest {

    public static void main(String[] args) {
       TriangleAreaTest test = new TriangleAreaTest();

       test.test1();
       test.test2();
       test.test3();

    }

    // 3,4,5 -> 6
    public void test1() {
        TriangleArea area = new TriangleArea();
        double result = area.calculateArea(3,4,5);
        if (result == 6){
            System.out.println("test1: OK");
        } else {
            System.out.println("test1: FAILED");
        }
    }

    // 5,7,9 -> 17.41228014936585
    public void test2() {
        TriangleArea area = new TriangleArea();
        double result = area.calculateArea(5, 7, 9);
        if (result == 17.41228014936585) {
            System.out.println("test2: OK");
        } else {
            System.out.println("test2: FAILED");
        }
    }

    // 7,9,12 -> 31.304951684997057
    public void test3() {
        TriangleArea area = new TriangleArea();
        double result = area.calculateArea(7, 9, 12);
        if (result == 31.304951684997057) {
            System.out.println("test3: OK");
        } else {
            System.out.println("test3: FAILED");
        }
    }

}
