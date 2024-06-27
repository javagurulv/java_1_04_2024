package lv.javaguru.java1.student_natalia_kochkina.lesson_9.homework.day_7.task_2;

abstract class TwoArgumentMathOperation extends MathOperation {

    private MathOperation leftArgument;
    private MathOperation rightArgument;

    public TwoArgumentMathOperation(MathOperation leftArgument,
                                    MathOperation rightArgument) {
        this.leftArgument = leftArgument;
        this.rightArgument = rightArgument;
    }

    protected double calculateLeftSide() {
        return leftArgument.calculate();
    }

    protected double calculateRightSide() {
        return rightArgument.calculate();
    }


}
