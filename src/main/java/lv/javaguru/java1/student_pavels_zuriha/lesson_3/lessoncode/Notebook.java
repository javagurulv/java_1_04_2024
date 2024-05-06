package lv.javaguru.java1.student_pavels_zuriha.lesson_3.lessoncode;

class Notebook {

    private String name;
    private int price;

    public Notebook(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;

    }

    int getPrice() {
        return this.price;

    }

}

class NotebookApp {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("Nazvanie", 100);

        System.out.println(notebook1.getName() + " " + notebook1.getPrice());
    }


}
