package Collections;

//hashmap - null, null not synchronised
//treemap - x, null
//hashtable - x, x, thread safe or sychronised,
// unsorted and unordered due to hash and no null key value

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> bank = new HashMap<>();
        bank.put( "Vipin",1000.00 );
        bank.put( "Varun",15000.00 );
        bank.put( "Renu",13000.00 );
        bank.put( "Ram",14000.00 );
        bank.put( "Renu",13000.00 );
        System.out.println(bank);
        String json = new Gson().toJson(bank);
        System.out.println(json);

        Set<Map.Entry<String, Double>> entries= bank.entrySet();
        Iterator<Map.Entry<String, Double>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Double> entry = iterator.next();
            System.out.println(entry.getKey() +":" +entry.getValue());
        }
    }

}
