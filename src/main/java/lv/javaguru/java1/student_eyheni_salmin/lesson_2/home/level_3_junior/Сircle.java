package lv.javaguru.java1.student_eyheni_salmin.lesson_2.home.level_3_junior;

import java.util.Scanner;

public class Сircle {
    public static void main(String[] args) {
        printCircleParametrs();
    }

    /*
    L = π*D. Согласно данной формуле, для того чтобы вычислить,
    чему равна длина окружности, необходимо произвести умножение
    ее диаметра на число Пи, равное 3,14. Подставляя в приведенную
    выше формулу числа, указанные в задании, можно произвести расчет
    длины окружности, которая будет равна: 3,14*4 = 12,56 м.
    */
    public static double getPerimetrCircle(double diameter) {
        return 3.14 * diameter;
    }
    /*
    Как найти площадь круга по диаметру, если значение радиуса равно 6 см.
    Как решаем: Диаметр окружности равен двум радиусам. Используем формулу:
    S = π × d2 : 4.
   */
    public static double getSquareCircle(double diameter) {
        return 3.14 * Math.pow(diameter, 2)  / 4;


    }


    public static void printCircleParametrs() {

        System.out.print("Напишите число:");

        double diameter = new Scanner(System.in).nextDouble();
        System.out.println(getPerimetrCircle(diameter));
        System.out.println(getSquareCircle(diameter));
    }
}
