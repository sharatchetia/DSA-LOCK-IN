import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Day11 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        
        //add values

        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //get an element from arraylist

        int save = list.get(1);
        System.out.println(save);

        //add element in between

        list.add(1,2);  // here 1 is index and 2 is the element added
        System.out.println(list);

        //set element (changes element with different value)
        list.set(0,5);
        System.out.println(list);

        //remove element
        list.remove(0);
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //loops on lists
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //sorting in arraylist
        Collections.sort(list);
        System.out.println(list);
    }
}






class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();

        int max = candies[0];

        for(int i = 1; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){

            int total = candies[i] + extraCandies;

            if(total >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }

        return ans;
    }
}



// learned the java framework basics. only names for now. nothing in code

//for learning a little ArrayList

class Solution3 {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        for(int i=0; i<operations.length; i++){
            String op = operations[i];
            if(op.equals("C")){
                list.remove(list.size()-1);
                continue;
            }
            else if(op.equals("D")){
                list.add(list.get(list.size()-1)*2);
                continue;
            }
            else if(op.equals("+")){
                list.add(list.get(list.size()-2)+list.get(list.size()-1));
            }
            else{
                list.add(Integer.parseInt(op));
                continue;
            }
        }
        
        for(int i=0; i<list.size(); i++){
            sum+=list.get(i);
        }
        return sum;
    }
}