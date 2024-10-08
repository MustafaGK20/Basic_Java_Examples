package org.example;

import java.util.*;

public class ArrayMaxValue {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int listlength;
        int randomValue;
        int value;
        int subtractMaxValue;
        int maxValue;

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> newNumbers = new ArrayList<>();

        System.out.println("Enter the array length:");
        listlength = input.nextInt();

        System.out.println("Enter the max value for random number generation:");
        randomValue = input.nextInt();

        for(int k=0 ; k<listlength; k++){
            value = random.nextInt(randomValue)+1;
            numbers.add(value);
        }
        System.out.println(numbers);

        maxValue = numbers.get(0);

        for(Integer number:numbers){
            if(maxValue<number){
                maxValue=number;
            }
        }

        System.out.println(maxValue);

        for (int l=0; l<numbers.size(); l++){
            subtractMaxValue = maxValue - numbers.get(l);
            newNumbers.add(subtractMaxValue);
        }

        System.out.println(newNumbers);

    }
}
