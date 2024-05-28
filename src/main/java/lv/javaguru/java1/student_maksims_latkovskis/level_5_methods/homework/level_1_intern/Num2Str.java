package lv.javaguru.java1.student_maksims_latkovskis.level_5_methods.homework.level_1_intern;

class Num2Str {
    public String divNumber(int number){

        if(div3(number) == true && div5(number) == true) {
            return "FizzBuzz";
        }
        else if(div3(number) == true){
            return "Fizz";
        }
        else if(div5(number) == true){
            return "Buzz";
        }
        else{
            return "" + number;
        }
    }

    public boolean div3(int number){
       return (number % 3 == 0 );
    }
    public boolean div5(int number){
        return (number % 5 == 0);
    }
}

