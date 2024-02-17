package Obiect;

public class FabricaMasini {

    // constructor = are ca rol sa initializeze atributele unei clase
    // un constructor este public si are acelasi nume cu clasa
    // un constructor poate fi de 2 feluri: cu sau fara parametri
    // un constructor fara parametri se ma numeste si default
    // daca nu am definit un constructor, avem unul default
    // intr o clasa putem avea "n" constructori diferentiati prin numar sau tip de parametri

    // obiect = instanta unei clase
    // un obiect reprezinta o structura pe care o are clasa si din care poate accesa variabilele si metodele respective

    // dintr o clasa putem initializa "n" obiecte
    // in momentul in care initializam un obiect apelam constructorul din clasa


    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;

    public FabricaMasini(String marca, String model, String combustibil,
                         String transmisie, Integer an, Double motorizare) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
    }

    public FabricaMasini(String marca, String model, String combustibil,
                         String transmisie, Integer an, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareProdus(){
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Tipul de combustibil al masinii este " + combustibil);
        System.out.println("Transmisia este " + transmisie);
        System.out.println("Anul fabricatiei este " + an);
        System.out.println("Motorizarea este " + motorizare);
        if(pret != null) {
            System.out.println("Pretul masinii este " + pret);
        }
    }

    public void calculImpozit(){
        if(an>=2020 && combustibil.equals("Benzina")){
            System.out.println("Impozitul este 5 RON ");
        }
        else {
            System.out.println("Impozitul se calculeaza in functie de anul fabricatiei");
        }
    }

}
