package model;
import java.util.ArrayList;
import java.util.Date;

public class Klassenfahrt {
    Reiseziel _reiseziel;
    Klasse _klasse;
    Date _startdatum;
    Date _endedatum;

    ArrayList<Lehrer> zweilehrer = new ArrayList<Lehrer>();

    public Klassenfahrt(Reiseziel reiseziel, ArrayList<Lehrer> zweilehrer, Klasse klasse, Date startdatum, Date endedatum){
        setKlasse(klasse);
        setZweiLehrer(zweilehrer);
        setReiseziel(reiseziel);
        setEndedatum(endedatum);
        setStartdatum(startdatum);
    }

    public void setKlasse(Klasse klasse) {
        this._klasse = klasse;
    }
    public void setZweiLehrer(ArrayList<Lehrer> zweilehrer) {
        this.zweilehrer = zweilehrer;
    }
    public void setReiseziel(Reiseziel reiseziel) {
        this._reiseziel = reiseziel;
    }
    public void setEndedatum(Date endedatum) {
        this._endedatum = endedatum;
    }
    public void setStartdatum(Date startdatum) {
        this._startdatum = startdatum;
    }
    public Klasse getKlasse() {
        return _klasse;
    }
    public ArrayList<Lehrer> getZweiLehrer() {
        return zweilehrer;
    }
    public Reiseziel getReiseziel() {
        return _reiseziel;
    }
    public Date getStartdatum() {
        return _startdatum;
    }
    public Date getEndedatum() {
        return _endedatum;
    }
}