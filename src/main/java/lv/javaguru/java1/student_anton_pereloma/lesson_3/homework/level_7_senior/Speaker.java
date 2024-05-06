package lv.javaguru.java1.student_anton_pereloma.lesson_3.homework.level_7_senior;

class Speaker {
    private String brandName;
    private int volume = 0;
    private boolean power = false;

    Speaker(String brandName) {
        this.brandName = brandName;
    }

    String getPowerStatus() {
        if (this.power) {
            return "Speaker is ON";
        } else {
            return "Speaker is OFF";
        }
    }

    String getBrandName() {
        return this.brandName;
    }

    void togglePower() {
        this.power = !this.power;
        this.volume = 0;
    }

    void increaseVolume() {
        if (this.power) {
            volume++;
        }
    }
    String getVolumeStatus() {
        return "Volume level: " + volume;
    }
}
