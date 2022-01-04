package controller;
import java.text.ParseException;

import view.Output;

public class MainController {
    NewKlassenfahrtController klassenfahrtcon;
    NewKlasseController klassecon;
    NewLehrerController lehrercon;
    NewReisezielController reisezielcon;
    Output o = new Output();

    public MainController(){
        setKlasseCon(new NewKlasseController(this));
        setLehrerCon(new NewLehrerController(this));
        setReisezielCon(new NewReisezielController(this));
        setKlassenfahrtCon(new NewKlassenfahrtController(this));
        
    }

    public void createDemoData() throws ParseException{
        getKlasseCon().createKlasseData();
        getLehrerCon().createLehrerData();
        getReisezielCon().createReisezielData();
        getKlassenfahrtCon().createKlassenfahrtData();
    }

    public void ausfuehrenBedingungen(){
        getKlassenfahrtCon().notwBedingungen();
    }


    //Setter und Getter

    public void setKlassenfahrtCon(NewKlassenfahrtController klassenfahrtcon) {
        this.klassenfahrtcon = klassenfahrtcon;
    }
    public void setKlasseCon(NewKlasseController klassecon) {
        this.klassecon = klassecon;
    }
    public void setLehrerCon(NewLehrerController lehrercon) {
        this.lehrercon = lehrercon;
    }
    public void setReisezielCon(NewReisezielController reisezielcon) {
        this.reisezielcon = reisezielcon;
    }
    public void setO(Output o) {
        this.o = o;
    }
    
    public NewKlassenfahrtController getKlassenfahrtCon() {
        return klassenfahrtcon;
    }
    public NewKlasseController getKlasseCon() {
        return klassecon;
    }
    public NewLehrerController getLehrerCon() {
        return lehrercon;
    }
    public NewReisezielController getReisezielCon() {
        return reisezielcon;
    }
        public Output getO() {
        return o;
    }
}