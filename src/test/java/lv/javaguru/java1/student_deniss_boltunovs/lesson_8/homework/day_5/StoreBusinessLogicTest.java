package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_5;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StoreBusinessLogicTest {

    StoreBusinessLogic store = new StoreBusinessLogic();

    @Test
    void addingNewRating(){
        store.addNewRating("TV","John", "nice TV overall", 5);
        store.addNewRating("Oven","Carl", "cold be better", 3);
        List<Rating> result = store.allRatings();
        assertEquals(2, result.size());
    }

    @Test
    void removeLastRating(){
        store.addNewRating("TV","John", "nice TV overall", 4);
        store.addNewRating("Oven","Carl", "cold be better", 3);
        store.addNewRating("Oven","Julia", "very good", 5);
        store.removeLastRating();

        List<Rating> result = store.allRatings();
        int rating = result.get(1).getRating();
        String customer = result.get(1).getCustomer();

        assertEquals(2, result.size());
        assertEquals(3, rating);
        assertEquals( "Carl", customer);
    }

    @Test
    void ratingsBySelectedProduct(){
        store.addNewRating("TV","John", "nice TV overall", 4);
        store.addNewRating("Oven","Carl", "cold be better", 3);
        store.addNewRating("Oven","Julia", "very good", 5);

        List<Rating> productOven = store.ratingsByProduct("Oven");
        String customer = productOven.get(1).getCustomer();
        int rating = productOven.get(1).getRating();

        assertEquals(2, productOven.size());
        assertEquals( "Julia", customer);
        assertEquals(5, rating);
    }

    @Test
    void minRatingBySelectedProduct(){
        store.addNewRating("TV","John", "nice TV overall", 4);
        store.addNewRating("Oven","Carl", "cold be better", 3);
        store.addNewRating("Oven","Julia", "very good", 5);
        store.addNewRating("Oven","Chris", "not recommend", 2);
        int rating = store.minRatingByProduct("Oven");
        assertEquals(2, rating);
    }

    @Test
    void avgRatingBySelectedProduct(){
        store.addNewRating("TV","John", "nice TV overall", 4);
        store.addNewRating("Oven","Carl", "cold be better", 3);
        store.addNewRating("Oven","Julia", "very good", 5);
        store.addNewRating("Oven","Chris", "not recommend", 2);
        double rating = store.avgRatingByProduct("Oven");
        assertEquals(3.33, rating, 0.01);
    }

}