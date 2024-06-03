package lv.javaguru.java1.student_svetlana_bodnarska.lesson_4.homework.level_4_junior;

class StockApp
{
    public static void main(String[] args) {
        Stock google = new Stock("GOOG",10);

        System.out.println("Company = " + google.getName());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());


        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);


        System.out.println("Company = " + google.getName());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());
    }

}
