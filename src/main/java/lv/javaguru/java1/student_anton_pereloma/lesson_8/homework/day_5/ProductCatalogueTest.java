package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_5;

import java.util.ArrayList;

public class ProductCatalogueTest {
    public static void main(String[] args) {
        ProductCatalogueTest test = new ProductCatalogueTest();
        test.addsReview();
        test.removesReview();
        test.returnsAllReviewsForProduct();
        test.findHighestRating();
        test.findLowestRating();
        test.findAverageRating();
    }

    public void addsReview() {
        ArrayList<Merchandise> testArrayList = new ArrayList<>();
        testArrayList.add(new Merchandise(001));
        testArrayList.get(0).newReview("Test Author","Test Text",5);
        String author = testArrayList.get(0).getReview(0).getAuthor();
        String text = testArrayList.get(0).getReview(0).getReviewText();
        double rating = testArrayList.get(0).getReview(0).getRating();
        boolean result = author.equalsIgnoreCase("test author") &&
                         text.equalsIgnoreCase("test text") &&
                         rating == 5;

        checkResult(result,true,"addsReview");
    }

    public void removesReview() {
        ArrayList<Merchandise> testArrayList = new ArrayList<>();
        testArrayList.add(new Merchandise(001));
        testArrayList.add(new Merchandise(002));
        testArrayList.get(0).newReview("Test Author","Test Text",5);

        boolean testIfReviewAdded = !testArrayList.get(0).returnReviewArrayList().isEmpty();
        testArrayList.get(0).removeReview(0);
        boolean testIfReviewRemoved = testArrayList.get(0).returnReviewArrayList().isEmpty();
        boolean result = testIfReviewAdded && testIfReviewRemoved;

        checkResult(result,true,"removesReview");
    }

    public void returnsAllReviewsForProduct() {
        ArrayList<Merchandise> testArrayList = new ArrayList<>();
        testArrayList.add(new Merchandise(001));
        testArrayList.get(0).newReview("Test Author","Test Text",5);
        testArrayList.get(0).newReview("Test Author","Test Text",4);
        testArrayList.get(0).newReview("Test Author","Test Text",3);
        testArrayList.get(0).newReview("Test Author","Test Text",2);
        testArrayList.get(0).newReview("Test Author","Test Text",1);
        boolean result = false;

        if (testArrayList.get(0).returnReviewArrayList().size() == 5) {
            result = true;
        }

        checkResult(result,true,"returnsAllReviewsForProduct");
    }

    private void findHighestRating() {
        ArrayList<Merchandise> testArrayList = new ArrayList<>();
        testArrayList.add(new Merchandise(001));
        testArrayList.get(0).newReview("Test Author","Test Text",5);
        testArrayList.get(0).newReview("Test Author","Test Text",4);
        testArrayList.get(0).newReview("Test Author","Test Text",3);
        testArrayList.get(0).newReview("Test Author","Test Text",2);
        testArrayList.get(0).newReview("Test Author","Test Text",1);
        boolean result = testArrayList.get(0).findHighestRating() == 5;

        checkResult(result,true,"findHighestRating");

    }

    private void findLowestRating() {
        ArrayList<Merchandise> testArrayList = new ArrayList<>();
        testArrayList.add(new Merchandise(001));
        testArrayList.get(0).newReview("Test Author","Test Text",5);
        testArrayList.get(0).newReview("Test Author","Test Text",4);
        testArrayList.get(0).newReview("Test Author","Test Text",3);
        testArrayList.get(0).newReview("Test Author","Test Text",2);
        testArrayList.get(0).newReview("Test Author","Test Text",1);
        boolean result = testArrayList.get(0).findLowestRating() == 1;

        checkResult(result,true,"findLowestRating");

    }

    private void findAverageRating() {
        ArrayList<Merchandise> testArrayList = new ArrayList<>();
        testArrayList.add(new Merchandise(001));
        testArrayList.get(0).newReview("Test Author","Test Text",5);
        testArrayList.get(0).newReview("Test Author","Test Text",4);
        testArrayList.get(0).newReview("Test Author","Test Text",3);
        testArrayList.get(0).newReview("Test Author","Test Text",2);
        testArrayList.get(0).newReview("Test Author","Test Text",1);
        boolean result = testArrayList.get(0).findAverageRating() == 3.0;

        checkResult(result,true,"findAverageRating");

    }


    private void checkResult(Boolean realResult,
                             Boolean expectedResult,
                             String testScenarioName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
