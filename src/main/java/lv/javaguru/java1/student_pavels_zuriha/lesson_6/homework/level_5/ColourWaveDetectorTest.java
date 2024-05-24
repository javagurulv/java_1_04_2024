package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_5;

class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.invisibleLightTest();
        test.violetTest();
        test.blueTest();
        test.greenTest();
        test.yellowTest();
        test.orangeTest();
        test.redTest();
    }

    public void invisibleLightTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(10);
        checkResult(realResult, "Invisible Light", "Test for Invisible Light");

    }

    public void violetTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(430);
        checkResult(realResult, "Violet", "Test for Violet");

    }

    public void blueTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(470);
        checkResult(realResult, "Blue", "Test for Blue");

    }

    public void greenTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(500);
        checkResult(realResult, "Green", "Test for Green");

    }

    public void yellowTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(580);
        checkResult(realResult, "Yellow", "Test for Yellow");

    }

    public void orangeTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(600);
        checkResult(realResult, "Orange", "Test for Orange");

    }

    public void redTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(700);
        checkResult(realResult, "Red", "Test for Red");

    }


    private void checkResult(String realResult, String expectedResult, String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": OK");
        } else {
            System.out.println(testScenarioName + ": FAIL");
        }

    }
}
