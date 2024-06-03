package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_5;

class ColourWaveDetectorTest {

    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.violetTest();
        test.blueTest();
        test.greenTest();
        test.yellowTest();
        test.orangeTest();
        test.redTest();
        test.invisibleLightTest();
    }

    public void violetTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(388);
        checkResult(realResult, "Violet", "VioletTest ");
    }

    public void blueTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(494);
        checkResult(realResult, "Blue", "BlueTest ");
    }

    public void greenTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(500);
        checkResult(realResult, "Green", "GreenTest ");
    }

    public void yellowTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(577);
        checkResult(realResult, "Yellow", "YellowTest ");
    }

    public void orangeTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(619);
        checkResult(realResult, "Orange", "OrangeTest ");
    }

    public void redTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(700);
        checkResult(realResult, "Red", "RedTest ");
    }

    public void invisibleLightTest() {
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
