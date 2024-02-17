package oopConcepte;

public class FabricaMasina {

    // OOP = programare orientata pe obiecte
    // 4 principii = mostenire, incapsulare, abstractizare, polimorfism
    // mostenire - conceptul prin care clasa parinte este mostenita de clasa copil
    // in java o clasa poate sa mosteneasca doar o singura clasa
    // clasa copil trebuie sa apeleze constructorul din clasa parinte
    // copilul are vizibilitate asupra metodelor/ variabilelor din parinte daca sunt publice/ protected
    // ca sa apelam constructorul parinte in clasa copil vom folosi super

    // access control: public, private, protected, default
    // public = ofera vizibilitate pentru oricine si oriunde (in tot proiectul)
    // private = ofera vizibilitate doar in interiorul clasei




    private String marca;
    private String model;
    private String sasiu;
    private String culoare;
    private Integer motorizare;

    public FabricaMasina(String marca, String model, String sasiu, String culoare, Integer motorizare) {

        this.marca = marca;
        this.model = model;
        this.sasiu = sasiu;
        this.culoare = culoare;
        this.motorizare = motorizare;

    }

    public void prezentareMasina(){

        System.out.println("marca masinii este " + marca);
        System.out.println("modelul masinii este " + model);
        System.out.println("sasiul masinii este " + sasiu);
        System.out.println("culoarea masinii este " + culoare);
        System.out.println("motorizarea masinii este " + motorizare);


    }

    // polimorfism - conceptul prin care o metoda poate suferi modificari la nivel de continut sau structura
    // polimorfismul este de 2 feluri: dinamic(override) sau static(overload)
    // polimorfismul dinamic - intr o ierarhie de clase extinse prin mostenire, o metoda poate avea implementari diferite
    // polimorfismul static - mai multe metode pot avea acelasi nume cu conditia sa se diferentieze prin tipul sau numarul de parametri
    // NU SE POATE APLICA POLIMORFISM LA METODELE CU RETURN, DOAR LA CELE CU VOID

    // POLIMORFISM DINAMIC

    public void angajariFirma(){
        System.out.println("Fabrica mama nu mai face angajari");
    }


    // ca sa accesam valoarea unei variabile cu private ne folosim de conceptul GET
    // ca sa modificam valoarea unei variabile pivate cu private ne folosim de conceptul SET


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Integer getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(Integer motorizare) {
        this.motorizare = motorizare;
    }
}
