package lv.javaguru.java1.student_igors_gergeleziu.lesson_4.level_4;

class StockDemo {
    public static void main(String[] args) {
        StockDemo demo= new StockDemo();
        Stock microsoft= new Stock("MSFT", 10);
        demo.printInfo(microsoft);
        microsoft.updatePrice(15);
        microsoft.updatePrice(7);
        microsoft.updatePrice(14);
        demo.printInfo(microsoft);
    }
    void printInfo(Stock stock){
        System.out.println("Company = " + stock.getCompany());
        System.out.println("Current Price = " + stock.getActualPrice());
        System.out.println("Min Price = " + stock.getMinPrice());
        System.out.println("Max Price = " + stock.getMaxPrice());
        System.out.println();
    }
}
