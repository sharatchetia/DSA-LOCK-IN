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

## Day 08

### What I studied

- Sorting algorithms
- Merge sort using recursion
- Divide and conquer
- Bubble sort
- Insertion sort
- Selection sort
- Quick sort notes
- Two-pointer sorting patterns

### Practice

- Merge Sort
- Sort Array By Parity
- Sort Colors

### My notes

Day 08 was focused on sorting. I practiced merge sort recursively and wrote the
divide and conquer structure with `divide` and `conquer` methods.

The main merge sort idea is to keep dividing the array until each part is small
enough, then merge the sorted parts back together. I practiced it after
memorising the pattern and need more dry runs to make it fully natural.

I also practiced Sort Array By Parity using two pointers. The important part
was handling all pointer cases carefully:

- even on left and odd on right
- odd on left and even on right
- even on both sides
- odd on both sides

For Sort Colors, I practiced the three-pointer Dutch National Flag pattern with
`l`, `m`, and `h`. I was almost able to do it by myself and did a lot of dry
runs to understand when each pointer should move.

I also covered bubble sort, insertion sort, and selection sort.

Handwritten notes for Day 08 are in `notes/my_notes/day 8 dsa.pdf`.

Reference PDFs added:

- `notes/apna_college_notes/Merge Sort (2).pdf`
- `notes/apna_college_notes/Quick Sort (1).pdf`

## Day 09

### What I studied

- Backtracking basics and why it needs more preparation
- OOP revision
- Classes and objects
- Object creation using `new`
- Constructors
- `this` keyword
- Copy constructor basics
- Constructor execution flow
- Inheritance basics
- Polymorphism basics

### Practice

- Simple `Pen` class example
- Simple `Student` class example
- Length of Last Word

### My notes

I started Day 09 with backtracking, but I realized that I need to understand
more Java foundations first. Backtracking examples use things like
`ArrayList`, `List`, `List<List<Integer>>`, `add()`, and `remove()`, so I am
postponing proper backtracking until after Collections Framework, Linked List,
Stack, and Queue.

The backtracking idea I understood today is that each element can create a
choice:

- take it
- do not take it

I also understood why `idx` is used, why a base case can be
`idx == nums.length`, and why backtracking needs both making and undoing a
choice.

After that, I switched to OOP revision. I practiced creating simple classes and
objects, using instance variables, calling methods, and using `this` to refer
to the current object's fields.

The main OOP lessons today were:

- constructors run automatically when an object is created
- `new Student()` creates an object and calls the constructor
- copy constructors create a new object with the same data
- polymorphism allows the same method call to behave differently depending on
  the object

OOP took longer than expected, and copy constructors were confusing at first.

Tomorrow's plan:

- Finish remaining OOP topics
- Study abstraction and interfaces
- Start Collections Framework
- Learn `ArrayList`, `List`, `add()`, `get()`, `remove()`, and `size()`

Handwritten notes for Day 09 are in `notes/my_notes/day 9 dsa.pdf`.

Reference PDF added:

- `notes/apna_college_notes/OOPS in Java.pdf`

## Day 10

### What I studied

- OOP fundamentals (constructors, `this`, instance variables)
- Design-style problems and thinking about object state

### Practice

- Design Parking System (#1603)
- Number of Students Unable to Eat Lunch (#1700)

### LeetCode practice

- Design Parking System — implemented a `ParkingSystem` class with instance
  variables and a constructor to initialize capacities
- Number of Students Unable to Eat Lunch — used counting instead of full
  simulation to determine how many students can't eat

### My notes

Day 10 focused on OOP fundamentals and the first real OOP design problem. I
learned how constructors initialize object state and how methods modify that
state. Design problems required thinking about object lifetime and proper use
of instance variables.

Handwritten notes for Day 10 are in `notes/my_notes/day 10 dsa.pdf`.

## Day 11

### What I studied

- ArrayList basics
- Adding elements (add), inserting at index (add with index)
- Getting elements (get), setting elements (set)
- Removing elements (remove)
- Size of ArrayList (size)
- Looping through an ArrayList
- Sorting with Collections.sort
- Java Collections Framework introduction (names only)

### Practice

- Kids With the Greatest Number of Candies
- Baseball Game (Cal Points)

### LeetCode practice

- Kids With the Greatest Number of Candies — found the maximum candies, then
  checked for each kid if candies[i] + extraCandies >= max
- Baseball Game — used ArrayList to simulate scorekeeping with operations:
  integer (add the score), "C" (remove last score), "D" (double last score),
  "+" (sum of last two scores)

### My notes

Day 11 was focused on ArrayList in Java. I learned the basic operations: how to
add, get, set, remove elements, how to loop, and how to sort using
Collections.sort.

Kids With the Greatest Number of Candies was straightforward: find the max in a
single pass, then check each element with the extra candies added.

Baseball Game was more interesting because it tested my understanding of
ArrayList operations in a real problem. The main idea was to process string
operations one by one and use the ArrayList as a stack-like structure. The "+"
case was tricky at first because I had to access the last two elements using
`list.get(list.size() - 2)` and `list.get(list.size() - 1)`.

I also started learning about the Java Collections Framework. For now, I have
only learned the names of the main interfaces and classes. I will dig deeper
into them in the coming days.

Handwritten notes for Day 11 are in `notes/my_notes/day 11 dsa.pdf`.

Reference PDFs added:

- `notes/apna_college_notes/ArrayList in Java.pdf`
- `notes/apna_college_notes/Collection Framework - Java.pdf`

## Day 12

Day 12 was a recovery/review day. I was feeling burnt out and attempted to
start linked list review but could not concentrate. I copied a Roman numeral
solution to keep the streak, but I did not solve the problem independently.

What happened:

- Attempted linked list review but could not focus.
- Copied a Roman numeral conversion solution for streak maintenance.
- Took the day to rest and recover.

Handwritten notes for Day 12 are not available yet.

## Day X

Days 13, 14, and 15 are not missing. They are grouped under this Day X entry
as recovery/skipped days after burnout. I did not make meaningful progress on
new concepts during that period, so I treated them as a rest and recovery phase.
To keep the streak alive, I copied an easy LeetCode solution for streak
maintenance and focused on rest rather than forced study.

What happened:

- Days 13, 14, and 15 are intentionally covered under this Day X recovery entry.
- I was low on energy and focus, so I skipped study for those days.
- I copied an easy LeetCode solution to maintain the streak (not solved
  independently).
- I resumed Linked Lists later when I felt better.

Handwritten notes for Day X are not available yet.

## Day 16

### What I studied

- Linked list fundamentals
- Node class and `next` pointer
- `addFirst` method implementation
- Traversal and `printList()` method

### Practice

- Built a custom linked list with `Node` and `LinkedList` classes
- Implemented `addFirst` and `printList()`

### My notes

Day 16 was focused on the basics of singly linked lists in Java. I wrote a
custom `Node` class, learned how `next` pointers connect nodes, and built an
`addFirst` method to insert at the head.

The `printList()` method helped me verify the list contents by traversing
from the head to the end.

I also started looking at LeetCode 1290, but I did not complete it fully on my
own yet.

Handwritten notes for Day 16 are not available yet.

## Day 16C

### What I studied

- Continued linked list practice beyond the basic Day 16 work
- Reviewed handwritten notes and Apna College notes
- Strengthened understanding of linked list methods and traversal

### Practice

- Continued the linked list continuation work from Day 16
- Revisited the concepts from my notes and reference material

### My notes

This is a continuation of Day 16. I continued working on linked list basics,
added more practice with linked list methods, and reviewed my handwritten notes
and Apna College notes to strengthen the concept.

The continuation was focused on improving confidence with linked list logic and
making the concepts feel more natural.

Handwritten notes for Day 16C are not available yet.

## Day X

Days 13, 14, and 15 are not missing. They are grouped under this Day X entry
as recovery/skipped days after burnout. I did not make meaningful progress on
new concepts during that period, so I treated them as a rest and recovery phase.
To keep the streak alive, I copied an easy LeetCode solution for streak
maintenance and focused on rest rather than forced study.

What happened:

- Days 13, 14, and 15 are intentionally covered under this Day X recovery entry.
- I was low on energy and focus, so I skipped study for those days.
- I copied an easy LeetCode solution to maintain the streak (not solved
  independently).
- I resumed Linked Lists later when I felt better.

Handwritten notes for Day X are not available yet.

## Day 17

### What I studied

- Reversing a Linked List
- Iterative reversal using pointers
- Recursive reversal approach

### Practice

- Reversed a custom linked list with the iterative method
- Tried the recursive reversal approach
- Reviewed LeetCode 206 basics

### My notes

Day 17 was about reversing linked lists. I learned the iterative method using
`prev`, `curr`, and `next` pointers, and I also tried the recursive approach.
The main idea was to reassign pointers carefully so the list is reversed
without losing the rest of the nodes.

I also noted that the recursive approach is a good way to practice thinking in
smaller subproblems.

Handwritten notes for Day 17 are not available yet.
