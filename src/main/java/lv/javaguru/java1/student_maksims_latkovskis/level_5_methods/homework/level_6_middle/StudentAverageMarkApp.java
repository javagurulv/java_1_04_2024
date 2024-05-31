package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_6_middle;

class StudentAverageMarkApp {

    public static void main(String[] args){

        Student john = new Student("John" , "Smith");
        john.setMarksMathematics(4);
        john.setMarksMathematics(8);
        john.setMarksMathematics(3);
        john.setMarksEnglish(9);
        john.setMarksEnglish(10);
        john.setMarksSports(6);

       StudentAverageMark average = new StudentAverageMark();
       double markAverageMath = average.averageMarkMathematics(john);
       double markAverageEnglish = average.averageMarkEnglish(john);
       double markAverageSports = average.averageMarkSports(john);

       System.out.println("The average marks of " + john.getFirstName() + " " + john.getLastName() + " are:");
       System.out.println("Mathematics: " + markAverageMath);
       System.out.println("English: " + markAverageEnglish);
       System.out.println("Sports: " + markAverageSports);
    }


}
