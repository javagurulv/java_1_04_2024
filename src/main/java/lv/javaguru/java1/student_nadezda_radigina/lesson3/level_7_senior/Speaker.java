package lv.javaguru.java1.student_nadezda_radigina.lesson3.level_7_senior;

 class Speaker {

     private String model;
     private int sound;
     private boolean on;

     public Speaker(String model){
         this.model = model;
         this.sound = 0;
         this.on = false;
     }
     public void turnOn(){this.on = true;}
     public void turnOff(){
         this.on = false;
         this.sound = 0;
     }
     public void increaseVolume(){
         if(this.on == true){
         this.sound = this.sound + 1;
     }
     }

     public String getModel(){
         return this.model;
     }
     public int getSound(){
         return this.sound;
     }
     public boolean getOn(){
         return this.on;
     }


}
