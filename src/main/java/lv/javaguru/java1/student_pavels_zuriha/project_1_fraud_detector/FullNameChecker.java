package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FullNameChecker {

    public boolean fullNameChecker(Trader trader) {
        if (trader.getFullName().equals("Pokemon")) {
            return false;
        } else {
            return true;
        }
    }
}
