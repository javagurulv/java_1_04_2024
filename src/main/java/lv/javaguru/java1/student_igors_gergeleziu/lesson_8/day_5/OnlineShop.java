package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_5;

import java.util.ArrayList;
import java.util.List;

class OnlineShop {
    private List<Review> reviews;

    OnlineShop() {
        this.reviews = new ArrayList<>();
    }

    List<Review> getReviews() {
        return reviews;
    }

    void addReview(Review review) {
        this.reviews.add(review);
    }

    void deleteReview(String nick, String title) {
        for (Review rev : reviews) {
            if (rev.getNick().equals(nick) && rev.getProduct().getTitle().equals(title)) {
                this.reviews.remove(rev);
            }
        }
    }
}
