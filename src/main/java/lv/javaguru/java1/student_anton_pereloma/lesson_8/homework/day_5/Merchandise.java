package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_5;

import java.util.ArrayList;
import java.util.List;

class Merchandise {
    private int id;
    private List<Review> reviews = new ArrayList<>();

    public Merchandise(int id) {
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
            if (lowestRating > reviews.get(i).getRating()) {
                lowestRating = reviews.get(i).getRating();
            }
        }
        return lowestRating;
    }

    public double findAverageRating() {
            double sumOfRatings = 0;

        for (int i = 0; i < reviews.size(); i++) {
            sumOfRatings += reviews.get(i).getRating();
        }
        return sumOfRatings/reviews.size();
    }

    public Review getReview(int reviewNumber) {

        if (reviews.isEmpty()) {
            return new Review("", "",0);
        }
        return reviews.get(reviewNumber);
    }

    public void newReview(String author, String reviewText, double rating) {
        Review newReview = new Review(author,reviewText,rating);
        reviews.add(newReview);
    }

    public void removeReview(int reviewNumber) {
        reviews.remove(reviewNumber);
    }

    public List<Review> returnReviewArrayList() {
        return reviews;
    }

    public void returnAllReviewsAsText() {
        for (int i = 0; i < reviews.size(); i++) {
            System.out.println("***************");
            System.out.println("Rating: " + reviews.get(i).getRating());
            System.out.println("Author: " + reviews.get(i).getAuthor());
            System.out.println("Review: " + reviews.get(i).getReviewText());
        }
    }
}


