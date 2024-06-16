package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_7_senior;

public class MusicBoxApp1 {
    public static void main(String[] args) {
        MusicBox1 musicBox1 = new MusicBox1("JBL");
        musicBox1.setVolumeUp();

        System.out.println(musicBox1.getSoundLevel());
        musicBox1.setVolumeUp();

        System.out.println(musicBox1.getSoundLevel());


        System.out.println(musicBox1.toString());

        musicBox1.setOn();
        musicBox1.setVolumeUp();

        System.out.println(musicBox1.getSoundLevel());
        musicBox1.setVolumeUp();

        System.out.println(musicBox1.getSoundLevel());
        musicBox1.setVolumeUp();

        System.out.println(musicBox1.getSoundLevel());

        System.out.println(musicBox1.toString());

    }
}
