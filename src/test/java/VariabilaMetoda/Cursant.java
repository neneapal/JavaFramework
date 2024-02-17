package VariabilaMetoda;

import org.junit.Test;

public class Cursant {

    // Curs Automation

    // Clasa - un sablon specific unui obiect care contine variabile si metode
    // Identificam o clasa dupa cuvantul *class*
    // O clasa trebuie sa aiba un nume
    // Continutul unei clase se regaseste intre acolade
    // Intr un fisier java putem avea mai multe clase

    // Variabila - prprietate a unei clase
    // Variabilele sunt de 2 feluri: global si local
    // Variabila globala este vizibila peste tot in clasa
    // Variabila locala este vizibila doar in locul declarat
    // Variabila globala - public "tip de date" nume variabila
    // Variabila poate, sau nu, sa primeasca o valoare

    // Metoda - actiunea unei clase
    // Metodele sunt de 2 feluri: void si return
    // Void - metoda care executa si arata actiunea
    // Return - metoda care returneaza actiunea


    public String nume;
    public String prenume;
    public  Integer varsta;
    public String adresa;
    public  Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areStudii;

    @Test
    public void metodaTest(){
        afisareDate();
        calculMedie("Semestru 1", 5.0, 7.25);
        calculMedie("Semestru 2",6.75, 9.00);
        calculPret(50);
    }

    public void afisareDate(){
        nume="Palsoi";
        prenume="Alexandru";
        varsta=32;
        adresa="strada vietii, numarul 24";
        inaltime=1.69;
        greutate=76.0f;
        sex='M';
        areStudii=true;


        System.out.println("Numele cursantului este " +nume+" "+prenume);
        System.out.println ("Varsta cursantului este "+varsta);
        System.out.println ("Adresa cursantului este "+adresa);
        System.out.println ("Inaltimea cursantului este "+inaltime);
        System.out.println("Greutatea cursantului este "+ greutate);
        System.out.println("Sexul cursantului este "+ sex);
        System.out.println("Are cursantul studii? "+ areStudii);



    }

    public void calculMedie (String tipNote,Double nota1, Double nota2){
        Double rezultat = (nota1 + nota2)/2;
        System.out.println("Media notelor la "+tipNote+" este " + rezultat);
}
    public void calculPret (Integer reducere){
        Integer pret = 1000;
        System.out.println("Pretul initial al cursului este " + pret);
        Integer diferentaPret = (pret * reducere)/100;
        Integer pretFinal = pret - diferentaPret;
        System.out.println("Pretul final al cursului este " + pretFinal);
    }

}
