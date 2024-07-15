// Using hashmap to store person name and age. Hashmap basics

import java.util.*;

public class hashmapBasics {
   
    static void hashMapMethods(){
        HashMap<String,Integer> map= new HashMap<>();

        //adding elements
        map.put("A", 18);
        map.put("Y", 16);
        map.put("D", 21);
        map.put("H", 18);
        map.put("R", 19);


        //geting value from key
        System.out.println(map.get("Y"));
        System.out.println(map.get("B"));

        //updating value of key
        map.put("D", 20);
        
        //removing key
        map.remove("H");

        //checking key exists
        System.out.println(map.containsKey("X"));

        //add if not present
        map.putIfAbsent("R", 10);
        map.putIfAbsent("C", 17);

        //get keys and values
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        System.out.println(map);
    }

    public static void main(String[] args){
        hashMapMethods();
    }
}
