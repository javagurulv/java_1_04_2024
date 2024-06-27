package lv.javaguru.java1.student_natalia_kochkina.lesson_9.day_7.task_2;

class MathOperationDemo {

    public static void main(String[] args) {
        // build and calculate: 10 + 20
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation addition = new Addition(arg1, arg2);
        System.out.println("Left side Addition result = " + addition.calculate());

        // build and calculate: 50 - 20
        Argument arg3 = new Argument(50);
        Argument arg4 = new Argument(20);
        MathOperation subtraction = new Subtraction(arg3, arg4);
        System.out.println("Right side Subtraction result = " + addition.calculate());

        // build and calculate: (10 + 20) + (50 - 20)
        MathOperation addition1 = new Addition(addition, subtraction);
        System.out.println("Final Addition result = " + addition1.calculate());

        //(10 - 5) * (20 / 5)
        Argument arg5 = new Argument(10);
        Argument arg6 = new Argument(5);
        Argument arg7 = new Argument(20);
        MathOperation subtraction1 = new Subtraction(arg5, arg6);
        MathOperation division1 = new Division(arg7, arg6);
        MathOperation multiplication1 = new Multiplication(subtraction1, division1);
        System.out.println("Result = " + multiplication1.calculate());
    }

}
