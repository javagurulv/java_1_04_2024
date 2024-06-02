package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_5_middle;

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

    // 1. 380 - 449; expected "Violet"
    public void test1 (){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(380);
        testCheck(result, "Violet", "Test1:");
    }

    // 1. 450 - 494; expected "Blue"
    public void test2 (){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(455);
        testCheck(result, "Blue", "Test2:");
    }

    // 1. 495 - 569; expected "Green"
    public void test3 (){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(505);
        testCheck(result, "Green", "Test3:");
    }

    // 1. 570 - 589; expected "Yellow"
    public void test4 (){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(573);
        testCheck(result, "Yellow", "Test4:");
    }

    // 1. 590 - 619; expected "Orange"
    public void test5 (){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(591);
        testCheck(result, "Orange", "Test5:");
    }

    // 1. 620 - 750; expected "Red"
    public void test6 (){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(720);
        testCheck(result, "Red", "Test6:");
    }

    public void test7 (){
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String result = colourWaveDetector.colourWave(800);
        testCheck(result, "Invisible Light", "Test7:");
    }

    private void testCheck (String result,
                            String expected,
                            String testName) {
        if(result.equals(expected)){
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAILED");
        }
    }

}
