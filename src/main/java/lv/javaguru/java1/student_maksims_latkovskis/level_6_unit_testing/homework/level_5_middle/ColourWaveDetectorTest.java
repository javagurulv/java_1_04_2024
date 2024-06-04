package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_5_middle;

class ColourWaveDetectorTest {

    public static void main(String[] args) {
        ColourWaveDetectorTest test = new ColourWaveDetectorTest();

        test.red();
        test.orange();
        test.yellow();
        test.green();
        test.blue();
        test.violet();
    }

    public void red() {
        // for 740 the expected output is red
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String output = colourWaveDetector.colourWave(740);
        testResult("red", output, "test RED");
    }

    public void orange() {
        // for 610 the expected output is orange
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String output = colourWaveDetector.colourWave(610);
        testResult("orange", output, "test ORANGE");
    }

    public void yellow() {
        // for 589 the expected output is yellow
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String output = colourWaveDetector.colourWave(589);
        testResult("yellow", output, "test YELLOW");
    }

    public void green() {
        // for 533 the expected output is green
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String output = colourWaveDetector.colourWave(533);
        testResult("green", output, "test GREEN");
    }

    public void blue() {
        // for 494 the expected output is blue
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String output = colourWaveDetector.colourWave(494);
        testResult("blue", output, "test BLUE");
    }

    public void violet() {
        // for 390 the expected output is blue
        ColourWaveDetector colourWaveDetector = new ColourWaveDetector();
        String output = colourWaveDetector.colourWave(390);
        testResult("violet", output, "test VIOLET");
    }

    public void testResult(String expectedOutput, String gainedOutput, String testName) {
        if (expectedOutput.equalsIgnoreCase(gainedOutput)) {
            System.out.println("PASS " + testName);
        } else {
            System.out.println("FAIL " + testName);
            System.out.println("The gained output is: " + gainedOutput);
        }
    }
}
