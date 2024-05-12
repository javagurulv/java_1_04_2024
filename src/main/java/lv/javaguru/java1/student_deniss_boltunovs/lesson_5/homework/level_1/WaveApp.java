package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_1;

class WaveApp {

    public static void main(String[] args) {

        Wave wave = new Wave();

        String waveGreen = wave.returnWaveColor(500);
        System.out.println(waveGreen);

        String waveOrange = wave.returnWaveColor(600);
        System.out.println(waveOrange);

    }
}
