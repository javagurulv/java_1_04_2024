package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_5_middle;


class ColourWaveDetectorTest {

    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.violetTest1();
        test.violetTest2();
        test.violetTest3();
        test.violetTest4();
        test.violetTest5();

        test.blueTest1();
        test.blueTest2();
        test.blueTest3();

        test.greenTest1();
        test.greenTest2();
        test.greenTest3();

        test.yellowTest1();
        test.yellowTest2();
        test.yellowTest3();

        test.orangeTest1();
        test.orangeTest2();
        test.orangeTest3();

        test.redTest1();
        test.redTest2();
        test.redTest3();
        test.redTest4();

    }
    public void violetTest1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(379);
        checkResult(realResult, "Invisible Light", "violet 1");
    }
    public void violetTest2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(380);
        checkResult(realResult, "Violet", "violet 2");
    }
    public void violetTest3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(381);
        checkResult(realResult, "Violet", "violet 3");
    }
    public void violetTest4() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(448);
        checkResult(realResult, "Violet", "violet 4");

    }
    public void violetTest5() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(449);
        checkResult(realResult, "Violet", "violet 5");
    }
    public void blueTest1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(450);
        checkResult(realResult, "Blue", "blue 1");
    }
    public void blueTest2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(480);
        checkResult(realResult, "Blue", "blue 2");
    }
    public void blueTest3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(494);
        checkResult(realResult, "Blue", "blue 3");
    }
    public void greenTest1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(495);
        checkResult(realResult, "Green", "green 1");
    }
    public void greenTest2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(500);
        checkResult(realResult, "Green", "green 2");
    }
    public void greenTest3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(569);
        checkResult(realResult, "Green", "green 3");

    }
    public void yellowTest1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(570);
        checkResult(realResult, "Yellow", "yellow 1");
    }
    public void yellowTest2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(580);
        checkResult(realResult, "Yellow", "yellow 2");
    }
    public void yellowTest3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(589);
        checkResult(realResult, "Yellow", "yellow 3");
    }
    public void orangeTest1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(590);
        checkResult(realResult, "Orange", "orange 1");
    }
    public void orangeTest2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(600);
        checkResult(realResult, "Orange", "orange 2");
    }
    public void orangeTest3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(619);
        checkResult(realResult, "Orange", "orange 3");
    }
    public void redTest1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(620);
        checkResult(realResult, "Red", "red 1");
    }
    public void redTest2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(700);
        checkResult(realResult, "Red", "red 2");
    }
    public void redTest3() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(750);
        checkResult(realResult, "Red", "red 3");
    }
    public void redTest4() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String realResult = colourWaveDetector.colourWave(751);
        checkResult(realResult, "Invisible Light", "red 4");
    }
    private void checkResult (String realResult, String expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println("Test " + testName + " OK");
        } else {
            System.out.println("Test " + testName + " FAIL");

        }
    }


}