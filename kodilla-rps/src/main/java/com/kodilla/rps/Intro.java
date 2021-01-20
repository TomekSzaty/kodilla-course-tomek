package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Intro {

    String [] names = {"Papier", "Kamień","Nożyce"};
    String name;
    int roundAmount;
    int select;
    String startGame;
    boolean end = false;
    Scanner scanner = new Scanner(System.in);
    Random rnd = new Random();


    public static String getString() {
        return new Scanner(System.in).next();
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }



    public   void startingGame() {
        System.out.println("ZAGRAJ W GRĘ \"PAPIER-KAMIEN-NOZYCE\".\n WPISZ SWOJE IMIE: ");
        name = getString();
        System.out.println( name.toUpperCase()+ " ILE RUND CHCESZ ZAGRAĆ ?");
        roundAmount = getInt();
        System.out.println(name.toUpperCase() + " zagrasz przeciwko \"komputerowi\" " +
                 + roundAmount + " rund. \n"+"Poznaj zasady gry" );
        System.out.println("klawisz 1 – zagranie \"kamień\".\n" +
                "klawisz 2 – zagranie \"papier\".\n" +
                "klawisz 3 – zagranie \"nożyce\".\n" +
                "klawisz x – zakończenie gry. \n" +
                "klawisz n – uruchomienie gry od nowa.");
        System.out.println("POWODZENIA :) \n ZEBY ROZPOCZAC GRE NACISNIJ \'SPACJA\'");
        startGame = scanner.nextLine();

        while (!end) {
            roundAmount = 0;
            System.out.println("Wpisz 1 (papier), 2 (kamień) lub 3 (nożyce).");
            if(scanner.nextInt() == 1) {
                System.out.println("Wybrałeś " + names[0]);
            }else if(scanner.nextInt() == 2) {
                System.out.println("Wybrałeś " + names[1]);
            }else {
                System.out.println("Wybrałeś " + names[2]);
            }
            select = rnd.nextInt(4) + 1;
            System.out.println("Komputer wybrał " + select);



            roundAmount++;

            end = true;
        }
    }
}
