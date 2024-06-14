package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.homework.level_5_middle;

public class SaleStatisticsTest {

    public static void main(String[] args){
        SaleStatisticsTest test = new SaleStatisticsTest();
        test.test1();
        test.test2();
    }

    void test1(){
        SaleStatistics stats = new SaleStatistics();
        Sale item1 = new Sale("Apple", 5, 3);
        Sale item2 = new Sale("Golden Ring", 400, 0);
        Sale item3 = new Sale("Hunting Knife", 105, 1);
        Sale item4 = new Sale("Toilet roll", 4, 5);
        Sale [] shopData = {item1, item2, item3, item4};
        int index1 = stats.mostSales(shopData);

        if(index1 == 3) System.out.println("Test 1 Pass");
        else System.out.println("Test 1 Fail");

    }

    void test2(){
        SaleStatistics stats = new SaleStatistics();
        Sale item1 = new Sale("Apple", 5, 3);
        Sale item2 = new Sale("Golden Ring", 400, 0);
        Sale item3 = new Sale("Hunting Knife", 105, 1);
        Sale item4 = new Sale("Toilet roll", 4, 5);
        Sale [] shopData = {item1, item2, item3, item4};
        int index1 = stats.mostIncome(shopData);

        if(index1 == 2) System.out.println("Test 2 Pass");
        else System.out.println("Test 2 Fail");

    }

}
