package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_5_middle;

class SaleAnalyser {
    String findBestSeller(Sale[] array) {
        String bestSellerProduct ="";
        int unitsSold = 0;

        for (int i = 0; i < array.length; i++) {
            if (unitsSold < array[i].getUnitCount()) {
                unitsSold = array[i].getUnitCount();
                bestSellerProduct = array[i].getProduct();
            }
        }
        return bestSellerProduct;
    }
}
