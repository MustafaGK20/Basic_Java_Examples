package org.example;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int number;
        double value,fact=1;
        boolean asalMi= true;

        System.out.println("Enter the number: ");
        number= input.nextInt();

        if(number == 1){
            asalMi = false;
            System.out.println("The entered number " + number + " isn't prime.");
            return;
        } else if (number < 1) {
            asalMi = false;
            System.out.println("The entered number " + number + " isn't prime.");
            return;
        } else{
            for(int i=2; i<number; i++){
                if(number % i == 0){
                    asalMi= false;
                }
        }
        }

        if(asalMi) {
            System.out.println("The entered number " + number + " is prime.");
            for (value = 1; value <= number; value++) {
                fact = fact * value;
            }
            System.out.println("Factorial of " + number + " is: " + fact);
        }else {
            System.out.println("The entered number " + number + " isn't prime.");
        }

    }
}
