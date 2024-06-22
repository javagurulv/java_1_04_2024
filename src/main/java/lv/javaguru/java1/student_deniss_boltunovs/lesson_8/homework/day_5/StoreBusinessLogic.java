package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_5;

import java.util.List;
import java.util.stream.Collectors;

class StoreBusinessLogic {
    private Store store;

      StoreBusinessLogic(){
          this.store = new Store();
      }

      Store getStore(){
          return store;
      }

      void addNewRating(String productName,
                        String customer,
                        String comments,
                        int rating){
          Product product = new Product(productName);
          Rating newRating = new Rating(product, customer, comments, rating);
          store.addRating(newRating);
      }

      List<Rating> allRatings() {
          return store.getRatings();
      }

      void removeLastRating(){
          int lastRatingIndex = allRatings().size() - 1; /// subtract -1 to avoid out of index bonds
          store.getRatings().remove(lastRatingIndex);
      }

      List<Rating> ratingsByProduct(String product){
          List<Rating> ratings = allRatings();
          return ratings.stream()
                  .filter(rating -> rating.getProduct().getProduct().equals(product))
                  .collect(Collectors.toList());
      }

      int minRatingByProduct(String product){
          List<Rating> ratings = ratingsByProduct(product);
          return ratings.stream()
                  .mapToInt(Rating::getRating)
                  .min().orElse(0);
       }

      double avgRatingByProduct(String product){
        List<Rating> ratings = ratingsByProduct(product);
        return ratings.stream()
                .mapToDouble(Rating::getRating)
                .average().orElse(0.0);
      }

}
