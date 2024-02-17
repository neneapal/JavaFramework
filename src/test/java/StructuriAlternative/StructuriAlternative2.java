package StructuriAlternative;

import org.junit.Test;

public class StructuriAlternative2 {

    @Test
    public void metodaTest(){

        zileleSaptamanii(7);

    }

    //reprezentam zilele saptamanii

    public void zileleSaptamanii(Integer zi){
        switch(zi){
            case 1:
                System.out.println("Astazi este duminica");
                break;
            case 2:
                System.out.println("Astazi este luni");
                break;
            case 3:
                System.out.println("Astazi este marti");
                break;
            case 4:
                System.out.println("Astazi este miercuri");
                break;
            case 5:
                System.out.println("Astazi este joi");
                break;
            case 6:
                System.out.println("Astazi este vineri");
                break;
            case 7:
                System.out.println("Astazi este sambata");
        }
    }

}
