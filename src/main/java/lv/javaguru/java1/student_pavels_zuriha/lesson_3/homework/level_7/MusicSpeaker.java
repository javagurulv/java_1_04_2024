package lv.javaguru.java1.student_pavels_zuriha.lesson_3.homework.level_7;

class MusicSpeaker {

    private String speakerModel;
    private int speakerVolume;
    private boolean speakerOnOff;

    public MusicSpeaker(String speakerModel) {
        this.speakerModel = speakerModel;
        this.speakerVolume = 0;
        this.speakerOnOff = false;

    }

    public void setSpeakerVolume() {
        if (this.speakerOnOff == true) {
            this.speakerVolume = speakerVolume + 1;
        }
    }

    public void switchOn() {
        this.speakerOnOff = true;
        this.speakerVolume = 1;
    }

    public void switchOff() {
        this.speakerOnOff = false;
        this.speakerVolume = 0;

    }

    public String getSpeakerModel() {
        return this.speakerModel;

    }

    public int getSpeakerVolume() {
        return this.speakerVolume;
    }

    public boolean isSpeakerOnOff() {
        return this.speakerOnOff;
    }


}

class MusicSpeakerApp {

    public static void main(String[] args) {

        MusicSpeaker speaker = new MusicSpeaker ("BrandName");

        speaker.switchOn();
        System.out.println(speaker.getSpeakerVolume());

        speaker.setSpeakerVolume();
        speaker.setSpeakerVolume();
        speaker.setSpeakerVolume();
        System.out.println(speaker.getSpeakerVolume());
        System.out.println(speaker.isSpeakerOnOff());

        speaker.switchOff();
        System.out.println(speaker.isSpeakerOnOff());
        System.out.println(speaker.getSpeakerModel());
        System.out.println(speaker.getSpeakerVolume());
        speaker.setSpeakerVolume(); // Doesn't do anything, since speaker is off
        speaker.setSpeakerVolume(); // Doesn't do anything, since speaker is off
        speaker.setSpeakerVolume(); // Doesn't do anything, since speaker is off
        System.out.println(speaker.getSpeakerVolume());

    }
}