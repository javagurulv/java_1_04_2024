package lv.javaguru.java1.student_nadezda_radigina.lesson3.level_7_senior;

 class SpeakerDemo {
     public static void main(String[] args){
         Speaker speaker1 = new Speaker("Radio");
         System.out.println("Model is " + speaker1.getModel());
         System.out.println("Indicator of volume is " + speaker1.getSound());
         System.out.println("Speaker is on - " + speaker1.getOn());
         speaker1.turnOn();
         System.out.println("Speaker is on - " + speaker1.getOn());
         speaker1.turnOff();
         System.out.println("Speaker is on - " + speaker1.getOn());
        // speaker1.turnOff();
         speaker1.turnOn();
         //speaker1.increaseVolume();
         //speaker1.increaseVolume();
        // speaker1.increaseVolume();
       //  speaker1.increaseVolume();
        // System.out.println("Speaker is on - " + speaker1.getOn() + " Volume indicator is " + speaker1.getSound());
         speaker1.increaseVolume();
         //speaker1.increaseVolume();
         System.out.println("Speaker is on - " + speaker1.getOn() + " Volume indicator is " + speaker1.getSound());
         speaker1.turnOff();
         System.out.println("Speaker is on - " + speaker1.getOn() + " Volume indicator is " + speaker1.getSound());
     }
}
