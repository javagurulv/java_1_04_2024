package lv.javaguru.java1.student_anton_pereloma.lesson_5.homework.level_1_intern;

class ColorDetectorApp {
    public static void main(String[] args) {
        ColorDetector whatColor = new ColorDetector();


        System.out.println(whatColor.waveLength(0));
        System.out.println(whatColor.waveLength(390));
        System.out.println(whatColor.waveLength(460));
        System.out.println(whatColor.waveLength(580));
        System.out.println(whatColor.waveLength(610));
        System.out.println(whatColor.waveLength(650));
        System.out.println(whatColor.waveLength(100000));
    }
}
