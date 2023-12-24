package lt.techin.rolandas;
// Sukuriame klase Automobilis
public class Automobilis {
// Sukuriame klases Automobilis atributus
    String autoMarke;
    String autoModelis;
    int autoMetai;
// Sukuriame klases Automobilis konstruktoriu
    public Automobilis(String marke, String modelis, int metai) {
        autoMarke = marke;  // Aprasome klases atributa autoMarke
        autoModelis = modelis;  // Aprasome klases atributa autoModelis
        autoMetai = metai;  // Aprasome klases atributa autoMetai

    }
// Sukuriame klases main metoda
    public static void main(String[] args) {
// Sukuriame main klases ojekta kuris iskvies konstruktoriu su nurodytais argumantais
        Automobilis myObject = new Automobilis("Audi", "Q7", 2020);
// Isvedimo irenginyje/displejuje atspausdiname argumentu reiksmes
        System.out.println(myObject.autoMarke + " " + myObject.autoModelis + " " + myObject.autoMetai);
    }

}
