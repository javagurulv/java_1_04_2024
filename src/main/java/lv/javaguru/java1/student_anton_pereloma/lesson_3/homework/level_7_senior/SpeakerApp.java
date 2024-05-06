package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_7_senior;

public class SpeakerApp {
    public static void main(String[] args) {
        Speaker sampleSpeaker = new Speaker("JBL");
        System.out.println("Brand name: " + sampleSpeaker.getBrandName());
        System.out.println(sampleSpeaker.getPowerStatus());
        System.out.println("******************************");
        sampleSpeaker.togglePower();
        System.out.println(sampleSpeaker.getPowerStatus());
        sampleSpeaker.increaseVolume();
        System.out.println(sampleSpeaker.getVolumeStatus());
        sampleSpeaker.increaseVolume();
        System.out.println(sampleSpeaker.getVolumeStatus());
        System.out.println("******************************");
        sampleSpeaker.togglePower();
        System.out.println(sampleSpeaker.getPowerStatus());
        System.out.println(sampleSpeaker.getVolumeStatus());
        System.out.println("******************************");
        sampleSpeaker.togglePower();
        System.out.println(sampleSpeaker.getPowerStatus());
        System.out.println(sampleSpeaker.getVolumeStatus());
    }
}
