package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_5;

class StoreApp {

    public static void main(String[] args) {

        StoreBusinessLogic bs = new StoreBusinessLogic();

        bs.addNewRating("TV","John", "nice TV overall", 4);
        bs.addNewRating("Oven","Carl", "cold be better", 3);
        bs.addNewRating("Oven","Julia", "very good", 5);
        bs.addNewRating("Oven","Chris", "not recommend", 2);

        bs.removeLastRating();

        for(Rating rating : bs.allRatings()) {
            System.out.println(rating);
        }

        System.out.println("Min rating: " + bs.minRatingByProduct("Oven"));
        System.out.println("Avg rating: " + bs.avgRatingByProduct("Oven"));

        for(Rating rating : bs.ratingsByProduct("Oven")) {
            System.out.println(rating);
        }

    }

}
