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
            System.out.println("Type \"exit\" to stop");
            System.out.println("For new review type \"new\"");
            System.out.println("To show highest rating type \"high\"");
            System.out.println("To show lowest rating type \"low\"");
            System.out.println("To show average rating type \"average\"");

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
                    }
                }
            } else if (actionPhrase.equalsIgnoreCase("exit")) {
                actionPhrase = "exit";
                System.out.println("You've exited the review application");
            } else {
                System.out.println("Please type a valid option:");
                System.out.println("Type \"exit\" to stop");
                System.out.println("For new review type \"new\"");
                System.out.println("To show highest rating type \"high\"");
                System.out.println("To show lowest rating type \"low\"");
                System.out.println("To show average rating type \"average\"");
                actionPhrase = scanner.next();
            }

        }
    }
}
