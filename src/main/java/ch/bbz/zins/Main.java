package ch.bbz.zins;

import ch.bbz.zins.aufgaben.FunktionaleZinsen;
import ch.bbz.zins.aufgaben.ImperativeZinsen;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.Scanner;

/**
 * This is the main class of the program for processing interest rate data.
 * It allows the user to choose between the imperative and the functional version of the program.
 * Autor: Jamie Niederhauser und Robin Bühler
 * Version: 1.0
 */

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        // Creating objects for the imperative and functional version of the program
        ImperativeZinsen imperativeZinsen = new ImperativeZinsen();
        FunktionaleZinsen funktionaleZinsen = new FunktionaleZinsen();

        // Scanner for entering user decisions
        Scanner scan = new Scanner(System.in);
        System.out.println("Which programm you want to start? ");
        System.out.println("Enter 1. for the imperative version and\n the 2 for the functional version");
        String eingabe = scan.nextLine();

        switch (eingabe) {
            // start the imperative version from the programm
            case "1":
                imperativeZinsen.averageYear();
                imperativeZinsen.averageMonth();
                imperativeZinsen.updatedValue();
                break;
            // start the functional version from the programm
            case "2":
                funktionaleZinsen.averageYear();
                funktionaleZinsen.averageMonth();
                funktionaleZinsen.updatedValue();
                break;
            default:
                System.out.println("You enter a wrong input");
        }
    }
}
