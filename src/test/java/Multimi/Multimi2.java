package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi2 {

    @Test

    public void metodaTest(){
//numeCursantiArray();
//numeCursantiList();
obiecteHashmap();
    }

    //afisam numele cursantilor

    public void numeCursantiArray(){

        String[] numeCursanti = new String[4];
        numeCursanti[0] = "Alexandru";
        numeCursanti[1] = "Anca";
        numeCursanti[2] = "Andrei";
        numeCursanti[3] = "Claudia";

        for(Integer index=0; index< numeCursanti.length;index++){
            System.out.println(numeCursanti[index]);
        }

    }

    public void numeCursantiList(){

        List<String> numeCursanti = new ArrayList<>();
        numeCursanti.add("Oana");
        numeCursanti.add("Diana");
        numeCursanti.add("Cosmin");
        numeCursanti.add("Letitia");

        for (Integer index = 0; index<numeCursanti.size(); index++){
            System.out.println(numeCursanti.get(index));
        }
    }

    // hashmap = key - value;

   public void obiecteHashmap(){

       HashMap<String, String> obiecte = new HashMap<>();
       obiecte.put("electronice", "telefon");
       obiecte.put("aliment", "supa");
       obiecte.put("masina", "ford");

       for(String key: obiecte.keySet()){
           System.out.println("Cheia este " + key);
           System.out.println("Valoarea este " + obiecte.get(key));
       }
   }
}
