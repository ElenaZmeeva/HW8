package com.company;

import java.time.LocalDate;


public class Main {
    //Task 1
    public static void leapYear(int year) {
        if ((year % 4 == 0) || (year % 100 == 0) && (year % 400 == 0)) {
            System.out.print(year + " - високосный год   ");
        } else {
            System.out.println(year + " - не високосный год  ");
        }

    }

    public static void checkDevice(String name, int year) {
        if (name.equals("IOS") && year >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else {
            System.out.println(" Установите версию приложения для Android по ссылке.");
        }
        if (name.equals("IOS") && year < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void checkDays(int distance) {
        int day = 1;
        if (distance <= 20) {
            System.out.println("  Потребуется: " + day + " дней.");
        } else if (distance > 20 && distance <= 60) {
            System.out.println(" Потребуется: " + (day + 1) + " дня.");
        } else if (distance > 60 && distance <= 100) {
            System.out.println(" Потребуется: " + (day + 2) + " дня.");
        } else {
            System.out.println(" Доставка не производится.");

        }
    }
public static void checkString (String s) {
        char [] myArray = s.toCharArray();
        for (int i=0; i< myArray.length-1; i++){
            for (int k=i+1; k< myArray.length; k++){
                if (myArray[i]==myArray[k]){
                    System.out.print(myArray[k]+ " ");
                    break;
                }
            }
        }
}
public static void reverseArr ( ){
    int [] arr={5,7,1,3,4};
        for (int k =arr.length-1; k>=0; k --) {
            System.out.print(arr [k]);
        }
}

    public static void main(String[] args) {
        //Task 1
        leapYear(2020);
        //Task 2
        checkDevice("IOS", 2014);
//Task 3
        checkDays(95);
//Task 4
checkString("aafreehhjuy");
        System.out.println();
        //Task 5
reverseArr();

        }
    }

