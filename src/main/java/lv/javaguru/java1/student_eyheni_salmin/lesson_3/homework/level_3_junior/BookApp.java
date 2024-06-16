package lv.javaguru.java1.student_eyheni_salmin.lesson_3.homework.level_3_junior;

public class BookApp{
    public static void main(String[] args) {
        BookName name = new BookName("Мастер и Маргарита");
        BookAuthor author = new BookAuthor("Михаил", "Булгакова");
        BookPrintingYear printingYear = new BookPrintingYear(20, 3,1940);
        BookChapter chapter1 = new BookChapter("Глава 1", "влрвлар лвыралры влралырвларл ывралрывлра лырвлоарлы врларылвралр ывлралгырвл арывлралр ывларыг врарывга");
        BookChapter chapter2 = new BookChapter("Глава 2", "влрвлар лвыралры влралырвларл ывралрывлра лырвлоарлы врларылвралр ывлралгырвл арывлралр ывларыг врарывга");


        System.out.println(name.getName() + "\n" + author.getName() + author.getSurName() +
                "\n" + printingYear.getDay() + "." + printingYear.getMonth() + "." +
                printingYear.getYear() + "\n" + chapter1.getChapter() +
                chapter1.getText() + "\n" + chapter2.getChapter() + chapter2.getText());


        System.out.println();
        System.out.println();
        System.out.println();


        name.setName("Master and Margarita");
        author.setName("Mihail");
        author.setSurName("Bulgakov");
        chapter1.setChapter("Glava 1");
        chapter1.setText("hdfhsuhf sdhfshf sldfl shdfi");
        chapter2.setChapter("Glava 2");
        chapter2.setChapter("jandhdas ldfl dsfhh kahdfkhkJAO 8943894");


        System.out.println(name.getName() + "\n" + author.getName() + author.getSurName() +
                "\n" + printingYear.getDay() + "." + printingYear.getMonth() + "." +
                printingYear.getYear() + "\n" + chapter1.getChapter() +
                chapter1.getText() + "\n" + chapter2.getChapter() + chapter2.getText());


    }

}
