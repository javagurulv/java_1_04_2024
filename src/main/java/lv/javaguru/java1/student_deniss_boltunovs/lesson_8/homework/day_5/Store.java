package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_5;

import java.util.ArrayList;
import java.util.List;

class Store {
    private List<Rating> ratings ;

     Store(){
         this.ratings = new ArrayList<>();
     }

     List<Rating> getRatings() {
         return ratings;
     }

     void addRating(Rating newRating){
         this.ratings.add(newRating);
     }

}
