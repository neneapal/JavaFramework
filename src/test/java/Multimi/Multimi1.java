package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi1 {

    @Test
    public void metodaTest() {
        tariOrase();
        reteteGatit("tiramisu");

    }


        //reprezentam niste tari si orase

        public void tariOrase() {
            HashMap<String, List<String>> testData = new HashMap<>();

            List<String> oraseRomania = new ArrayList<>();
            oraseRomania.add("Timisoara");
            oraseRomania.add("Lugoj");
            oraseRomania.add("Cluj");

            List<String> oraseSpania = new ArrayList<>();
            oraseSpania.add("Barcelona");
            oraseSpania.add("Sevilla");
            oraseSpania.add("Cordoba");

            List<String> oraseItalia = new ArrayList<>();
            oraseItalia.add("Vicenza");
            oraseItalia.add("Milano");



        }




// definim retete de gatit

    public void reteteGatit(String reteta) {

        HashMap<String,List<String>>carteBucate = new HashMap<>();

        List<String>ciorbaRadauteana = new ArrayList<>();
        ciorbaRadauteana.add("ceapa - 3 bucati");
        ciorbaRadauteana.add("morcovi - 2 bucati");
        ciorbaRadauteana.add("smantana");
        ciorbaRadauteana.add("galbenus ou");
        ciorbaRadauteana.add("apa - 4l");
        ciorbaRadauteana.add("carne de pui - 500g");

        List<String>tiramisu = new ArrayList<>();
        tiramisu.add("[piscoturi - 2 pachete");
        tiramisu.add("mascarpone - 500g");
        tiramisu.add("cafea - 50ml");

        carteBucate.put("ciorba radauteana", ciorbaRadauteana);
        carteBucate.put("tiramisu", tiramisu);

        for (String key : carteBucate.keySet()){
            if (key.equals(reteta)){
                System.out.println("Reteta este pentru " + key);
                System.out.println("Ingredientele pentru reteta sunt urmatoarele " + carteBucate.get(key));
            }

        }
    }

}

