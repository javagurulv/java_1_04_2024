package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_7.task_4;

import lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.level_7_senior.MusicSpeaker;

class MusicSpeakerApp {
    public static void main(String[] args) {
        MusicSpeakerApp app = new MusicSpeakerApp();
        MusicSpeaker musicSpeaker = new MusicSpeaker("GBL");
        app.printInfo(musicSpeaker);
        musicSpeaker.on();
        musicSpeaker.increaseVolume();
        musicSpeaker.increaseVolume();
        app.printInfo(musicSpeaker);
        musicSpeaker.off();
        musicSpeaker.increaseVolume();
        app.printInfo(musicSpeaker);
    }

    void printInfo(MusicSpeaker musicSpeaker) {
        System.out.println("Speaker: " + musicSpeaker.getModel());
        System.out.println("Volume = " + musicSpeaker.getVolume());
        System.out.println("Is On? " + musicSpeaker.isOn());
        System.out.println();
    }
}
