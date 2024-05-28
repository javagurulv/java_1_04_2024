package lv.javaguru.java1.student_natalia_kochkina.lesson_5.homework.level_1.task_2;

public class ColorDetectorTest {

    public static void main(String[] args) {
        ColorDetectorTest test = new ColorDetectorTest();
        test.shouldReturnVioletTest();
        test.shouldReturnBlueTest();
        test.shouldReturnGreenTest();
        test.shouldReturnYellowTest();
        test.shouldReturnOrangeTest();
        test.shouldReturnRedTest();
        test.shouldReturnInvisibleLightTest();
    }

    //388 -> Violet
    public void shouldReturnVioletTest() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(388);
        checkResult(realResult, "Violet",
                "shouldReturnVioletTest ");
    }

    //494 -> Blue
    public void shouldReturnBlueTest() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(494);
        checkResult(realResult, "Blue",
                "shouldReturnBlueTest ");
    }

    //500 -> Green
    public void shouldReturnGreenTest() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(500);
        checkResult(realResult, "Green",
                "shouldReturnGreenTest ");
    }

    //580 -> Yellow
    public void shouldReturnYellowTest() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(580);
        checkResult(realResult, "Yellow",
                "shouldReturnYellowTest ");
    }

    //600 -> Orange
    public void shouldReturnOrangeTest() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(600);
        checkResult(realResult, "Orange",
                "shouldReturnOrangeTest ");
    }

    //620 -> Red
    public void shouldReturnRedTest() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(620);
        checkResult(realResult, "Red",
                "shouldReturnRedTest ");
    }

    //1000 -> Invisible Light
    public void shouldReturnInvisibleLightTest() {
        ColorDetector detector = new ColorDetector();
        String realResult = detector.defineColor(1000);
        checkResult(realResult, "Invisible Light",
                "shouldReturnInvisibleLightTest ");
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
