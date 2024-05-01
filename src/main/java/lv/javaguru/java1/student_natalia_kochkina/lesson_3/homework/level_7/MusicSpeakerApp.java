package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_7;

class MusicSpeakerApp {

    public static void main(String[] args) {
        MusicSpeaker musicSpeaker1 = new MusicSpeaker("Samsung");
        System.out.println("model = " + musicSpeaker1.getModel() + ". volume = " +
                musicSpeaker1.getVolume() + ". On = " + musicSpeaker1.isOn());

        musicSpeaker1.turnOn();
        musicSpeaker1.addVolume();
        musicSpeaker1.addVolume();
        System.out.println("model = " + musicSpeaker1.getModel() + ". volume = " +
                musicSpeaker1.getVolume() + ". On = " + musicSpeaker1.isOn());

        musicSpeaker1.turnOff();
        System.out.println("model = " + musicSpeaker1.getModel() + ". volume = " +
                musicSpeaker1.getVolume() + ". On = " + musicSpeaker1.isOn());

    }
}
