// given integer array of size n, find all element that appear more than n/3 times.
// nums[] = {1,3,2,5,1,3,1,5,1}

// this hashmap topic is very important and i need to master it. as of today i m a lot confused from it but i will be practicing it to master it
// frequency counter
import java.util.*;

public class Day02_prac_ques {

    public static void majorityElement(int nums[]) {

        HashMap <Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key)>n/3){
                System.out.println("the elements that appear more than n/3 times are :" + key);
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};

        majorityElement(nums);
    }
}



// hashmap leetcode question done

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i<nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}


// rnasom note and magazine question done leetcode(kind of my solution and can be optimised (used chatgpt for code formation))

class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for( int i=0; i<magazine.length(); i++){
            char ch = magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }

        for(int i=0; i<ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);

            if(!map.containsKey(ch)||map.get(ch)==0){
                return false;
            }
            map.put(ch, map.get(ch)-1);
        }
        return true;
    }
}


//isomorphic strings leetcode question done (my solution and can be optimised)(also didnt understand a little bit)

class Solution3 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char st = s.charAt(i);
            char ts = t.charAt(i);

            if(mapST.containsKey(st)&& mapST.get(st)!=ts){
                return false;
            }
            if(mapTS.containsKey(ts)&& mapTS.get(ts)!=st){
                return false;
            }

            mapST.put(st,ts);
            mapTS.put(ts,st);
        }
        return true;
    }
}



// wasnt able to do the medium difficulty questions due to time and mental fatique 
// Subarray Sum	Equals	K
// Longest Consecutive Sequence	

// on the positive note i wached the hashset videos and can directly jump to the question probably that was on day 16