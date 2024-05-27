package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_5;

class ColourWaveDetectorTest {

    public static void main(String[] args) {
       ColourWaveDetectorTest test = new ColourWaveDetectorTest();

       test.test1InvisibleLight();
       test.testViolet();
       test.testBlue();
       test.testGreen();
       test.testYellow();
       test.testOrange();
       test.testRed();
       test.test2InvisibleLight();
    }


    // number = 379 , result = "Invisible Light"
    public void test1InvisibleLight() {
       ColourWaveDetector wave = new ColourWaveDetector();
       String realResult = wave.colourWave(379);
       String expectedResult = "Invisible Light";
       checkResult(realResult, expectedResult, "test1InvisibleLight");
    }

    // number = 380 , result = "Violet"
    public void testViolet() {
        ColourWaveDetector wave = new ColourWaveDetector();
        String realResult = wave.colourWave(380);
        String expectedResult = "Violet";
        checkResult(realResult, expectedResult, "testViolet");
    }

    // number = 494 , result = "Blue"
    public void testBlue() {
        ColourWaveDetector wave = new ColourWaveDetector();
        String realResult = wave.colourWave(494);
        String expectedResult = "Blue";
        checkResult(realResult, expectedResult, "testBlue");
    }

    // number = 569 , result = "Green"
    public void testGreen() {
        ColourWaveDetector wave = new ColourWaveDetector();
        String realResult = wave.colourWave(569);
        String expectedResult = "Green";
        checkResult(realResult, expectedResult, "testGreen");
    }

    // number = 589 , result = "Yellow"
    public void testYellow() {
        ColourWaveDetector wave = new ColourWaveDetector();
        String realResult = wave.colourWave(589);
        String expectedResult = "Yellow";
        checkResult(realResult, expectedResult, "testYellow");
    }

    // number = 619 , result = "Orange"
    public void testOrange() {
        ColourWaveDetector wave = new ColourWaveDetector();
        String realResult = wave.colourWave(619);
        String expectedResult = "Orange";
        checkResult(realResult, expectedResult, "testOrange");
    }

    // number = 750 , result = "Red"
    public void testRed() {
        ColourWaveDetector wave = new ColourWaveDetector();
        String realResult = wave.colourWave(750);
        String expectedResult = "Red";
        checkResult(realResult, expectedResult, "testRed");
    }

    // number = 751 , result = "Invisible Light"
    public void test2InvisibleLight() {
        ColourWaveDetector wave = new ColourWaveDetector();
        String realResult = wave.colourWave(751);
        String expectedResult = "Invisible Light";
        checkResult(realResult, expectedResult, "test2InvisibleLight");
    }

    public void checkResult(String realResult,
                            String expectedResult,
                            String testName) {
        if (realResult.equals(expectedResult)) System.out.println(testName + " : OK");
        else System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
    }

}
