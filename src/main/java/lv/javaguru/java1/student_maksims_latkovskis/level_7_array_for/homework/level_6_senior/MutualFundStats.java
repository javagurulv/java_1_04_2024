package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.homework.level_6_senior;

class MutualFundStats {


    double assetValueSum(Stock [] mutualFund){
        double assetValueSum = 0;
        for(int i=0; i<mutualFund.length; i++){
            assetValueSum += mutualFund[i].getAssetValue();
        }
        return assetValueSum;
    }

    double assetMeanMargin(Stock [] mutualFund){
        double assetMeanMargin = 0;
        for(int i=0; i<mutualFund.length; i++){
            assetMeanMargin += mutualFund[i].getReturnInPercents();
        }
        return assetMeanMargin / mutualFund.length;
    }
}
