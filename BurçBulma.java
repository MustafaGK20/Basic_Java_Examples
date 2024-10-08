package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BurçBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int month,day,year;


        String[] horoscope = {"Capricorn","Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius"};

        ArrayList<String> horoscopes = new ArrayList<String>(Arrays.asList(horoscope));



        System.out.println("The day you were born: ");
        day = input.nextInt();

        System.out.println("The month you were born: ");
        month = input.nextInt();

        System.out.println("The year you were born: ");
        year = input.nextInt();

        switch (month){
            case 1:
                if(day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.printf("I am a " + horoscopes.getFirst() + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(1) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 2:
                if(day >= 1 && day <= 28 ){
                    if(day < 20){
                        System.out.printf("I am a " + horoscopes.get(1) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(2) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 3:
                if(day >= 1 && day <= 31 ){
                    if(day < 21){
                        System.out.printf("I am a " + horoscopes.get(2) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(3) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 4:
                if(day >= 1 && day <= 30 ){
                    if(day < 21){
                        System.out.printf("I am a " + horoscopes.get(3) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(4) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 5:
                if(day >= 1 && day <= 30 ){
                    if(day < 22){
                        System.out.printf("I am a " + horoscopes.get(4) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(5) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 6:
                if(day >= 1 && day <= 30 ){
                    if(day < 23){
                        System.out.printf("I am a " + horoscopes.get(5) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(6) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 7:
                if(day >= 1 && day <= 31 ){
                    if(day < 23){
                        System.out.printf("I am a " + horoscopes.get(6) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(7) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 8:
                if(day >= 1 && day <= 31 ){
                    if(day < 23){
                        System.out.printf("I am a " + horoscopes.get(7) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(8) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 9:
                if(day >= 1 && day <= 30 ){
                    if(day < 23){
                        System.out.printf("I am a " + horoscopes.get(8) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(9) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 10:
                if(day >= 1 && day <= 31 ){
                    if(day < 23){
                        System.out.printf("I am a " + horoscopes.get(9) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.get(10) + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 11:
                if(day >= 1 && day <= 30 ){
                    if(day < 22){
                        System.out.printf("I am a " + horoscopes.get(10) + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.getLast() + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;

            case 12:
                if(day >= 1 && day <= 31 ){
                    if(day < 22){
                        System.out.printf("I am a " + horoscopes.getLast() + " born on " + day + "/" + month + "/" + year);
                    } else {
                        System.out.printf("I am a " + horoscopes.getFirst() + " born on " + day + "/" + month + "/" + year);
                    }
                } else {
                    System.out.println("An invalid day was entered.");
                }
                break;
            default:
                System.out.println("An invalid month was entered.");

        }
    }
}

/*
Koç(Aries) Burcu : 21 Mart - 20 Nisan

Boğa(Taurus) Burcu : 21 Nisan - 21 Mayıs

İkizler(Gemini) Burcu : 22 Mayıs - 22 Haziran

Yengeç(Cancer) Burcu : 23 Haziran - 22 Temmuz

Aslan(Leo) Burcu : 23 Temmuz - 22 Ağustos

Başak(Virgo) Burcu : 23 Ağustos - 22 Eylül

Terazi(Libra) Burcu : 23 Eylül - 22 Ekim

Akrep(Scorpio) Burcu : 23 Ekim - 21 Kasım

Yay(Sagittarius) Burcu : 22 Kasım - 21 Aralık

Oğlak(Capricorn) Burcu : 22 Aralık - 21 Ocak

Kova(Aquarius) Burcu : 22 Ocak - 19 Şubat

Balık(Pisces) Burcu : 20 Şubat - 20 Mart

 */