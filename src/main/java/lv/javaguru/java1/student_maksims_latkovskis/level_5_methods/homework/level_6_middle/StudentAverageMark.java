package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_6_middle;

class StudentAverageMark {

    public double averageMarkMathematics(Student student){
        int sum = 0;
        for (int i = 0; i < student.marksMathematics.size(); i++)
        {
            sum += student.marksMathematics.get(i);
        }
        return (double)sum / student.marksMathematics.size();
    }

    public double averageMarkEnglish(Student student){
        int sum = 0;
        for (int i = 0; i < student.marksEnglish.size(); i++)
        {
            sum += student.marksEnglish.get(i);
        }
        return (double)sum / student.marksEnglish.size();
    }

    public double averageMarkSports(Student student){
        int sum = 0;
        for (int i = 0; i < student.marksSports.size(); i++)
        {
            sum += student.marksSports.get(i);
        }
        return (double)sum / student.marksSports.size();
    }



}
