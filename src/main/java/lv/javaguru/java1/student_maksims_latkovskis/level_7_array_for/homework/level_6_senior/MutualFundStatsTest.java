package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.homework.level_6_senior;

class MutualFundStatsTest {

    public static void main(String[] args) {
        MutualFundStatsTest test = new MutualFundStatsTest();
        test.test1();
        test.test2();

    }

    void test1() {
        MutualFundStats mutualFundStats = new MutualFundStats();

        Stock stock1 = new Stock("Boeing", 560, 3.1);
        Stock stock2 = new Stock("Lipton", 248, 0.5);
        Stock stock3 = new Stock("Heineken", 340, 3.7);
        Stock stock4 = new Stock("German Railways", 144, 1.2);
        Stock[] mutualFund = {stock1, stock2, stock3, stock4};

        if (mutualFundStats.assetValueSum(mutualFund) == 1292.0) System.out.println("Test 1 Pass");
        else System.out.println("Test 1 Fail");
    }

    void test2() {
        MutualFundStats mutualFundStats = new MutualFundStats();

        Stock stock1 = new Stock("Boeing", 560, 3.1);
        Stock stock2 = new Stock("Lipton", 248, 0.5);
        Stock stock3 = new Stock("Heineken", 340, 3.7);
        Stock stock4 = new Stock("German Railways", 144, 1.2);
        Stock[] mutualFund = {stock1, stock2, stock3, stock4};

        if (mutualFundStats.assetMeanMargin(mutualFund) == 2.125) System.out.println("Test 2 Pass");
        else System.out.println("Test 2 Fail");
    }


}
