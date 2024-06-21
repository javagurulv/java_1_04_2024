package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_5;

import java.util.ArrayList;
import java.util.List;

class Merchandaise {
    private int id;
    private List<Review> reviews = new ArrayList<>();

    public Merchandaise(int id) {
        this.id = id;
    }

    public int getId() { return id; }

    public double findHighestRating() {
        double highestRating = 0;
        for (Review review : reviews) {
            if (review.getRating() > highestRating) {
                highestRating = review.getRating();
            }
        }
        return highestRating;
    }

    public double findLowestRating() {

        double lowestRating = reviews.get(0).getRating();
        for (int i = 0; i < reviews.size(); i++) {
            if (lowestRating < reviews.get(i).getRating()) {
                lowestRating = reviews.get(i).getRating();
            }
        }
        return lowestRating;
    }

}


