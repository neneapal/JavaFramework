package StructuriRepetitive;

import org.junit.Test;

public class lectie1 {

    // structuri repetitive: for, while, for each

    @Test
    public void metodaTest(){
       // afisareNumereFor();
       // afisareNumereWhile();
       // afisareNume();
       // sumaNumere();
        numereDivizibile();


    }

    // afisam primele 10 numere

    public void afisareNumereFor(){

        for (Integer index=0; index<10; index++){
            System.out.println(index);
        }


    }

    public void afisareNumereWhile(){

        Integer index = 0;
        while (index<50){
            System.out.println(index);
            index++;
        }
    }

    // afisam numele nostru de 5 ori

    public void afisareNume(){

        for(Integer index = 0; index<5; index++){
            System.out.println("Alex");
        }

    }

    // calculam suma primelor 10 numere

    public void sumaNumere(){

        Integer index = 0;
        Integer suma = index;
        while (index<=10){
            suma = suma + index;
            index++;
        }
        System.out.println("Suma numereleor este " + suma);

    }

    // afisam primele 3 numere divizibile cu 5

    public void numereDivizibile(){
        Integer contor = 0;
        for(Integer index = 0; index <= 100; index++){
            if(index % 5 ==0 && contor<3){
                contor++;
                System.out.println(index);
            }
//            if (contor == 3){
//                break;
//            }
        }

    }



}
