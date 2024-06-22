package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_5;

import java.util.ArrayList;
import java.util.List;

class ReviewBook {

    private List<Review> reviews;

    public ReviewBook() {
        this.reviews = new ArrayList<>();
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

}
