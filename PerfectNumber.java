package org.example;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int number, toplam=0;

        System.out.println("Enter the positive number:");
        number= input.nextInt();

        if((number == 0) || (number == 1)){
            System.out.println("The number entered is " + number + ".");
            System.out.println("The number " + number + " isn't a perfect number.");
            return;
        }else if(number < 0){
            System.out.println("The number entered is " + number + ", which is negative.");
            return;
        }

        for(int i=1; i<number; i++){
            if(number % i == 0){
                toplam = toplam + i;
            }
        }

        if(toplam == number){
            System.out.println("The number " + number + " is a perfect number.");
        }else{
            System.out.println("The number " + number + " isn't a perfect number.");
        }
    }
}
