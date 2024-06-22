package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_5;

import java.util.List;
import java.util.stream.Collectors;

class ReviewAnalysisService {

    private ReviewBook reviews;

    public ReviewAnalysisService() {
        this.reviews = new ReviewBook();
    }

    public void addReview(Review userReview) {
        this.reviews.getReviews().add(userReview);
    }

    public void deleteReview(Review userReview) {
        this.reviews.getReviews().remove(userReview);
    }

    public List<Review> getAllReviews() {
        return reviews.getReviews();
    }

    public int findBestGradeOfProduct(String product) {
        return findReviewsByProduct(product).stream()
                .map(Review::getMark)
                .max(Integer::compare)
                .orElse(0);
    }

    public int findWorstGradeOfProduct(String product) {
        return findReviewsByProduct(product).stream()
                .map(Review::getMark)
                .min(Integer::compare)
                .orElse(0);
    }

    public double findAverageGradeOfProduct(String product) {
        int sum = findReviewsByProduct(product).stream()
                .map(Review::getMark)
                .reduce(Integer::sum).orElse(0);
        return (double) sum / findReviewsByProduct(product).size();
    }

    private List<Review> findReviewsByProduct(String product) {
        return reviews.getReviews().stream()
                .filter(review -> review.getProduct().equals(product))
                .collect(Collectors.toList());
    }

}
