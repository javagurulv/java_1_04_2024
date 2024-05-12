package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_6_middle;

import java.util.Scanner;

class WhatSeasonApp {
    public static void main(String[] args) {
        WhatSeason season = new WhatSeason();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month to get season: ");
        System.out.print("'Tis " + season.SeasonSelector(scanner.nextInt()));
    }
}
