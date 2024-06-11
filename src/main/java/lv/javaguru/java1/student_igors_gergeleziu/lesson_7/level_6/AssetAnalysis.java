package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_6;

class AssetAnalysis {
    double calculateTotalAssetValue(Stock[] array) {
        double totalAssetValue = 0;
        for (int i = 0; i < array.length; i++) {
            totalAssetValue += array[i].getAssetValue();
        }
        return totalAssetValue;
    }

    double calculateTotalReturnValue(Stock[] array) {
        double totalReturnValue = 0;
        for (int i = 0; i < array.length; i++) {
            totalReturnValue += array[i].getAssetValue() / 100.0 * array[i].getReturnInPercents();
        }
        return totalReturnValue;
    }

    double calculateAverageReturnPercentage(Stock[] array) {
        double totalAssetValue = calculateTotalAssetValue(array);
        double totalReturnValue = calculateTotalReturnValue(array);
        return (totalReturnValue * 100) / totalAssetValue;
    }
}
