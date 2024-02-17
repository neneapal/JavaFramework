package VariabilaMetoda;

import org.junit.Test;

public class Student {

    @Test
    public void metodaTest(){
        System.out.println(getMarire(35));
        calculMedie(8.5, 7.0,"semestrul 1");
    }




    //metoda care calculeaza salariul unei persoane dupa o marire
    public Integer getMarire(Integer procent){
        Integer salariu = 10000;
        Integer marire = (salariu*procent)/100;
        return salariu + marire;
    }


    public Double getMedie(Double nota1, Double nota2){
        return (nota1 + nota2)/2;
    }

    public void calculMedie(Double nota1, Double nota2, String text){
        System.out.println("Media pe " + text + " este:" + getMedie(nota1,nota2));
    }


}
