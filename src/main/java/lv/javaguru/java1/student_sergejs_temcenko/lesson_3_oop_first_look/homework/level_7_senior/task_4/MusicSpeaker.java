package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_7_senior.task_4;

class MusicSpeaker {
    private String model;
    private boolean isOn;
    private int volume;

    public MusicSpeaker (String model, boolean isOn, int volume){
        this.model = model;
        this.isOn = false;
        this.volume = volume;
    }
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Music speaker is now turned on.");
        }
    }
    public void turnOff() {
        if (isOn) {
            isOn = false;
            volume = 0;
            System.out.println("Music speaker is now turned off.");
        }
    }
    public void increaseVolume() {
        if (isOn) {
            if (volume < 10) {
                volume++;
                System.out.println("Volume increased to " + volume);
            } else {
                System.out.println("Volume is already at maximum level.");
            }
        } else {
            System.out.println("Cannot increase volume. Music speaker is turned off.");
        }
    }
    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }

}
