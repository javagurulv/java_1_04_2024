package lv.javaguru.java1.student_anton_pereloma.lesson_4.homework.level_6_middle;

public class WhatSeason {
    public String SeasonSelector(int month) {
        return switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Does not compute, enter valid month number";
        };
    }
}
