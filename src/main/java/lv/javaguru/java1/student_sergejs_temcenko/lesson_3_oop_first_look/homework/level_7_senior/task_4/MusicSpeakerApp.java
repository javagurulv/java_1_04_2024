package lv.javaguru.java1.student_sergejs_temcenko.lesson_3_oop_first_look.homework.level_7_senior.task_4;

class MusicSpeakerApp {
    public static void main(String[] args) {
        // Пример использования класса
        MusicSpeaker mySpeaker = new MusicSpeaker("Speaker", true, 0);

        // Проверка начального состояния
        System.out.println("Model: " + mySpeaker.getModel());
        System.out.println("Volume: " + mySpeaker.getVolume());
        System.out.println("Is on: " + mySpeaker.isOn());

        // Попытка увеличить уровень звука до включения
        mySpeaker.increaseVolume();

        // Включение музыкальной колонки
        mySpeaker.turnOn();

        // Увеличение уровня звука
        mySpeaker.increaseVolume();
        mySpeaker.increaseVolume();

        // Выключение музыкальной колонки
        mySpeaker.turnOff();

        // Проверка состояния после выключения
        System.out.println("Volume: " + mySpeaker.getVolume());
        System.out.println("Is on: " + mySpeaker.isOn());
    }
}
