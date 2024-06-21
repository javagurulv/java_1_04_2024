package lv.javaguru.java1.student_deniss_boltunovs.lesson_8.homework.day_5;

class Product {
    private String product;

    Product(String product){
        this.product = product;
    }

    String getProduct(){
        return product;
    }

    @Override
    public String toString() {
        return  product ;
    }

}
