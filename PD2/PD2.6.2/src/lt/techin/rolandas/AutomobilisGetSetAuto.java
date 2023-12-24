package lt.techin.rolandas;

public class AutomobilisGetSetAuto {
    // Sukuriame klases Automobilis atributus
    String autoMarke;
    String autoModelis;
    int autoMetai;
// IDE pagalba sukuriame Geterius ir Seterius atributams
    public String getAutoMarke() {
        return autoMarke;
    }

    public void setAutoMarke(String autoMarke) {
        this.autoMarke = autoMarke;
    }

    public String getAutoModelis() {
        return autoModelis;
    }

    public void setAutoModelis(String autoModelis) {
        this.autoModelis = autoModelis;
    }

    public int getAutoMetai() {
        return autoMetai;
    }

    public void setAutoMetai(int autoMetai) {
        this.autoMetai = autoMetai;
    }
    // Sukuriame klases main metoda
    public static void main(String[] args) {
// Sukuriame main klases ojekta kuris iskvies geteri ir seteri su nurodytais argumentais
        AutomobilisGetSetAuto myObject = new AutomobilisGetSetAuto();
        myObject.setAutoMarke("Audi");
        myObject.setAutoModelis("Q7");
        myObject.setAutoMetai(2020);
// Isvedimo irenginyje/displejuje atspausdiname argumentu reiksmes
        System.out.println(myObject.autoMarke + " " + myObject.autoModelis + " " + myObject.autoMetai);
    }

}
