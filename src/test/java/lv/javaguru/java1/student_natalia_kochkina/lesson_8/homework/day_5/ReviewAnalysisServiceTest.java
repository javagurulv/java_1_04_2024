package lv.javaguru.java1.student_natalia_kochkina.lesson_8.homework.day_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewAnalysisServiceTest {

    ReviewAnalysisService service = new ReviewAnalysisService();

    @Test
    void addReview() {
        service.addReview(new Review("User1", "Text1", 3));
        service.addReview(new Review("User2", "Text2", 4));
        assertEquals(service.getAllReviews().size(), 2);
    }

    @Test
    void deleteReview() {
        Review review1 = new Review("User1", "Text1", 3);
        Review review2 = new Review("User2", "Text2", 4);
        Review review3 = new Review("User3", "Text3", 2);
        service.addReview(review1);
        service.addReview(review2);
        service.addReview(review3);
        service.deleteReview(review1);
        assertEquals(service.getAllReviews().size(), 2);
    }

    @Test
    void getAllReviews() {
        service.addReview(new Review("User1", "Text1", 3));
        service.addReview(new Review("User2", "Text2", 4));
        service.addReview(new Review("User3", "Text3", 2));
        service.addReview(new Review("User4", "Text4", 5));
        assertEquals(service.getAllReviews().size(), 4);
    }

    @Test
    void findBestGradeOfProduct() {
        service.addReview(new Review("User1", "Text1", 3));
        service.addReview(new Review("User2", "Text2", 4));
        service.addReview(new Review("User3", "Text3", 2));
        service.addReview(new Review("User4", "Text4", 5));
        assertEquals(service.findBestGradeOfProduct(), 5);
    }

    @Test
    void findWorstGradeOfProduct() {
        service.addReview(new Review("User1", "Text1", 3));
        service.addReview(new Review("User2", "Text2", 4));
        service.addReview(new Review("User3", "Text3", 2));
        service.addReview(new Review("User4", "Text4", 5));
        assertEquals(service.findWorstGradeOfProduct(), 2);
    }

    @Test
    void findAverageGradeOfProduct() {
        service.addReview(new Review("User1", "Text1", 3));
        service.addReview(new Review("User2", "Text2", 4));
        service.addReview(new Review("User3", "Text3", 2));
        service.addReview(new Review("User4", "Text4", 5));
        assertEquals(service.findAverageGradeOfProduct(), 3.5, 2);
    }
}