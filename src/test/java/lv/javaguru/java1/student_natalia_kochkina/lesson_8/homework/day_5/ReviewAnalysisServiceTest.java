package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewAnalysisServiceTest {

    ReviewAnalysisService service = new ReviewAnalysisService();

    @Test
    void addReview() {
        service.addReview(new Review("User1", "apple", "Text1", 3));
        service.addReview(new Review("User2", "banana", "Text2", 4));
        assertEquals(service.getAllReviews().size(), 2);
    }

    @Test
    void deleteReview() {
        Review review1 = new Review("User1", "apple", "Text1", 3);
        Review review2 = new Review("User2", "banana", "Text2", 4);
        service.addReview(review1);
        service.addReview(review2);
        service.deleteReview(review1);
        assertEquals(service.getAllReviews().size(), 1);
    }

    @Test
    void getAllReviews() {
        service.addReview(new Review("User1", "apple", "Text1", 3));
        service.addReview(new Review("User2", "banana", "Text2", 4));
        service.addReview(new Review("User3", "apple", "Text3", 3));
        service.addReview(new Review("User4", "orange", "Text4", 4));
        assertEquals(service.getAllReviews().size(), 4);
    }

    @Test
    void findBestGradeOfProduct() {
        service.addReview(new Review("User1", "apple", "Text1", 3));
        service.addReview(new Review("User2", "banana", "Text2", 4));
        service.addReview(new Review("User3", "apple", "Text3", 5));
        service.addReview(new Review("User4", "orange", "Text4", 4));
        assertEquals(service.findBestGradeOfProduct("apple"), 5);
    }

    @Test
    void findWorstGradeOfProduct() {
        service.addReview(new Review("User1", "apple", "Text1", 3));
        service.addReview(new Review("User2", "banana", "Text2", 4));
        service.addReview(new Review("User3", "apple", "Text3", 5));
        service.addReview(new Review("User4", "orange", "Text4", 4));
        assertEquals(service.findWorstGradeOfProduct("apple"), 3);
    }

    @Test
    void findAverageGradeOfProduct() {
        service.addReview(new Review("User1", "apple", "Text1", 3));
        service.addReview(new Review("User2", "banana", "Text2", 4));
        service.addReview(new Review("User3", "apple", "Text3", 5));
        service.addReview(new Review("User4", "orange", "Text4", 4));
        assertEquals(service.findAverageGradeOfProduct("apple"), 4, 0.01);
    }

}