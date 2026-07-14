import java.util.*;

// leetcode 643 sliding window learning

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}




class Solution1 {
    public boolean isVowel(char ch) {
    return ch == 'a' ||
           ch == 'e' ||
           ch == 'i' ||
           ch == 'o' ||
           ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int vowelCount = 0;

        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                vowelCount++;
            }
        }

        int maxVl = vowelCount;

        for (int i = k; i < s.length(); i++) {

        if (isVowel( s.charAt(i-k) )) {
            vowelCount--;
        }

        if (isVowel( s.charAt(i) )) {
            vowelCount++;
        }

        maxVl = Math.max(maxVl, vowelCount);

        
    }

    return maxVl;
    }
    
}


class MyQueue {
    Stack <Integer> stack1;
    Stack <Integer> stack2;
   
    public MyQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int val = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val;
    }
    
    public int peek() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int val1=stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return val1;
    }
    
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */