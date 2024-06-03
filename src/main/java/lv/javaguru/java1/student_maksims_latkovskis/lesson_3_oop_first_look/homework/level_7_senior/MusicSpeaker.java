package lv.javaguru.java1.student_maksims_latkovskis.lesson_3_oop_first_look.homework.level_7_senior;

class MusicSpeaker {

    private String speakerName;
    private int speakerVolume;
    private boolean speakerIsON;

    MusicSpeaker(String speakerName){

        this.speakerName = speakerName;
        this.speakerVolume = 0;
        this.speakerIsON = false;

    }

    void turnOnMusicSpeaker(){
        this.speakerIsON = true;
    }
    void turnOffMusicSpeaker(){
        this.speakerIsON = false;
        this.speakerVolume = 0;
    }

    void increaseVolume(){
        if(this.speakerIsON == true && speakerVolume<10) {
            this.speakerVolume++;
        }
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public int getSpeakerVolume() {
        return speakerVolume;
    }

    public boolean isSpeakerIsON() {
        return speakerIsON;
    }
}

class MusicSpeakerApp{

    public static void main(String[] args){

        MusicSpeaker JBL1 = new MusicSpeaker("JBL");
        System.out.println("Name = " + JBL1.getSpeakerName() + " Volume = " + JBL1.getSpeakerVolume() + " Is ON? = " + JBL1.isSpeakerIsON());

        JBL1.increaseVolume();
        System.out.println("Volume = " + JBL1.getSpeakerVolume());

        JBL1.turnOnMusicSpeaker();
        JBL1.increaseVolume();
        JBL1.increaseVolume();
        System.out.println("Volume = " + JBL1.getSpeakerVolume());

        JBL1.turnOffMusicSpeaker();
        System.out.println("Volume = " + JBL1.getSpeakerVolume());

    }

}