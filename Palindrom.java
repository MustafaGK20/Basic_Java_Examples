package org.example;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String inputWord;
        String word;
        int i = 0;
        int wordLength;
        boolean isPalindrom = true;

        System.out.println("Enter a word:");
        inputWord= input.nextLine();

        word= inputWord.toLowerCase();
        System.out.println(word.toLowerCase());
        wordLength = word.length()-1;

        while (i < wordLength){
            if(word.charAt(i) != word.charAt(wordLength)){
                isPalindrom = false;
            }
            i++;
            wordLength--;

        }
        System.out.println(isPalindrom);

    }
}
