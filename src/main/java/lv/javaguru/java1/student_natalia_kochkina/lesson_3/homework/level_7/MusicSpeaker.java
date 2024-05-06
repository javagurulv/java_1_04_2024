package lv.javaguru.java1.student_natalia_kochkina.lesson_3.homework.level_7;

class MusicSpeaker {

    private String model;
    private int volume;
    private boolean isOn;

    public MusicSpeaker(String model) {
        this.model = model;
        this.volume = 0;
        this.isOn = false;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void addVolume() {
        if ((this.isOn == true) && (this.volume < 10))
            this.volume = this.volume + 1;
    }

    public void turnOff() {
        this.isOn = false;
        this.volume = 0;
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
