package lv.javaguru.java1.student_igors_gergeleziu.lesson_3.level_7.task_4;

class MusicSpeaker {
    private String model;
    private int volume;
    private boolean isOn;

    public MusicSpeaker(String model) {
        this.model = model;
        this.volume = 0;
        this.isOn = false;
    }

    void on() {
        this.isOn = true;
    }

    void off() {
        this.isOn = false;
        this.volume = 0;
    }

    void increaseVolume() {
        if ((this.isOn = true) && (this.volume < 10)) {
            this.volume += 1;
        }
    }

    String getModel() {
        return this.model;
    }

    int getVolume() {
        return this.volume;
    }

    boolean isOn() {
        return this.isOn;
    }
}
