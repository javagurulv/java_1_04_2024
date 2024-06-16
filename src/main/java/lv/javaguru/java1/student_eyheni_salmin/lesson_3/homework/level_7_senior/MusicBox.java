package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_7_senior;

class MusicBox {
    private String brand;
    private int soundLevel;
    private String oNoFf;

    public MusicBox(String brand) {
        this.brand = brand;
        this.soundLevel = 0;
        this.oNoFf = "off";
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

    public String getoNoFf() {
        return oNoFf;
    }

    public void setoNoFf(String oNoFf) {
        this.oNoFf = oNoFf;
    }

    public String  setOn() {
        return oNoFf = "on";
    }
    public String  setOff() {
        return oNoFf = "off";
    }
    public int setVolumeUp() {
        if (oNoFf.equals("on")) {
            soundLevel += 1;
        }
        return soundLevel;
    }
    public int setVolumeDown() {
        if (oNoFf.equals("on")) {
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
