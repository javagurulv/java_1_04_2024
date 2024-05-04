package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_7.task_4;

class SpeakerApp {

    public static void main(String[] args) {

        Speaker speaker = new Speaker("D&B") ;

        String model = speaker.getModel();
        int volume = speaker.getVolumeLevel();
        boolean isOn = speaker.getIsOn();

        System.out.println("Model: " + model);
        System.out.println("level of volume: " + volume);
        System.out.println("is On: " + isOn);

        ////// Let's turn it On and then increase volume
        System.out.println("\n*** Let's turn it On and increase volume ***");

        speaker.turnOn();
        speaker.increaseVolume();
        speaker.increaseVolume();
        speaker.increaseVolume();

        volume = speaker.getVolumeLevel();
        isOn = speaker.getIsOn();
        System.out.println("level of volume: " + volume);
        System.out.println("is On: " + isOn);

        //// Let's turned it Off
        System.out.println("\n*** Let's turn it Off ***");

        speaker.turnOff();
        volume = speaker.getVolumeLevel();
        isOn = speaker.getIsOn();

        System.out.println("level of volume: " + volume);
        System.out.println("is On: " + isOn);

    }
}
