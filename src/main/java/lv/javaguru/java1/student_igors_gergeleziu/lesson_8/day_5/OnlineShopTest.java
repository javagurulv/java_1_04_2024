package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_5;

import java.util.List;

class OnlineShopTest {
    public static void main(String[] args) {
        OnlineShopTest test = new OnlineShopTest();
        test.shouldAddReviewTest1();
        test.shouldDeleteReviewTest2();
        test.shouldReturnThreeReviewsOfMilkTest4();
        test.shouldReturnBestRatingForMilkTest5();
        test.shouldReturnWorstRatingForMilkTest6();
        test.shouldCalculateAverageRatingForMilkTest7();
    }

    void shouldAddReviewTest1() {
        OnlineShopUtilities utilities = new OnlineShopUtilities();
        utilities.addReview("Adam", "Good product", 5, new Product("T-shirt", 10));
        List<Review> reviews = utilities.getReviews();
        checkResult(!reviews.isEmpty(), true, "shouldAddReviewTest1");
    }

    void shouldDeleteReviewTest2() {
        OnlineShopUtilities utilities = new OnlineShopUtilities();
        utilities.addReview("Adam", "Good product", 5, new Product("T-shirt", 10));
        utilities.addReview("Jim", "Good product", 4, new Product("Microwave", 100));
        utilities.deleteReview("Adam", "T-shirt");
        List<Review> reviews = utilities.getReviews();
        checkResult(reviews.size() == 1, true, "shouldDeleteReviewTest2");
    }

    /*void shouldDeleteReviewTest3(){
        OnlineShopUtilities utilities= new OnlineShopUtilities();
        utilities.addReview("Adam", "Good product", 5, new Product("T-shirt", 10));
        utilities.deleteReview("Adam", "T-shirt");
        List<Review> reviews=utilities.getReviews();
        checkResult(reviews.isEmpty(), true, "shouldDeleteReviewTest3");
    }*/
    void shouldReturnThreeReviewsOfMilkTest4() {
        OnlineShopUtilities utilities = new OnlineShopUtilities();
        utilities.addReview("Adam", "Good product", 5, new Product("Milk", 2));
        utilities.addReview("Jim", "Good product", 4, new Product("Milk", 2));
        utilities.addReview("Maria", "Spoiled milk", 2, new Product("Milk", 2));
        utilities.addReview("Kevin", "Bad product", 1, new Product("Bread", 1.2));
        List<Review> reviews = utilities.findReviewsByProduct("Milk");
        checkResult(reviews.size() == 3, true, "shouldReturnThreeReviewsOfMilkTest4");
    }

    void shouldReturnBestRatingForMilkTest5() {
        OnlineShopUtilities utilities = new OnlineShopUtilities();
        utilities.addReview("Adam", "Good product", 4, new Product("Milk", 2));
        utilities.addReview("Jim", "Good product", 3, new Product("Milk", 2));
        utilities.addReview("Maria", "Spoiled milk", 2, new Product("Milk", 2));
        utilities.addReview("Kevin", "Best product", 5, new Product("Bread", 1.2));
        int actualResult = utilities.findBestRatingOfProduct("Milk");
        checkResult(actualResult == 4, true, "shouldReturnBestRatingForMilkTest5");
    }

    void shouldReturnWorstRatingForMilkTest6() {
        OnlineShopUtilities utilities = new OnlineShopUtilities();
        utilities.addReview("Adam", "Good product", 4, new Product("Milk", 2));
        utilities.addReview("Jim", "Good product", 3, new Product("Milk", 2));
        utilities.addReview("Maria", "Spoiled milk", 2, new Product("Milk", 2));
        utilities.addReview("Kevin", "Worst product", 1, new Product("Bread", 1.2));
        int actualResult = utilities.findWorstRatingOfProduct("Milk");
        checkResult(actualResult == 2, true, "shouldReturnWorstRatingForMilkTest6");
    }

    void shouldCalculateAverageRatingForMilkTest7() {
        OnlineShopUtilities utilities = new OnlineShopUtilities();
        utilities.addReview("Adam", "Good product", 4, new Product("Milk", 2));
        utilities.addReview("Jim", "Good product", 3, new Product("Milk", 2));
        utilities.addReview("Maria", "Spoiled milk", 2, new Product("Milk", 2));
        utilities.addReview("Kevin", "Worst product", 1, new Product("Bread", 1.2));
        double actualResult = utilities.calculateAverageRatingOfProduct("Milk");
        checkResult(actualResult == 3, true, "shouldCalculateAverageRatingForMilkTest7");
    }

    void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
