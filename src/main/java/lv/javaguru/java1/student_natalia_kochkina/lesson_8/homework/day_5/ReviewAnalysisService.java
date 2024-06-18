package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_5;

import java.util.ArrayList;
import java.util.List;

class ReviewAnalysisService implements ReviewAnalysis {
    @Override
    public void addReview(Review userReview) {
        this.reviews.add(userReview);
    }

    @Override
    public void deleteReview(Review userReview) {
        this.reviews.remove(userReview);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviews;
    }

    @Override
    public int findBestGradeOfProduct() {
        return reviews.stream()
                .map(Review::getGrade)
                .max(Integer::compare)
                .orElse(0);
    }

    @Override
    public int findWorstGradeOfProduct() {
        return reviews.stream()
                .map(Review::getGrade)
                .min(Integer::compare)
                .orElse(0);
    }

    @Override
    public double findAverageGradeOfProduct() {
        int sum = reviews.stream()
                .map(Review::getGrade)
                .reduce(Integer::sum)
                .orElse(0);
        return (double) sum / reviews.size();
    }

    private List<Review> reviews = new ArrayList<>();

}
