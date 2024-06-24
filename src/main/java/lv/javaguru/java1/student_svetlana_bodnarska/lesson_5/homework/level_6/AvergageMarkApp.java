package lv.javaguru.java1.student_svetlana_bodnarska.lesson_5.homework.level_6;

class AvergageMarkApp
{
    public static void main(String[] args) {
        AverageMark averageMark = new AverageMark(
                7,
                8,
                6,
                6,
                5);

        System.out.println("Average mark = "
                + (averageMark.getEngMark()
                + averageMark.getSportMark()
                + averageMark.getMathMark()
                + averageMark.getLatMark()
                + averageMark.getPhysMark()) / 5);


    }

}
