package lv.javaguru.java1.student_anton_pereloma.lesson_8.homework.day_5;

class Review {
        private String author;
        private String reviewText;
        private int rating;

        Review(String author, String reviewText, int rating) {
            this.author = author;
            this.reviewText = reviewText;
            this.rating = rating;
        }

        public String getAuthor() { return author; }
        public String getReviewText() { return reviewText; }
        public double getRating() { return rating; }
        public void setAuthor(String authorName) {
            author = authorName;
        }
        public void setReviewText(String newReviewText) {
            reviewText = newReviewText;
        }
        public void setRating(int newRating) {
            rating = newRating;
        }
}
