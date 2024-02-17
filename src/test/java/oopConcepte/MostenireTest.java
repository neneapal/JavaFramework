package oopConcepte;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test
    public void testMethod(){

        List<String> dotariAudiA5 = new ArrayList<>();
        dotariAudiA5.add("jenti");
        dotariAudiA5.add("trapa");
        dotariAudiA5.add("faruri");

        List<String> dotariAudiA7 = new ArrayList<>();
        dotariAudiA7.add("jenti");
        dotariAudiA7.add("trapa");
        dotariAudiA7.add("spoiler");
        dotariAudiA7.add("oglinzi electrice");


        List<String> dotariBMWX5interior = new ArrayList<>();
        dotariBMWX5interior.add("incalzire scaune");
        dotariBMWX5interior.add("clima bizonica");
        dotariBMWX5interior.add("GPS");

        List<String> dotariBMWX5exterior = new ArrayList<>();
        dotariBMWX5exterior.add("jenti");
        dotariBMWX5exterior.add("trapa");
        dotariBMWX5exterior.add("spoiler");
        dotariBMWX5exterior.add("oglinzi electrice");


//        FabricaAudi audiA5 = new FabricaAudi("A5",
//                "sedan", "negru", 20,dotariAudiA5);
//        audiA5.prezentareAudi();

        FabricaAudi audiA7 = new FabricaAudi("A7","SUV",
                "rosu", 40, dotariAudiA7);
        audiA7.prezentareAudi();

        audiA7.setModel("A8");
        audiA7.prezentareAudi();

        audiA7.afisareRezultate();
        audiA7.afisareRezultate("S5");
        audiA7.afisareRezultate("S5", 2022);
        audiA7.afisareRezultate(2023);

        audiA7.angajariFirma();



        FabricaBMW BMWX5 = new FabricaBMW("X5", "SUV", "albastru",
                30, dotariBMWX5exterior, dotariBMWX5interior);
        BMWX5.prezentareBMW();

        BMWX5.angajariFirma();





    }

}
