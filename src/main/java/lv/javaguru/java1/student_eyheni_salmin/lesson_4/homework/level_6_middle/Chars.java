package lv.javaguru.java1.student_eyheni_salmin.lesson_4.homework.level_6_middle;

class Chars {
    private char aChar;

    public Chars() {
        this.aChar = ' ';
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public char getRomeNum(int num) {
        switch (num) {
            case 1 -> this.aChar = '\u2160';
            case 2 -> this.aChar = '\u2161';
            case 3 -> this.aChar = '\u2162';
            case 4 -> this.aChar = '\u2163';
            case 5 -> this.aChar = '\u2164';
            case 6 -> this.aChar = '\u2165';
            case 7 -> this.aChar = '\u2166';
            case 8 -> this.aChar = '\u2167';
            case 9 -> this.aChar = '\u2168';
            case 10 -> this.aChar = '\u2169';

        }
        return aChar;
    }
    public void print() {
        System.out.println(getaChar());
    }
}

