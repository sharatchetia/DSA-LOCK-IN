// revision day 

// today no new topics or lectures
// practicing leet questions previously done

import java.util.*;

class Solution {
    public int[] runningSum(int[] nums) {
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        return prefix;
    }
}



class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}





class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }else{
                map.put(nums[i],i);
            }
            
        }
        return new int[]{};
    }
}




// for fun
class Solution3 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }
}



class Solution4 {
    public boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        int digit = 0;
        while(x>0){
            digit = x%10;
            rev = rev*10+digit;
            x=x/10;
        }
        if(rev==org){
            return true;
        }
        return false;
    }
}




class Solution5 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int n : nums){
            if(map.get(n)>nums.length/2){
                return n;
            }
        }
        return -1; 
    }
}



class Solution6 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)||map.get(ch)==0){
                return ch;
            }else{
                map.put(ch, map.get(ch)-1);
            }
        }
        return 0;
    }
}