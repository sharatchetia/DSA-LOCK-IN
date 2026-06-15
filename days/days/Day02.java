import java.util.HashSet;
import java.util.Iterator;
public class Day02 {
    public static void main (String[] args){

        //HashSet

        HashSet <Integer> set = new HashSet<>(); 


        //insert

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //search / contains

        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(6)){
            System.out.println("do not contain");
        }

        //delete

        set.remove(2);

        if(!set.contains(2)){
            System.out.println("does not contain 2");
        }

        //size

        System.out.println(set.size());

        //to print all elements

        System.out.println(set);

        //iterator

        Iterator it = set.iterator();
        //it has two special functions
        // next() and hasNext()

        //eg:

        while(it.hasNext()){
            System.out.println(it.next());
        }






        //HashMap

    }
}
