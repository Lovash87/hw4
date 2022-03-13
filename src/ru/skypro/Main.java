package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// задание 1

        int currentNum = 0;
        while (currentNum < 10) {
            System.out.println(++currentNum);}
        System.out.println();
        for (; currentNum > 0; currentNum--){
            System.out.println(currentNum);
        }

    // задание 2
        int firstFridy = 2;
        for (int currentFridy = firstFridy; currentFridy <= 31; currentFridy += 2) {
            System.out.println("Подготовьте отчет, сегодня пятница " + currentFridy);
        }

    // задание 3
        int currentYear = LocalDate.now().getYear();
        int start = currentYear - 200;
        int finish = currentYear + 100;
        for (int year = start; year <= finish; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }

    }
}
