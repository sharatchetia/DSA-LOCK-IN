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
