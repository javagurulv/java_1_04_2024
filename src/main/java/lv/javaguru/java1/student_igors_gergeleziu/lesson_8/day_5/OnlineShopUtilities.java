package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_5;

import java.util.ArrayList;
import java.util.List;

class OnlineShopUtilities {
    private OnlineShop shop;

    OnlineShopUtilities() {
        this.shop = new OnlineShop();
    }

    void printReviews(List<Review> reviews) {
        for (Review rev : reviews) {
            System.out.println(rev);
            System.out.println();
        }
    }

    void addReview(String nick, String reviewText, int rating, Product product) {
        Review newReview = new Review(nick, reviewText, rating, product);
        shop.addReview(newReview);
    }

    void deleteReview(String nick, String title) {
        shop.deleteReview(nick, title);
    }

    List<Review> findReviewsByProduct(String productTitle) {
        List<Review> reviewsByProduct = new ArrayList<>();
        for (Review rev : shop.getReviews()) {
            if (rev.getProduct().getTitle().equals(productTitle)) {
                reviewsByProduct.add(rev);
            }
        }
        return reviewsByProduct;
    }

    int findBestRatingOfProduct(String productTitle) {
        List<Review> reviewsByProduct = findReviewsByProduct(productTitle);
        int bestRating = reviewsByProduct.get(0).getRating();
        for (int i = 0; i < reviewsByProduct.size(); i++) {
            if (reviewsByProduct.get(i).getRating() > bestRating) {
                bestRating = reviewsByProduct.get(i).getRating();
            }
        }
        return bestRating;
    }

    int findWorstRatingOfProduct(String productTitle) {
        List<Review> reviewsByProduct = findReviewsByProduct(productTitle);
        int worstRating = reviewsByProduct.get(0).getRating();
        for (int i = 0; i < reviewsByProduct.size(); i++) {
            if (reviewsByProduct.get(i).getRating() < worstRating) {
                worstRating = reviewsByProduct.get(i).getRating();
            }
        }
        return worstRating;
    }

    double calculateAverageRatingOfProduct(String productTitle) {
        List<Review> reviewsByProduct = findReviewsByProduct(productTitle);
        double sumOfRating = 0;
        for (int i = 0; i < reviewsByProduct.size(); i++) {
            sumOfRating += reviewsByProduct.get(i).getRating();
        }
        return valueFormattingWithMathRound((sumOfRating / (double) reviewsByProduct.size()), 2);
    }

    static double valueFormattingWithMathRound(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }


}
