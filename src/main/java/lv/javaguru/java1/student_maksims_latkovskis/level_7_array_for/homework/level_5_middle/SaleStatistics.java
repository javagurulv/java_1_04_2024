package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.homework.level_5_middle;

class SaleStatistics {


    int mostSales(Sale [] sales){

        Sale item = sales[0];
        int unitIndex = 0;
        int unitsCount = item.getUnitCount();
        for(int i=0; i<sales.length; i++){
           item = sales[i];
           if(item.getUnitCount() > unitsCount){
               unitsCount = item.getUnitCount();
               unitIndex = i ;
           }
        }
        System.out.println("The top selling item is: " + sales[unitIndex].getProduct());
        System.out.println("With the total count of: " + sales[unitIndex].getUnitCount());
        return unitIndex;
    }

    int mostIncome(Sale [] sales){

        Sale item = sales[0];
        int unitIndex = 0;
        double unitIncome = item.getUnitCount()*item.getPricePerUnit();
        for(int i=0; i<sales.length; i++){
            item = sales[i];
            if((item.getUnitCount()*item.getPricePerUnit()) > unitIncome){
                unitIncome =item.getUnitCount()*item.getPricePerUnit();
                unitIndex = i ;
            }

        }
        System.out.println("The most profitable item is: " + sales[unitIndex].getProduct());
        System.out.println("With the grand total of: " + (sales[unitIndex].getUnitCount()*sales[unitIndex].getPricePerUnit()));
        return unitIndex;
    }




}
