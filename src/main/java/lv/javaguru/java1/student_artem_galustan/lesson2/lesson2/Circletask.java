package lv.javaguru.java1.student_artem_galustan.lesson2.lesson2;

import java.util.Locale;
import java.util.Scanner;

public class Circletask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Введите радиус круга:");
        double radius = scanner.nextDouble();

        // Вычисление периметра круга
        double perimeter = 2 * Math.PI * radius;

        // Вычисление площади круга
        double area = Math.PI * radius * radius;

        // Вывод на консоль периметра и площади круга
        System.out.println("Периметр круга с радиусом " + radius + " равен " + perimeter);
        System.out.println("Площадь круга с радиусом " + radius + " равна " + area);
    }
}



