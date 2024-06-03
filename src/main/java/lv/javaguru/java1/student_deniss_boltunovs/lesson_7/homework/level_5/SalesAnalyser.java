package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_5;

class SalesAnalyser {

   public String bestSellingProduct(Sale[] sales){
       return isNullOrEmpty(sales) ? null : bestSellingProductFullArray(sales);
   }

   private String bestSellingProductFullArray(Sale[] sales) {
        String product = sales[0].getProduct();
        int totalUnits = totalUnitCountPerProduct(sales, product);
        for (Sale sale : sales) {
           int currentProductTotalUnits =  totalUnitCountPerProduct(sales, sale.getProduct());
           if (currentProductTotalUnits > totalUnits) {
               product = sale.getProduct();
           }
        }
        return product;
    }

  private int totalUnitCountPerProduct(Sale[] sales, String product){
        int totalUnits = 0;
        for (int i = 0; i < sales.length; i++) {
            if ( product.equals(sales[i].getProduct()) ) {
                totalUnits += sales[i].getUnitCount();
            }
        }
        return totalUnits;
    }

   private boolean isNullOrEmpty(Sale[] sales) {
       return (sales == null) || (sales.length == 0);
   }

}
