package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_2_intern;

class LeapYear {

    boolean isLeapYear(int year){

        // Normally every fourth year is the leap year
        if (year % 4 == 0){
            // Excluding the cases when it is the century
            if(year % 100 == 0) {
                // But every fourth century year is the leap year
                if(year % 400 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}
