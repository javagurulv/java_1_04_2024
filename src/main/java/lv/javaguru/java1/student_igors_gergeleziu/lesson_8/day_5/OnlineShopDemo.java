package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_5;

import java.util.List;
import java.util.Scanner;

class OnlineShopDemo {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);
    static OnlineShopUtilities utilities = new OnlineShopUtilities();

    public static void main(String[] args) {
        OnlineShopDemo demo = new OnlineShopDemo();
        boolean exit = false;
        do {
            demo.printInfo();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    demo.addReview();
                    break;
                }
                case 2: {
                    demo.deleteReview();
                    break;
                }
                case 3: {
                    demo.showProductReviews();
                    break;
                }
                case 4: {
                    demo.showBestRatingOfProduct();
                    break;
                }
                case 5: {
                    demo.showWorstRatingOfProduct();
                    break;
                }
                case 6: {
                    demo.showAverageRatingOfProduct();
                    break;
                }
                case 7: {
                    utilities.printReviews(utilities.getReviews());
                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
                default:
                    break;
            }
        } while (!exit);
    }

    void printInfo() {
        System.out.println("1.Add Review");
        System.out.println("2.Delete Review");
        System.out.println("3.Show product reviews");
        System.out.println("4.Show product best rating");
        System.out.println("5.Show product worst rating");
        System.out.println("6.Show product average rating");
        System.out.println("7.Show all reviews");
        System.out.println("0.Exit");
    }

    void addReview() {
        System.out.println("Enter your name: ");
        String nick = scannerString.nextLine();
        System.out.println("Your review: ");
        String reviewText = scannerString.nextLine();
        System.out.println("Product title: ");
        String productTitle = scannerString.nextLine();
        System.out.println("Product price: ");
        double price = scanner.nextDouble();
        System.out.println("How would you rate this product? ");
        int rating = scanner.nextInt();
        utilities.addReview(nick, reviewText, rating, new Product(productTitle, price));
    }

    void deleteReview() {
        List<Review> reviews = utilities.getReviews();
        if (!reviews.isEmpty()) {
            System.out.println("Enter your name: ");
            String nick = scannerString.nextLine();
            System.out.println("Enter product title: ");
            String productTitle = scannerString.nextLine();
            utilities.deleteReview(nick, productTitle);
        }
    }

    void showProductReviews() {
        System.out.println("Enter product title: ");
        List<Review> reviews = utilities.findReviewsByProduct(scannerString.nextLine());
        if (!reviews.isEmpty()) {
            utilities.printReviews(reviews);
        }
    }

    void showBestRatingOfProduct() {
        System.out.println("Enter product title: ");
        String productTitle = scannerString.nextLine();
        List<Review> reviews = utilities.findReviewsByProduct(productTitle);
        if (!reviews.isEmpty()) {
            System.out.println("Best rating for " + productTitle + " is "
                    + utilities.findBestRatingOfProduct(productTitle) + "\n");
        } else System.out.println("No reviews for " + productTitle + "\n");
    }

    void showWorstRatingOfProduct() {
        System.out.println("Enter product title: ");
        String productTitle = scannerString.nextLine();
        List<Review> reviews = utilities.findReviewsByProduct(productTitle);
        if (!reviews.isEmpty()) {
            System.out.println("Worst rating for " + productTitle + " is "
                    + utilities.findWorstRatingOfProduct(productTitle) + "\n");
        } else System.out.println("No reviews for " + productTitle + "\n");
    }

    void showAverageRatingOfProduct() {
        System.out.println("Enter product title: ");
        String productTitle = scannerString.nextLine();
        List<Review> reviews = utilities.findReviewsByProduct(productTitle);
        if (!reviews.isEmpty()) {
            System.out.println("Average rating for " + productTitle + " is "
                    + utilities.calculateAverageRatingOfProduct(productTitle) + "\n");
        } else System.out.println("No reviews for " + productTitle + "\n");
    }
}
