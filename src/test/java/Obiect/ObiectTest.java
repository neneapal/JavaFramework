package Obiect;

import org.junit.Test;

public class ObiectTest {
    @Test
    public void testMethod(){
        FabricaMasini Volkswagen = new FabricaMasini("Volkswagen", "Golf5", "Benzina",
                "Manuala", 2006, 1.6);
        Volkswagen.prezentareProdus();
        Volkswagen.calculImpozit();
        System.out.println("===========================================================================================");
        FabricaMasini Audi = new FabricaMasini("Audi", "RS5", "Motorina",
                "Automata", 2023, 4.2);
        Audi.prezentareProdus();
        System.out.println("=============================================================================");
        FabricaMasini Mercedes = new FabricaMasini("Mercedes", "G Klass", "Motorina",
                "Automata", 2019, 5.0, 75000);
        Mercedes.prezentareProdus();
        Mercedes.calculImpozit();

    }
}
