package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_6;

class AverageMark
{
            private int engMark;
            private int sportMark;
            private int mathMark;
            private int latMark;
            private int physMark;

            public AverageMark (int engMark,
                                int sportMark,
                                int mathMark,
                                int latMark,
                                int physMark){
                this.engMark = engMark;
                this.sportMark = sportMark;
                this.mathMark = mathMark;
                this.latMark = latMark;
                this.physMark = physMark;
            }
            public int getEngMark(){
                return this.engMark;
            }
            public int getSportMark(){
                return this.sportMark;
    }
            public int getMathMark(){
                return this.mathMark;
    }
            public int getLatMark(){
                return this.latMark;
    }
            public int getPhysMark(){
                return this.physMark;
    }
}
