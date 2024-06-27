package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_7.task_2;

class Subtraction extends TwoArgumentMathOperation {

    public Subtraction(MathOperation leftArgument,
                       MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() - calculateRightSide();
    }

}
