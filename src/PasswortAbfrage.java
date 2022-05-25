/**
 * Author: Emirhan Bekmez
 * Date: 28.04.2022
 * Version: 0.1
 */

import java.util.Scanner;

public class PasswortAbfrage {
    public static void main(String[] args) {
        Scanner passwortEingabe = new Scanner(System.in);
        System.out.println("Vergebe eine Passwort");
        String passwortVergabe = passwortEingabe.next();
        pruefePassWort(passwortVergabe);
    }


    /** Überprüft die Eingabe mit dem vergebenen Passwort */
    static void pruefePassWort(String passWortVergabe){
        int i = 1;
        Scanner eingabePruefen = new Scanner(System.in);
        System.out.println("Gib dein Passwort ein");
        String passwortPruefung = eingabePruefen.nextLine();

        while (!passWortVergabe.equals(passwortPruefung) && i<3){
            System.out.println("Passwort Falsch. Neuer Versuch");
            passwortPruefung = eingabePruefen.next();
            i++;
        }
        if (passWortVergabe.equals(passwortPruefung)){
            System.out.println("Zugang gewährt");
        }
            else System.out.println("Passwort falsch, Zugang verweigert. Wenden sie sich an den System-Administrator");
    }
}
