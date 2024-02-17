package oopConcepte;


import java.util.List;

public class FabricaAudi extends FabricaMasina {

    public Integer pretStandard;
    public Integer pretFinal;
    public List<String> dotariExterioare;


    public FabricaAudi(String model, String sasiu, String culoare, Integer pret,
                       List<String> dotariExterioare) {
        super("Audi", model, sasiu, culoare, pret);
        this.dotariExterioare = dotariExterioare;
    }

    public void prezentareAudi(){

        prezentareMasina();
        definirePretModel();
        calculPretFinal();
        if(dotariExterioare == null){
            System.out.println("pretul standard este " + pretStandard);
        } else {
            System.out.println("pretul standard este " + pretStandard);
            System.out.println("pretul final este " + pretFinal);
        }
        System.out.println("pretul standard este " + pretStandard);
        System.out.println("dotarile exterioare sunt " + dotariExterioare);
    }

    public void definirePretModel(){

        switch (getModel()){
            case "A5":
                pretStandard = 40000;
                break;
            case "A7":
                pretStandard = 70000;
                break;
            default:
                System.out.println("Acest model nu mai este pe stoc");
        }
    }

    public void calculPretFinal() {
        Integer pretDotari = 0;
        for (Integer i = 0; i < dotariExterioare.size(); i++) {
            switch (dotariExterioare.get(i)) {
                case "jenti":
                    pretDotari = pretDotari + 500;
                    break;
                case "trapa":
                    pretDotari = pretDotari + 900;
                    break;
                case "faruri":
                    pretDotari = pretDotari + 1200;
                    break;
                case "spoiler":
                    pretDotari = pretDotari + 650;
                    break;
                case "oglinzi electrice":
                    pretDotari = pretDotari + 2000;
                    break;



            }
        }
        pretFinal = pretStandard + pretDotari;
    }

    public Integer getPretStandard() {
        return pretStandard;
    }

    public Integer getPretFinal() {
        return pretFinal;
    }

    public List<String> getDotariExterioare() {
        return dotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        this.dotariExterioare = dotariExterioare;
    }

    // suprascriem metoda "angajari" din parinte - propria implementare a fabricii cu acelasi nume
    public void angajariFirma(){
        System.out.println("Fabrica Audi are 4 locuri disponibile");
    }

    // polimorfism static

    public void afisareRezultate(){
        System.out.println("Fabrica a facut 15 masini");
    }

    public void afisareRezultate(String marca){
        System.out.println("Fabrica a facut 10 masini cu marca S");
    }

    public void afisareRezultate(String marc, Integer an){
        System.out.println("Fabrica a facut 10 masini cu marca S din anul 2020");
    }

    public void afisareRezultate(Integer an){
        System.out.println("Fabrica a facut 15 masini in 2020");
    }

}
