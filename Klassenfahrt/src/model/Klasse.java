package model;

public class Klasse {
    String _name;
    int _schueleranzahl;
    double _durchschnittsalter;
    double _maxschuelerbudget;

    public Klasse(String name, int schueleranzahl, double durchschnittsalter, double maxschuelerbudget){
        setMaxschuelerbudget(maxschuelerbudget);
        setName(name);
        setSchueleranzahl(schueleranzahl);
        setDurchschnittsalter(durchschnittsalter);
    }

    public void setMaxschuelerbudget(double maxschuelerbudget) {
        this._maxschuelerbudget = maxschuelerbudget;
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setSchueleranzahl(int schueleranzahl) {
        this._schueleranzahl = schueleranzahl;
    }
    public void setDurchschnittsalter(double durchschnittsalter) {
        this._durchschnittsalter = durchschnittsalter;
    }
    public double getMaxschuelerbudget() {
        return _maxschuelerbudget;
    }
    public String getName() {
        return _name;
    }
    public int getSchueleranzahl() {
        return _schueleranzahl;
    }
    public double getDurchschnittsalter() {
        return _durchschnittsalter;
    }
}