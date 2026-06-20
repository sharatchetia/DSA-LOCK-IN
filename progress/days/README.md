# Progress Notes

## Day 01

### What I revised

- Arrays
- Taking array input with `Scanner`
- Linear search
- 2D arrays
- String reversal using `StringBuilder`

### LeetCode practice

- Reverse String
- Two Sum using brute force
- Contains Duplicate using brute force

### My notes

Contains Duplicate was not submitted because the brute force approach can exceed
the time limit.

Rotate Array is partially understood, but I am not fully confident with it yet.

Valid Anagram is still pending because it needs HashMap/HashSet, which I have
not covered properly yet. I will come back to it after learning those topics.

Main learning: brute force helps me understand the question first, but many
array and string questions need HashMap or HashSet for better solutions.

## Day 02

### What I studied

- HashSet basics
- HashMap basics
- Iteration using `entrySet` and `keySet`
- Frequency counting with HashMap

### Practice

- Majority element greater than `n/3`
- Two Sum using HashMap
- Ransom Note
- Isomorphic Strings

### My notes

HashMap feels very important, but I am still confused with it in some places.
I need to practice it more until the logic becomes natural.

I could not do the medium questions today because of time and mental fatigue:

- Subarray Sum Equals K
- Longest Consecutive Sequence

Positive side: I watched the HashSet videos, so I can probably jump into those
questions next.

## Day 03

### What I studied

- Prefix sum
- Two pointers
- Basic Kadane's algorithm idea for Maximum Subarray

### Practice

- Running Sum of 1D Array
- Two Sum II
- Squares of a Sorted Array
- Move Zeroes
- Maximum Subarray

### My notes

Today I did not watch new lectures from the playlist. I focused on the topics
needed for questions.

For prefix sum, the main thing I understood is:

```text
prefix[i] = prefix[i - 1] + nums[i]
```

For two pointers, I practiced the left and right pointer pattern on a sorted
array. I first tried the logic myself, then wrote the generic pattern.

Maximum Subarray was done using Kadane's algorithm style, and I also kept
another version that I wrote which works even if it is not the best way.

## Day 04

### What I studied

- HashMap and HashSet revision
- Binary search
- Recursive binary search
- Search insert position
- Lower bound
- Upper bound
- Binary search on boundaries

### Practice

- Contains Duplicate using HashSet
- Contains Duplicate using HashMap
- Two Sum using HashMap
- Binary Search
- Search Insert Position
- First Bad Version
- Find First and Last Position of Element in Sorted Array

### My notes

Before starting binary search, I practiced HashMap and HashSet again. I did Two
Sum and Contains Duplicate by myself, and I also tried Contains Duplicate with a
HashMap even though HashSet is cleaner for that problem.

For binary search, I understood that the array needs to be sorted. If the array
is not sorted, linear search may be better because sorting first takes
`O(n log n)`.

First Bad Version was tricky because it is not searching for an exact value. It
is searching for the first point where a condition becomes true. The main thing
I learned from it is that binary search can be used for boundaries too.

## Day 05

### What I studied

- Recursion basics
- Base cases
- Call stack
- Stack overflow
- Return-based recursion
- Parameter-carrying recursion
- First exposure to backtracking

### Practice

- Print numbers using recursion
- Natural sum using recursion
- Factorial using a parameter-carrying approach
- Factorial using a return-based approach
- Fibonacci number
- Fibonacci series
- Reverse String using two pointers
- Reverse String using recursion
- Climbing Stairs
- Power of Two
- Started Subsets

### My notes

Today I focused on recursion from the Apna College one-shot. The biggest thing
I understood is that recursion needs three parts: a base case, a smaller
problem, and a recursive call.

Factorial helped me understand the difference between carrying an answer as a
parameter and returning an answer from the recursive function. I currently
understand the parameter-carrying style more naturally, but the return-based
style is becoming clearer.

For Fibonacci and Climbing Stairs, I learned that I do not always need to build
from the smallest value upward. I can start from the problem I want and express
it using smaller subproblems. Climbing Stairs also showed me that a recursive
relation can be logically correct but still too slow, which is why memoization
and dynamic programming matter.

Reverse String helped me connect recursion with the two-pointer pattern:
swap the current `low` and `high`, then solve the smaller problem inside the
array.

Power of Two was submitted successfully. The idea was to keep dividing by 2
until the number reaches 1, while rejecting non-positive numbers and odd
numbers except 1.

I also started Subsets and got my first exposure to backtracking. The main idea
I learned is the take / do not take choice for every element, but I am not
comfortable with it yet. I will revisit Subsets during revision.

Current weak areas:

- Backtracking
- Subsets
- Understanding recursion trees quickly

## Day 06

### What I studied

- String patterns
- String creation using literals and the `new` keyword
- String pool
- Character access with `charAt`
- String immutability
- StringBuilder revision
- String comparison using `equals`, `equalsIgnoreCase`, and `==`
- String input using `Scanner`
- Common string methods

### Practice

- Valid Palindrome
- First Unique Character in a String
- Longest Common Prefix

### My notes

Day 06 was focused on the string pattern topics that I missed earlier. I
watched a Love Babbar video and revised the basics of how strings work in Java.

For Valid Palindrome, I was almost able to do the logic by myself. The main
idea was to use two pointers, skip non-alphanumeric characters, compare the
valid characters in lowercase, and move inward.

For First Unique Character in a String, I solved it by myself using a HashMap
to count character frequencies, then scanned the string again to find the first
character with frequency 1.

Longest Common Prefix was not done by myself. I need to revisit it carefully
and understand the character-by-character comparison across all strings.

Pending for Day 07 revision:

- Longest Substring Without Repeating Characters
- Group Anagrams

## Day 07

### What I studied

- Revision of earlier topics
- Prefix sum
- HashSet usage
- HashMap frequency counting
- Two pointers
- String problems
- Binary search
- Basic recursion

### Practice

- Running Sum of 1D Array
- Contains Duplicate
- Two Sum
- Palindrome Number
- Majority Element
- Find the Difference
- Move Zeroes
- Valid Anagram
- Squares of a Sorted Array
- Valid Palindrome
- Binary Search
- Fibonacci Number
- Power of Two
- Reverse String

### My notes

Day 07 was a revision day. I did not start any new lectures or new topics. The
main goal was to practice problems from previous days and check which patterns
I could recall without looking again.

For arrays and prefix sum, I revised Running Sum and remembered that
`prefix[0]` needs to be initialized first before using
`prefix[i] = prefix[i - 1] + nums[i]`.

For HashSet, I revised Contains Duplicate. The main pattern is to ask whether I
have already seen the current value. HashSet is useful when only existence
matters.

For HashMap, I revised Two Sum, Majority Element, Find the Difference, and
Valid Anagram. The frequency-counting pattern is becoming more natural now,
especially when duplicates matter.

For two pointers, I revised Move Zeroes, Sorted Squares, Valid Palindrome, and
Reverse String. I understood the difference between a scanning pointer and a
write pointer more clearly in Move Zeroes.

For binary search, I revised the exact search pattern with `low`, `high`, and
`mid`. I skipped some related binary search questions because the main concept
was already understood: many of them are about finding the first position where
a condition becomes true.

For recursion, I revised Fibonacci and Power of Two. Power of Two reminded me
that success base cases should come before broader failure cases when the order
matters.

Backtracking and Subsets are still not comfortable. I postponed Subsets until I
learn backtracking properly.

No handwritten notes for Day 07.
