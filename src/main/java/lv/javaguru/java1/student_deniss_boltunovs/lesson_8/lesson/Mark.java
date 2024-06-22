package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.lesson;

class Mark {

     private String subject;
     private int mark;

     Mark(String subject, int mark) {
         this.subject = subject;
         this.mark = mark;
     }

     public String getSubject(){
         return subject;
     }

     public int getMark(){
         return mark;
     }

    @Override
    public String toString() {
        return "Mark{" +
                "subject='" + subject + '\'' +
                ", mark=" + mark +
                '}';
    }


}
