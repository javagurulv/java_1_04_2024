package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_5;

class OnlineShopDemo {
    public static void main(String[] args) {
        OnlineShopUtilities shop = new OnlineShopUtilities();
        shop.addReview("James", "Wack product", 0, new Product("Headphones", 20));
        shop.addReview("Jake", "Best product", 5, new Product("Phone", 200));
        shop.addReview("Anna", "Best product", 3, new Product("Phone", 200));
        shop.addReview("Liana", "Best product", 2, new Product("Phone", 200));
        shop.deleteReview("James", "Headphones");
        shop.printReviews(shop.findReviewsByProduct("Phone"));
        System.out.println("Best rating for Phone: " + shop.findBestRatingOfProduct("Phone"));
        System.out.println("Worst rating for Phone: " + shop.findWorstRatingOfProduct("Phone"));
        System.out.println("Average rating for Phone: " + shop.calculateAverageRatingOfProduct("Phone"));
    }
}
