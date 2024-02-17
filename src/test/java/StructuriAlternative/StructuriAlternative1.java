package StructuriAlternative;

import org.junit.Test;

public class StructuriAlternative1 {
    // structurile pot sa fie de 2 feluri: alternative si repetitive
    // structuri alternative: if....then...else, switch case

    @Test
    public void testMethod(){
//        verificNumarMaiMare(9);
//        verificNumarMaiMare(2);
//        verificNumarMaiMare(5);
//        verificNumarMaiMare(4);
//        verificNumarMaiMare(6);
          verificNumarPar(1);
          verificNumarPar(2);
          verificNumarPar(3);
          verificNumarPar(0);
          verificNumarPar(-1);
          verificNumarPar(-3);
          verificNumarPar(-298);
//        persoanaMajora(17);
//        persoanaMajora(18);
//        persoanaMajora(24);


    }

    // verificam daca un numar este mai mare decat 5
    public void verificNumarMaiMare(Integer numar){
        if (numar>5){
            System.out.println("numarul " +numar+ " e mai mare decat 5");
        }
        else{
            System.out.println("nuamrul "+numar+" e mai mic decat 5");
        }
    }

    // verificam daca un numar este par si pozitiv

    public void verificNumarPar(Integer numar) {
        // daca vreau catul impartirii = / (div)
        // daca vreau restul impartirii = % (mod)
        if (numar > 0) {
            if(numar % 2 == 0){
                System.out.println("Numarul "+numar +" este par si pozitiv");
            } else{
                System.out.println("Numarul "+numar +" este impar si pozitiv");
            }
        } else if (numar < 0) {
          if(numar % 2 == 0){
              System.out.println("Numarul "+numar+" este par si negativ");

          } else if(numar > 0){
              if (numar % 2 != 0){
                  System.out.println("Numarul "+numar +" este impar si pozitiv");
              }
          } else if (numar < 0){
              if(numar % 2 != 0){
                  System.out.println("Numarul "+numar +" este impar si negativ");
              }
          }
        } else {
            System.out.println("Numarul este 0");
        }

        }


        // verificam daca o persoana este majora

//    public void persoanaMajora(Integer varsta){
//        if (varsta>=18){
//            System.out.println("Persoana este majora");
//        }
//        else{
//            System.out.println("Persoana este minora");
//        }
//
//    }

}
