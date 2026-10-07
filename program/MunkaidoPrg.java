package program;

import classes.Munkaido;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Locale;

public class MunkaidoPrg {
    static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);

        ArrayList<Munkaido> nyilvantartas = new ArrayList<>();

        nyilvantartas.add((new Munkaido(LocalDate.of(2026, 9, 7), "A7FN4A")).setMunkaKezdete(LocalTime.of(7, 56)).setMunkaVege(LocalTime.of(15,59)));
        nyilvantartas.add((new Munkaido(LocalDate.of(2026, 9, 8), "N77GQ4")).setMunkaKezdete(LocalTime.of(8, 3)).setMunkaVege(LocalTime.of(16,10)));
        nyilvantartas.add((new Munkaido(LocalDate.of(2026, 9, 7), "L6VAZ9")).setMunkaKezdete(LocalTime.of(8, 0)).setMunkaVege(LocalTime.of(15,48)));
        nyilvantartas.add((new Munkaido(LocalDate.of(2026, 9, 10), "A7FN4A")).setMunkaKezdete(LocalTime.of(7, 38)).setMunkaVege(LocalTime.of(16,14)));
        nyilvantartas.add((new Munkaido(LocalDate.of(2026, 9, 8), "P8K9AA")).setMunkaKezdete(LocalTime.of(7, 43)).setMunkaVege(LocalTime.of(15,59)));
        nyilvantartas.add((new Munkaido(LocalDate.of(2026, 9, 9), "N77GQ4")).setMunkaKezdete(LocalTime.of(9, 9)).setMunkaVege(LocalTime.of(17,4)));

        System.out.println("Munkaidők: ");
        for (Munkaido munkaido : nyilvantartas){
            System.out.println(munkaido.getInfo());
        }

    }
}
