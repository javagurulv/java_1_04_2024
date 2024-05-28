package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_2_intern;

class LeapYearCheck {

    public static void main(String[] args){

        LeapYear leapYear = new LeapYear();

        int[] yearsToCheck = {1905, 1900, 1996, 2000, 2001};

        for (int year : yearsToCheck){
            System.out.print("The year " + year + " is ");
            if(leapYear.isLeapYear(year) == false){
                System.out.println("not a leap year");
            }
            else{
                System.out.println("a leap year");
            }
        }
    }
}
