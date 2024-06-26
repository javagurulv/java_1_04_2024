package lv.javaguru.java1.student_natalia_kochkina.lesson_9.homework.day_7.task_2;

class Division extends TwoArgumentMathOperation {

    public Division(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}
