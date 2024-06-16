package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_7_senior;

public class MusicBoxApp {
    public static void main(String[] args) {
        MusicBox musicBox = new MusicBox("JBL");
        musicBox.setVolumeUp();

        System.out.println(musicBox.getSoundLevel());
        musicBox.setVolumeUp();

        System.out.println(musicBox.getSoundLevel());


        System.out.println(musicBox.toString());

        musicBox.setOn();
        musicBox.setVolumeUp();

        System.out.println(musicBox.getSoundLevel());
        musicBox.setVolumeUp();

        System.out.println(musicBox.getSoundLevel());
        musicBox.setVolumeUp();

        System.out.println(musicBox.getSoundLevel());

        System.out.println(musicBox.toString());

    }
}
