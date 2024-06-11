package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_5;

class SaleReport {
    String findBestSellingProductByUnitCount(Sale[] array) {
        int maxSoldUnitCount = 0;
        int productIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getUnitCount() > maxSoldUnitCount) {
                maxSoldUnitCount = array[i].getUnitCount();
                productIndex = i;
            }
        }
        return array[productIndex].getProduct();
    }

    String findBestSellingProductBySalesTurnover(Sale[] array) {
        double maxSaleTurnover = 0;
        int productIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getPricePerUnit() * (double) array[i].getUnitCount() > maxSaleTurnover) {
                maxSaleTurnover = array[i].getPricePerUnit() * (double) array[i].getUnitCount();
                productIndex = i;
            }
        }
        return array[productIndex].getProduct();
    }
}



