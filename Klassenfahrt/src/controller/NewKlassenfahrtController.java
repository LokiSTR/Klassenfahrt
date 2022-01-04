package controller;
import model.*;
import view.*;

import java.util.ArrayList;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NewKlassenfahrtController {
    Output o = new Output();
    MainController mc;
    ArrayList<Klassenfahrt> klassenfahrt = new ArrayList<Klassenfahrt>();
    DateFormat format = new SimpleDateFormat("dd.mm.yyyy", Locale.GERMAN);

    public NewKlassenfahrtController(MainController mc){
        setMc(mc);
        setKlassenfahrt(klassenfahrt);

    }

    public void createKlassenfahrtData() throws ParseException{
        //Herr Paul und Herr Trampe
        ArrayList<Lehrer> lehrer1 = new ArrayList<Lehrer>();
        lehrer1.add(getMc().getLehrerCon().getLehrer().get(0));
        lehrer1.add(getMc().getLehrerCon().getLehrer().get(1));

        //Herr Pauk und Herr Odens
        ArrayList<Lehrer> lehrer2 = new ArrayList<Lehrer>();
        lehrer2.add(getMc().getLehrerCon().getLehrer().get(0));
        lehrer2.add(getMc().getLehrerCon().getLehrer().get(2));

        //Herr Trampe und Herr Odens
        ArrayList<Lehrer> lehrer3 = new ArrayList<Lehrer>();
        lehrer3.add(getMc().getLehrerCon().getLehrer().get(1));
        lehrer3.add(getMc().getLehrerCon().getLehrer().get(2));

        //Nur Herr Paul
        ArrayList<Lehrer> lehrer4 = new ArrayList<Lehrer>();
        lehrer4.add(getMc().getLehrerCon().getLehrer().get(0));

        //FEHLER Nur ein Lehrer 
        Klassenfahrt kl1 = new Klassenfahrt(getMc().getReisezielCon().getReiseziel().get(0), lehrer4 ,getMc().getKlasseCon().getKlasse().get(0), format.parse("17.01.2022"), format.parse("21.01.2022"));
        
        //FEHLER Nicht beide Lehrer haben die Vollmacht
        Klassenfahrt kl2 = new Klassenfahrt(getMc().getReisezielCon().getReiseziel().get(1), lehrer2 ,getMc().getKlasseCon().getKlasse().get(1), format.parse("06.06.2022"), format.parse("10.06.2022"));
        
        //FEHLER Schüler haben nicht genügend Budget 
        Klassenfahrt kl3 = new Klassenfahrt(getMc().getReisezielCon().getReiseziel().get(2), lehrer1 ,getMc().getKlasseCon().getKlasse().get(2), format.parse("07.02.2022"), format.parse("11.02.2022"));
        
        Klassenfahrt kl4 = new Klassenfahrt(getMc().getReisezielCon().getReiseziel().get(3), lehrer1 ,getMc().getKlasseCon().getKlasse().get(3), format.parse("20.12.2021"), format.parse("24.12.2021"));

        Klassenfahrt kl5 = new Klassenfahrt(getMc().getReisezielCon().getReiseziel().get(4), lehrer1 ,getMc().getKlasseCon().getKlasse().get(4), format.parse("27.12.2021"), format.parse("31.12.2021"));

        klassenfahrt.add(kl1);
        klassenfahrt.add(kl2);
        klassenfahrt.add(kl3);
        klassenfahrt.add(kl4);
        klassenfahrt.add(kl5);
    }

    public void notwBedingungen(){
        System.out.println("Fehler");
        for(Klassenfahrt k : klassenfahrt){
            System.out.println("Fehler");
            if(k.getZweiLehrer().get(0).getKlassenfahrterlaubnis() && k.getZweiLehrer().get(1).getKlassenfahrterlaubnis() ){
                o.printData("Die Qualifikation aller Lehrkräfte auf der Klassenfahrt der Klasse " + k.getKlasse().getName() + " ist nicht gewährleistet.");
            }
/**            else if(k.getKlasse().getMaxschuelerbudget() < k.getReiseziel().getPreisproschueler()){
                o.printData("Die Klassenfahrt der Klasse " + k.getKlasse().getName() + " ist nicht mit dem maximalen Budget der Schüler vereinbar.");
            }
            else if(k.getKlasse().getDurchschnittsalter() < k.getReiseziel().getMinschueleralter()){
                o.printData("Die geplante Unterkunft für die Klassenreise der Klasse " + k.getKlasse().getName() + " ist aufgrund der Altersbedingungen nicht für die Schüler geeignet.");
            }
            else{
                o.printData("Die geplante Klassenreise der Klasse " + k.getKlasse().getName() + " kann wie geplant stattfinden.");
            }*/}
    }

    /*
    //Oder soll das in die Klasse von der Klassenfahrt?
    public void notwBedingungen(){
        for(Klassenfahrt klassenfahrt : klassenfahrt){
            if((klassenfahrt.getZweiLehrer().get(1) != null) ||  ((klassenfahrt.getZweiLehrer().get(0).getKlassenfahrterlaubnis() != "ja") || (klassenfahrt.getZweiLehrer().get(1).getKlassenfahrterlaubnis() != "ja")) || (klassenfahrt.getKlasse().getMaxschuelerbudget() < klassenfahrt.getReiseziel().getPreisperschueler()) || (klassenfahrt.getKlasse().getSchuelerdurchschnittsalter() < klassenfahrt.getReiseziel().getMinschueleralter())){
                o.printData("Die Klassenfahrt der Klasse " + klassenfahrt.getKlasse().getName() + " nach " + klassenfahrt.getReiseziel().getReisezielname()+ " ist ungültig.");
            }
            else{
                o.printData("Die Klassenfahrt der Klasse " + klassenfahrt.getKlasse().getName() + " nach " + klassenfahrt.getReiseziel().getReisezielname()+ " ist genehmigt.");
            }
        }
    }
    */

    public void setKlassenfahrt(ArrayList<Klassenfahrt> klassenfahrt) {
        this.klassenfahrt = klassenfahrt;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public void setO(Output o) {
        this.o = o;
    }
    public ArrayList<Klassenfahrt> getKlassenfahrt() {
        return klassenfahrt;
    }
    public MainController getMc() {
        return mc;
    }
    public Output getO() {
        return o;
    }
}