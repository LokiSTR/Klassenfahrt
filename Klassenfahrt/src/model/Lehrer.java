package model;

public class Lehrer {
    String _vorname;
    String _nachname;
    boolean _klassenfahrterlaubnis = false;

    public Lehrer(String vorname, String nachname, Boolean klassenfahrterlaubnis){
        setVorname(vorname);
        setNachname(nachname);
        setKlassenfahrterlaubnis(klassenfahrterlaubnis);
    }

    

    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public void setKlassenfahrterlaubnis(boolean _klassenfahrterlaubnis) {
        this._klassenfahrterlaubnis = _klassenfahrterlaubnis;
    }
    public String getNachname() {
        return _nachname;
    }
    public String getVorname() {
        return _vorname;
    }
    public boolean getKlassenfahrterlaubnis(){
        return this._klassenfahrterlaubnis;
    }

}