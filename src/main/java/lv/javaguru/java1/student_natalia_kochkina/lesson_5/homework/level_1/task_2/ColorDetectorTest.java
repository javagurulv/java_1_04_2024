package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_1.task_2;

public class ColorDetectorTest {

    public static void main(String[] args) {
        ColorDetectorTest test = new ColorDetectorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
    }

    //388 -> Violet
    public void test1() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(388);
        checkResult(realResult, "Violet",
                "Test1 ");
    }

    //494 -> Blue
    public void test2() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(494);
        checkResult(realResult, "Blue",
                "Test2 ");
    }

    //500 -> Green
    public void test3() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(500);
        checkResult(realResult, "Green",
                "Test3 ");
    }

    //580 -> Yellow
    public void test4() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(580);
        checkResult(realResult, "Yellow",
                "Test4 ");
    }

    //600 -> Orange
    public void test5() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(600);
        checkResult(realResult, "Orange",
                "Test5 ");
    }

    //620 -> Red
    public void test6() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(620);
        checkResult(realResult, "Red",
                "Test6 ");
    }

    //1000 -> Invisible Light
    public void test7() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(1000);
        checkResult(realResult, "Invisible Light",
                "Test7 ");
    }


    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
