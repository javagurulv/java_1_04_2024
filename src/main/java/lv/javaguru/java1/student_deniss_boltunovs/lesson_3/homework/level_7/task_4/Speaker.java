package lv.javaguru.java1.student_deniss_boltunovs.lesson_3.homework.level_7.task_4;

class Speaker {

       private String model;
       private int volumeLevel;
       private boolean isOn;

       public Speaker(String model) {
            this.model = model;
            this.volumeLevel = 0;
            this.isOn = false;
       }

       public void turnOn() {
            this.isOn = true;
       }

       public void turnOff() {
           this.isOn = false;
           this.volumeLevel = 0;
       }

       public void increaseVolume() {
           if (this.isOn) {
               this.volumeLevel += 1;
           }
       }

       //---------- getters
       public String getModel(){
           return this.model;
       }

       public int getVolumeLevel() {
           return this.volumeLevel;
       }

       public boolean getIsOn() {
           return this.isOn;
       }

}


