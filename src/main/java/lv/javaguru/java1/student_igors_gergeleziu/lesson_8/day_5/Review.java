package lv.javaguru.java1.student_igors_gergeleziu.lesson_8.day_5;

class Review {
    private String nick;
    private String reviewText;
    private int rating;
    private Product product;

    public Review(String nick, String reviewText, int rating, Product product) {
        this.nick = nick;
        this.reviewText = reviewText;
        this.rating = rating;
        this.product = product;
    }

    public String getNick() {
        return nick;
    }

    public int getRating() {
        return rating;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Review{" +
                "nick='" + nick + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", rating=" + rating +
                ", product=" + product +
                '}';
    }
}
