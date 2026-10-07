package classes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Munkaido {

    private LocalDate datum;
    private String dolgozoKod;
    private LocalTime munkaKezdete;
    private LocalTime munkaVege;

    public Munkaido(LocalDate datum, String dolgozoKod) {
        this.datum = datum;
        this.dolgozoKod = dolgozoKod;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String getDolgozoKod() {
        return dolgozoKod;
    }

    public LocalTime getMunkaKezdete() {
        return munkaKezdete;
    }

    public Munkaido setMunkaKezdete(LocalTime munkaKezdete) {
        this.munkaKezdete = munkaKezdete;
        return this;
    }

    public LocalTime getMunkaVege() {
        return munkaVege;
    }

    public Munkaido setMunkaVege(LocalTime munkaVege) {
        this.munkaVege = munkaVege;
        return this;
    }


    public Long munkaidoPercben(){
        if (munkaKezdete == null || munkaVege == null){
            return null;
        }else {
            return Duration.between(munkaKezdete, munkaVege).toMinutes();
        }
    }

    public Double munkaidoOraban(){
        if (munkaKezdete == null || munkaVege == null){
            return null;
        }else {
           return (double) (munkaidoPercben() / 60.0);
        }
    }

    public String getInfo(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY.MM.dd.");
        return  String.format("%s %s: %.2f óra (%d perc)", formatter.format(datum), dolgozoKod, munkaidoOraban(), munkaidoPercben());
    }
}
