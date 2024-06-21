package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_5;

class Rating {
    private Product product;

    private String customer;
    private String comments;
    private int rating;
    Rating(Product product,
           String customer,
           String comments,
           int rating) {
        this.product = product;
        this.customer = customer;
        this.comments = comments;
        this.rating = rating;
    }

    Product getProduct(){
        return product;
    }

    String getCustomer(){
        return customer;
    }

    String getComments(){
        return comments;
    }

    int getRating(){
        return rating;
    }

    @Override
    public String toString() {
        return  "{" +
                "product = " + product +
                ", customer = '" + customer + '\'' +
                ", comments = '" + comments + '\'' +
                ", rating = " + rating +
                '}';
    }

}
