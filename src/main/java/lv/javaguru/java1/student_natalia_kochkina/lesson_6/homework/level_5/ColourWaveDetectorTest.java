package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_5;

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

    public void test1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(388);
        checkResult(realResult, "Violet", "VioletTest ");
    }

    public void test2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(494);
        checkResult(realResult, "Blue", "BlueTest ");
    }

    public void test3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(500);
        checkResult(realResult, "Green", "GreenTest ");
    }

    public void test4() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(577);
        checkResult(realResult, "Yellow", "YellowTest ");
    }

    public void test5() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(619);
        checkResult(realResult, "Orange", "OrangeTest ");
    }

    public void test6() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(700);
        checkResult(realResult, "Red", "RedTest ");
    }

    public void test7() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(5000);
        checkResult(realResult, "Invisible Light", "InvisibleLightTest ");
    }

    private void checkResult(String realResult, String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }
}
