import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Day02 {
    public static void main (String[] args){

        // //HashSet

        // HashSet <Integer> set = new HashSet<>(); 


        // //insert

        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(1);

        // //search / contains

        // if(set.contains(1)){
        //     System.out.println("set contains 1");
        // }

        // if(!set.contains(6)){
        //     System.out.println("do not contain");
        // }

        // //delete

        // set.remove(2);

        // if(!set.contains(2)){
        //     System.out.println("does not contain 2");
        // }

        // //size

        // System.out.println(set.size());

        // //to print all elements

        // System.out.println(set);

        // //iterator

        // Iterator it = set.iterator();
        // //it has two special functions
        // // next() and hasNext()

        // //eg:

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }






        //HashMap


        //hashmap is key value pairs 
        HashMap <String, Integer> map = new HashMap<>();

        // insert (put)
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);//this will update the value of china

        System.out.println(map);

        //search (containsKey)
        if(map.containsKey("China")){
            System.out.println("keys is present in map");
        }else{
            System.out.println("key not present in map");
        }

        //to get the value of key( get() )
        System.out.println(map.get("China"));//key exists and will return value 
        System.out.println(map.get("Indonesia"));//key do not exist and will return null

        //Iteration in HashMap
        // first import Iteration

        //for loop in HashMap
        //for(int val: arr)

        //eg:
        //for (int val: arr){
        //    System.out.println(val + " ");
        //}

        //eg:
        //first method that converts the whole HashMap to a set
        //also import java.util.Map is required

        //very IMP

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //second method (for only keys to form set)
        //requires import java.util.Set

        //very IMP
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " " + map.get(key));
        }

        //Delete (remove)
        map.remove("China");
        System.out.println(map);
    }
}
