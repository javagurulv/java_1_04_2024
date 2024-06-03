package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_5_middle;

class SaleApp {
    public static void main(String[] args) {
        SaleAnalyser saleAnalyser = new SaleAnalyser();

        Sale[] sales = {
                new Sale("product001", 10,10),
                new Sale("product002",1,100),
                new Sale("product003",2,20),

        };
        System.out.println(saleAnalyser.findBestSeller(sales));



//
        
    }
}
