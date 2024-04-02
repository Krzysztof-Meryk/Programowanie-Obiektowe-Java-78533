package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Witamy w systemie rezerwacji");
        System.out.println();
        displayHotelInformation();
        System.out.println();
        displayCompanyInformation();

        System.out.println("Dodawanie:");
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Podaj a");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj b");
        b = Integer.parseInt(scanner.nextLine());

        System.out.println("suma " + (a + b));

        String Dzien = "3";

        switch (Dzien) {

            case "1":
                System.out.println("Poniedziałek");
                break;
            case "2":
                System.out.println("Wtorek");
                break;
            case "3":
                System.out.println("Środa");
                break;
            case "4":
                System.out.println("Czwartek");
                break;
            case "5":
                System.out.println("Piątek");
                break;
            case "6":
            case "7":
                System.out.println("Weekend");
                break;
        }

    }


    public static void displayCompanyInformation(){
        System.out.println("Autorem systemu jest: ");
        System.out.println("           Krzysztof Meryk 78533");
        System.out.println("           ul. Programistów 32");
        System.out.println("           31-333 Kraków");
    }

    public static void displayHotelInformation(){
        System.out.println(" ------ Hotel Cloakwork Java -------- ");
        System.out.println("           ul. Programistów 32");
        System.out.println("           31-333 Kraków");
        System.out.println("           tel. 322 444 123");
    }



}