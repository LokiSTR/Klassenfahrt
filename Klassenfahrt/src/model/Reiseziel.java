package model;

public class Reiseziel {
    String _reiseziel;
    String _hotel;
    double _preisproschueler;
    double _preisprolehrer;
    double _minschueleralter;

    public Reiseziel(String reiseziel, String hotel, double preisproschueler, double preisprolehrer, double minschueleralter){
        setReiseziel(reiseziel);
        setHotel(hotel);
        setPreisproschueler(preisproschueler);
        setPreisprolehrer(preisprolehrer);
        setMinschueleralter(minschueleralter);
    }

    public void setHotel(String hotel) {
        this._hotel = hotel;
    }
    public void setMinschueleralter(double minschueleralter) {
        this._minschueleralter = minschueleralter;
    }
    public void setPreisprolehrer(double preisprolehrer) {
        this._preisprolehrer = preisprolehrer;
    }
    public void setPreisproschueler(double preisproschueler) {
        this._preisproschueler = preisproschueler;
    }
    public void setReiseziel(String reiseziel) {
        this._reiseziel = reiseziel;
    }
    public String getHotel() {
        return _hotel;
    }
    public double getMinschueleralter() {
        return _minschueleralter;
    }
    public double getPreisprolehrer() {
        return _preisprolehrer;
    }
    public double getPreisproschueler() {
        return _preisproschueler;
    }
    public String getReiseziel() {
        return _reiseziel;
    }
}