package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_6_senior;

class AssetAnalyzer {

    double findAssetValueSum(Stock[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getAssetValue();
        }
        return sum;
    }

    double findMeanAssetReturn(Stock[] array) {
        double returnPercentSum = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                returnPercentSum += array[i].getReturnInPercents();
            }
                returnPercentSum = returnPercentSum / array.length;
        }
        return returnPercentSum;
    }



}
