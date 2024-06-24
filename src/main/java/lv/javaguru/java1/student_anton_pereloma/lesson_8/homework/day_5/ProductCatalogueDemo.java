package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_5;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductCatalogueDemo {
    public static void main(String[] args) {
        ArrayList<Merchandise> merchandiseArrayList = new ArrayList<>();
        merchandiseArrayList.add(new Merchandise(001));
        merchandiseArrayList.add(new Merchandise(002));
        merchandiseArrayList.get(0).newReview("Test Author","Test Text",5);
        merchandiseArrayList.get(0).newReview("Test Author","Test Text",4);
        merchandiseArrayList.get(0).newReview("Test Author","Test Text",3);
        merchandiseArrayList.get(0).newReview("Test Author","Test Text",2);
        merchandiseArrayList.get(0).newReview("Test Author","Test Text",1);
        Scanner scanner = new Scanner(System.in);

        String actionPhrase = "new";
        while (!actionPhrase.equalsIgnoreCase("exit")) {
            System.out.println("Welcome to the catalogue:");
                System.out.println("Here's our selection:");
            for (int i = 0; i < merchandiseArrayList.size(); i++) {
                System.out.println("Product ID#: " + merchandiseArrayList.get(i).getId());
                System.out.println("-----------------------------------------");
            }
            System.out.println("Type \"exit\" to stop");
            System.out.println("For new review type \"new\"");
            System.out.println("To show highest rating type \"high\"");
            System.out.println("To show lowest rating type \"low\"");
            System.out.println("To show average rating type \"average\"");
            System.out.println("To show all reviews for a product type \"all\"");
            System.out.println("-----------------------------------------");

            actionPhrase = scanner.next();
            if (actionPhrase.equalsIgnoreCase("new")) {
                System.out.println("Enter product ID# to review: ");
                int productID = scanner.nextInt();
                for (int i = 0; i < merchandiseArrayList.size(); i++) {
                    if (productID == merchandiseArrayList.get(i).getId()) {
                        System.out.println("What is your name?");
                        String name = scanner.next();
                        System.out.println("Your review text:");
                        String reviewText = scanner.next();
                        System.out.println("Your rating (1-5):");
                        int reviewRating = scanner.nextInt();
                        merchandiseArrayList.get(i).newReview(name, reviewText, reviewRating);
                        System.out.println("Review has been submitted");
                        System.out.println("-----------------------------------------");
                    }
                }
            } else if (actionPhrase.equalsIgnoreCase("high")) {
                System.out.println("Enter product ID# to find the highest review rating ");
                int productID = scanner.nextInt();
                for (int i = 0; i < merchandiseArrayList.size(); i++) {
                    if (productID == merchandiseArrayList.get(i).getId()) {

                        System.out.println("Highest rating for product "
                                + productID
                                + " is: "
                                + merchandiseArrayList.get(i).findHighestRating());
                        System.out.println("-----------------------------------------");
                    }
                }
            } else if (actionPhrase.equalsIgnoreCase("low")) {
                System.out.println("Enter product ID# to find the lowest review rating ");
                int productID = scanner.nextInt();
                for (int i = 0; i < merchandiseArrayList.size(); i++) {
                    if (productID == merchandiseArrayList.get(i).getId()) {

                        System.out.println("Lowest rating for product "
                                + productID
                                + " is: "
                                + merchandiseArrayList.get(i).findLowestRating());
                        System.out.println("-----------------------------------------");
                    }
                }
            } else if (actionPhrase.equalsIgnoreCase("average")) {
                System.out.println("Enter product ID# to find average review rating ");
                int productID = scanner.nextInt();
                for (int i = 0; i < merchandiseArrayList.size(); i++) {
                    if (productID == merchandiseArrayList.get(i).getId()) {

                        System.out.println("Average rating for product "
                                + productID
                                + " is: "
                                + merchandiseArrayList.get(i).findAverageRating());
                        System.out.println("-----------------------------------------");
                    }
                }
            } else if (actionPhrase.equalsIgnoreCase("all")) {
                System.out.println("Enter product ID# to get all reviews ");
                int productID = scanner.nextInt();
                for (int i = 0; i < merchandiseArrayList.size(); i++) {
                    if (productID == merchandiseArrayList.get(i).getId()) {
                        merchandiseArrayList.get(i).returnAllReviewsAsText();
                    } else {
                        System.out.println("Not a valid product ID#");
                        System.out.println("-----------------------------------------");
                    }
                }
            } else if (actionPhrase.equalsIgnoreCase("exit")) {
                actionPhrase = "exit";
                System.out.println("-----------------------------------------");
                System.out.println("You've exited the review application");
            } else {
                System.out.println("Please type a valid option:");
                System.out.println("Type \"exit\" to stop");
                System.out.println("For new review type \"new\"");
                System.out.println("To show highest rating type \"high\"");
                System.out.println("To show lowest rating type \"low\"");
                System.out.println("To show average rating type \"average\"");
                System.out.println("-----------------------------------------");
                actionPhrase = scanner.next();
            }

        }
    }
}
