package lt.techin.rolandas;

// Sukuriame klase Automobilis
public class AutomobilisGetSet {
// Sukuriame geteri ir seteri atributui autoMarke
    private String autoMarke;

    public String getMarke() {
        return autoMarke;
    }

    public void setMarke(String marke) {
        this.autoMarke = marke;
    }
    // Sukuriame geteri ir seteri atributui autoModelis
    private String autoModelis;

    public String getModelis() {
        return autoModelis;
    }

    public void setModelis(String modelis) {
        this.autoModelis = modelis;
    }
    // Sukuriame geteri ir seteri atributui autoMetai
    private int autoMetai;

    public int getMetai() {
        return autoMetai;
    }

    public void setMetai(int metai) {
        this.autoMetai = metai;
    }
// Sukuriame klases main metoda
    public static void main(String[] args) {
// Sukuriame main klases ojekta kuris iskvies geteri ir seteri su nurodytais argumantais
        AutomobilisGetSet myObject = new AutomobilisGetSet();
        myObject.setMarke("Audi");
        myObject.setModelis("Q7");
        myObject.setMetai(2020);
// Isvedimo irenginyje/displejuje atspausdiname argumentu reiksmes
        System.out.println(myObject.autoMarke + " " + myObject.autoModelis + " " + myObject.autoMetai);
    }
}

