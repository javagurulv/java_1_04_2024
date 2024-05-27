package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_5;

class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
    }

    void test1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String actualResult = colourWaveDetector.colourWave(0);
        checkResult(actualResult, "Invisible Light", "InvisibleLightTest1");
    }

    void test2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String actualResult = colourWaveDetector.colourWave(430);
        checkResult(actualResult, "Violet", "VioletColourTest2");
    }

    void test3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String actualResult = colourWaveDetector.colourWave(480);
        checkResult(actualResult, "Blue", "BlueColourTest3");
    }

    void test4() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String actualResult = colourWaveDetector.colourWave(525);
        checkResult(actualResult, "Green", "GreenColourTest4");
    }

    void test5() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String actualResult = colourWaveDetector.colourWave(589);
        checkResult(actualResult, "Yellow", "YellowColourTest5");
    }

    void test6() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String actualResult = colourWaveDetector.colourWave(610);
        checkResult(actualResult, "Orange", "OrangeColourTest6");
    }

    void test7() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String actualResult = colourWaveDetector.colourWave(630);
        checkResult(actualResult, "Red", "RedColourTest7");
    }

    void checkResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
