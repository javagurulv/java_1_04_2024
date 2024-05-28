package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_5_middle;

// Tests:
// Violet wave length       - 390
// Blue wave length         - 460
// Green wave length        - 500
// Yellow wave length       - 570
// Orange wave length       - 600
// Red wave length          - 650
// Invisible wave length 1  - 300
// Invisible wave length 2  - 800

class ColourWaveDetectorTest {
    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();
        test.violetWaveTest();
        test.blueWaveTest();
        test.greenWaveTest();
        test.yellowWaveTest();
        test.orangeWaveTest();
        test.redWaveTest();
        test.invisibleLightWaveTest1();
        test.invisibleLightWaveTest2();
    }
    public void violetWaveTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result =  colourWaveDetector.colourWave(390);
        checkResult(result,"Violet", "violetWaveTest");
    }

    public void blueWaveTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result =  colourWaveDetector.colourWave(460);
        checkResult(result,"Blue", "violetWaveTest");
    }

    public void greenWaveTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result =  colourWaveDetector.colourWave(500);
        checkResult(result,"Green", "violetWaveTest");
    }

    public void yellowWaveTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result =  colourWaveDetector.colourWave(570);
        checkResult(result,"Yellow", "violetWaveTest");
    }

    public void orangeWaveTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result =  colourWaveDetector.colourWave(600);
        checkResult(result,"Orange", "violetWaveTest");
    }

    public void redWaveTest() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result =  colourWaveDetector.colourWave(650);
        checkResult(result,"Red", "violetWaveTest");
    }

    public void invisibleLightWaveTest1() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result =  colourWaveDetector.colourWave(300);
        checkResult(result,"Invisible Light", "invisibleLightWaveTest1");
    }

    public void invisibleLightWaveTest2() {
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result =  colourWaveDetector.colourWave(800);
        checkResult(result,"Invisible Light", "invisibleLightWaveTest2");
    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
