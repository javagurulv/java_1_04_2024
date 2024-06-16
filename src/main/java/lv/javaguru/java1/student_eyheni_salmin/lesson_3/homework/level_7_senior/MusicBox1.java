package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_7_senior;

class MusicBox1 {
    private String brand;
    private int soundLevel;
    private boolean oNoFf;

    public MusicBox1(String brand) {
        this.brand = brand;
        this.soundLevel = 0;
        this.oNoFf = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public boolean getoNoFf() {
        return oNoFf;
    }

    public void setoNoFf(boolean oNoFf) {
        this.oNoFf = oNoFf;
    }

    public boolean  setOn() {
        return oNoFf = true;
    }
    public boolean  setOff() {
        return oNoFf = false;
    }
    public int setVolumeUp() {
        if (oNoFf) {
            soundLevel += 1;
        }
        return soundLevel;
    }
    public int setVolumeDown() {
        if (oNoFf) {
            soundLevel -= 1;
        }
        return soundLevel;
    }

    @Override
    public String toString() {
        return "Brand= " + brand + '\n' +
                "SoundLevel= " + soundLevel + '\n' +
                "ONoFf= " + oNoFf;
    }
}
