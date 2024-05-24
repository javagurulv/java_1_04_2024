package lv.javaguru.java1.student_igors_gergeleziu.lesson_5.level_1;

class ColorDetectorDemo {
    public static void main(String[] args) {
        ColorDetector colorDetector = new ColorDetector();
        System.out.println("Wave length: " + 400 + " Color: " + colorDetector.detect(400));
        System.out.println("Wave length: " + 481 + " Color: " + colorDetector.detect(481));
        System.out.println("Wave length: " + 550 + " Color: " + colorDetector.detect(550));
        System.out.println("Wave length: " + 570 + " Color: " + colorDetector.detect(570));
        System.out.println("Wave length: " + 619 + " Color: " + colorDetector.detect(619));
        System.out.println("Wave length: " + 700 + " Color: " + colorDetector.detect(700));
        //Invisible Light
        System.out.println("Wave length: " + 250 + " Color: " + colorDetector.detect(250));
        System.out.println("Wave length: " + 751 + " Color: " + colorDetector.detect(751));
        System.out.println("Wave length: " + 0 + " Color: " + colorDetector.detect(0));
    }
}
