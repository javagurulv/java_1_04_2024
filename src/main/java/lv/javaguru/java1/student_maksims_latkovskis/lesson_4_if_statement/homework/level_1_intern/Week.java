package lv.javaguru.java1.student_maksims_latkovskis.lesson_4_if_statement.homework.level_1_intern;

import java.util.Scanner;

class Week {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number from 1 to 7:");
        int inputNumber = 0;
          while(inputNumber<1 || inputNumber>8) {
              inputNumber = scanner.nextInt();
              System.out.println("Print the valid number");
          }

          if(inputNumber==1){
              System.out.println("Monday");}

          else if(inputNumber==2){
              System.out.println("Tuesday");}

          else if(inputNumber==3){
              System.out.println("Wednesday");}

          else if(inputNumber==4){
              System.out.println("Thursday");}

          else if(inputNumber==5){
              System.out.println("Friday");}

          else if(inputNumber==6){
              System.out.println("Saturday");}

          else{
              System.out.println("Sunday");}
    }


}
