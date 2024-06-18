package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_5;

import java.util.List;

interface ReviewAnalysis {

    void addReview(Review userReview);

    void deleteReview(Review userReview);

    List<Review> getAllReviews();

    int findBestGradeOfProduct();

    int findWorstGradeOfProduct();

    double findAverageGradeOfProduct();

}
