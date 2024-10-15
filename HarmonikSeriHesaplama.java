package org.example;

import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number for calculation: ");
        int number = input.nextInt();
        double harmonicResult = 0;
        int counter = 1;

        if(number<0){
            System.out.println("The entered value must be greater than 0!");
            System.exit(number);
        }

        while (counter<=number){
            harmonicResult += (double) 1/counter;
            counter ++;
        }

        System.out.println("Harmonic series calculation result of the entered number: " + harmonicResult);

    }
}
