package lv.javaguru.java1.student_deniss_boltunovs.lesson_2.homework.weekly_challanges.task_2;

/*
Исправьте ошибки компиляции в данной программе.

public class SumTwoNumbers {

	public static void main(String[] args) {

		int numberOne;
		int numberTwo;

		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);

		int numberOne = 10;
		int numberTwo = 20;

		int sum = numberOne + numberTwo;

		System.out.println("Sum = " + sum);
	}

}

Цель этого задания: обратить ваше внимание на то,
что в языке программирования Java использовать
переменные нельзя пока им не будет присвоено начальное значение.
 */

public class SumTwoNumbers {

    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 20;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);

    }
}
