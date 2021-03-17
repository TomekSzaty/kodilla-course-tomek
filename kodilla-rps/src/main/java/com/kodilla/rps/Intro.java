package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

class PaierKamNoz {
    static Random rnd = new Random();
    static Scanner scan = new Scanner(System.in);
    static String name;
    static int losowanie;
    static String wybor;
    static String iloscRund;
    boolean end = false;
    static int iloscWygranych = 0;
    static int iloscPrzegranych = 0;
    static int iloscRemisow = 0;
    static int i = 0;


    public static void printTitle() {
        System.out.println();
        System.out.println(" " +
                " ____   ____  ____ ____    ___  ____         __  _   ____  ___ ___  ____    ___  ____          ____    ___   _____  __ __    __    ___ \n" +
                "|    \\ /    ||    \\    |  /  _]|    \\       |  |/ ] /    ||   |   ||    |  /  _]|    \\        |    \\  /   \\ |     ||  |  |  /  ]  /  _]\n" +
                "|  o  )  o  ||  o  )  |  /  [_ |  D  )_____ |  ' / |  o  || _   _ | |  |  /  [_ |  _  | _____ |  _  ||     ||__/  ||  |  | /  /  /  [_ \n" +
                "|   _/|     ||   _/|  | |    _]|    /|     ||    \\ |     ||  \\_/  | |  | |    _]|  |  ||     ||  |  ||  O  ||   __||  ~  |/  /  |    _]\n" +
                "|  |  |  _  ||  |  |  | |   [_ |    \\|_____||     ||  _  ||   |   | |  | |   [_ |  |  ||_____||  |  ||     ||  /  ||___, /   \\_ |   [_ \n" +
                "|  |  |  |  ||  |  |  | |     ||  .  \\      |  .  ||  |  ||   |   | |  | |     ||  |  |       |  |  ||     ||     ||     \\     ||     |\n" +
                "|__|  |__|__||__| |____||_____||__|\\_|      |__|\\_||__|__||___|___||____||_____||__|__|       |__|__| \\___/ |_____||____/ \\____||_____|\n" +
                "                                                                                                                                       ");
        System.out.println();
    }

    public static void play() {
        System.out.println(name + ": Podaj ilosc rund do rozegrania:");
        iloscRund = scan.nextLine();
        int iloscDoTab = Integer.parseInt(iloscRund);

        while (i != iloscDoTab) {
            System.out.println("Wybierz 1 (papier), 2 (kamień) lub 3 (nożyce).");
            wybor = scan.nextLine();
            int liczba = Integer.parseInt(wybor);
            i++;
            //komputer losuje
            losowanie = rnd.nextInt(4) + 1;

            if (liczba == 1 || liczba == 2 || liczba == 3) {
                //komp. zczytuje co wybrał użytkownik i wyświetla komunikat
                if (liczba == 1) {
                    System.out.println("Twój wybór to: \"papier\".");
                } else if (liczba == 2) {
                    System.out.println("Twój wybór to: \"kamień\".");
                } else {
                    System.out.println("Twój wybór to: \"nożyce\".");
                }
                //porównanie wyboru komputera i użytkownika oraz podanie wyniku
                if (losowanie == 1) {
                    System.out.println("Komputer ma \"papier\".");

                    if (liczba == 3) {
                        iloscWygranych++;
                        System.out.println("Wygrana!!!");
                        System.out.println();
                    } else if (liczba == 2) {
                        iloscPrzegranych++;
                        System.out.println("Przegrana :(");
                        System.out.println();
                    } else {
                        iloscRemisow++;
                        System.out.println("Remis");
                        System.out.println();
                    }
                } else if (losowanie == 2) {
                    System.out.println("Komputer ma \"kamień\".");

                    if (liczba == 1) {
                        iloscWygranych++;
                        System.out.println("Wygrana!!!");
                        System.out.println();
                    } else if (liczba == 3) {
                        iloscPrzegranych++;
                        System.out.println("Przegrana :(");
                        System.out.println();
                    } else {
                        iloscRemisow++;
                        System.out.println("Remis");
                        System.out.println();
                    }

                } else {
                    System.out.println("Komputer ma \"nożyce\".");

                    if (liczba == 2) {
                        iloscWygranych++;
                        System.out.println("Wygrana!!!");
                        System.out.println();
                    } else if (liczba == 1) {
                        iloscPrzegranych++;
                        System.out.println("Przegrana :(");
                        System.out.println();
                    } else {
                        iloscRemisow++;
                        System.out.println("Remis");
                        System.out.println();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        printTitle();
        System.out.println();
        System.out.println("Wpisz swoj \"nick\"");
        name = scan.nextLine();
        System.out.println(name + " Zagraj w papier-kamień-nożyce - klawisz 'T'\n Zakończ grę klawisz - 'X'  ");
        String startStop;
        startStop = scan.nextLine();

        if (startStop.equalsIgnoreCase("t")) {
            play();
            System.out.println(name + ":oto Twoje statystyki :)");
            System.out.println("Liczba rozegranych rund: " + i);
            System.out.println("Liczba wygranych rund: " + iloscWygranych);
            System.out.println("Liczba przegranych rund: " + iloscPrzegranych);
            System.out.println("Liczba remisowych rund: " + iloscRemisow);
            System.out.println();

        } else if (startStop.equalsIgnoreCase("x")) {
            System.out.println("Aby zakończyc - klawisz 'X");
            if (startStop.equalsIgnoreCase("x")) ;
        }
        System.out.println("Jesze raz ? klawisz- 'T' // zakoncz - klawisz - 'X'");
        Scanner scanner = new Scanner(System.in);
        String anotherTime = scanner.nextLine();
        if (anotherTime.equalsIgnoreCase("t")) {
            iloscWygranych = 0;
            iloscPrzegranych = 0;
            iloscRemisow = 0;
            i = 0;
            play();
        } else if (anotherTime.equalsIgnoreCase("x")) {
            return;
        } else {
            System.out.println("Zdecyduj się");
        }
    }
}



