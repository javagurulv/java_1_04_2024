package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_5;

class Review {
        String author;
        String reviewText;
        double rating;

        Review(String author, String reviewText, double rating) {
            this.author = author;
            this.reviewText = reviewText;
            this.rating = rating;
        }

        public String getAuthor() { return author; }
        public String getReviewText() { return reviewText; }
        public double getRating() { return rating; }
}
