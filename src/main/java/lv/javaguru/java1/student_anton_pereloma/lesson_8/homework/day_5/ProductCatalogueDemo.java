package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_5;

import java.util.ArrayList;

public class ProductCatalogueDemo {
    public static void main(String[] args) {
        ArrayList<Merchandise> merchandiseArrayList = new ArrayList<>();
        merchandiseArrayList.add(new Merchandise(001));
        merchandiseArrayList.add(new Merchandise(002));
        System.out.println(merchandiseArrayList.size());
        System.out.println(merchandiseArrayList.get(0).getId());
        System.out.println(merchandiseArrayList.get(0).getReview(0).getReviewText());
        merchandiseArrayList.get(0).newReview("Tanya","This product is great",5);
        merchandiseArrayList.get(0).newReview("Zhenya","This product is not so great",1);
        System.out.println(merchandiseArrayList.get(0).getReview(0).getReviewText());
        System.out.println(merchandiseArrayList.get(0).getReview(1).getReviewText());

        System.out.println(merchandiseArrayList.get(0).findHighestRating());
        System.out.println(merchandiseArrayList.get(0).findLowestRating());
        merchandiseArrayList.get(0).returnAllReviewsAsText();
    }
}
