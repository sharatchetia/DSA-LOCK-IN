// started with backtracking but too many things to larn first like recursion(not confident) and linked list and othr stuff
// so postponing it after second week 

// doing OOPS for day 9 instead


// classes names start with caps while functions name start with smaller first letter for industry standards maybe

// class Pen{
//     String color;
//     String type;

//     public void write(){
//         System.out.println("keep writing");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }
// public class Day09 {
//     public static void main(String[] args) {
//         Pen pen1 = new Pen();
//         pen1.color = "red";
//         pen1.type = "ball";


//         Pen pen2 = new Pen();
//         pen2.color = "blue";
//         pen2.type = "gel";

//         pen1.write();
//         pen1.printColor();

//         pen2.write();
//         pen2.printColor();
//     }
// }







class Student{
    String name;
    int age;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Day09 {
    public static void main(String[] args) {
        Student si = new Student();

        si.name = "Sharat";
        si.age = 20;

        si.studentInfo();
    }
}
 
// leet 58 (for fun)
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int low = 0;
        int high = s.length()-1;
        int len = 0;
        
        while(low<=high){
            char ch = s.charAt(high);
            if(Character.isLetterOrDigit(ch)){
                high--;
                len++;
            }else{
                low = high+1;
            }
        }
        return len;
    }
}

// some codes done were not written. will be given on tomorrow files


// ## Day 9 — OOP Revision + Backtracking Reflection

// **Problems Solved Today:** 1 | **Total Problems:** Updated in repo

// ### Topics Covered

// #### Backtracking Reflection

// * Attempted to learn backtracking.
// * Understood the basic take / don't take decision tree.
// * Understood why `idx` is used.
// * Understood why the base case is often:

// ```java
// if(idx == nums.length)
// ```

// * Understood the idea of `add()` and `remove()` as making and undoing choices.
// * Realized that many backtracking examples depend heavily on:

//   * `ArrayList`
//   * `List`
//   * `List<List<Integer>>`
//   * Collections Framework

// **Decision:** Backtracking postponed until after learning Collections Framework, Linked List, Stack, and Queue.

// #### OOP Revision

// Covered:

// * Class vs Object
// * Object creation using `new`
// * Constructor basics
// * Default Constructor
// * No-Argument Constructor
// * Parameterized Constructor
// * Copy Constructor (basic understanding)
// * `this` keyword
// * Constructor execution flow
// * Inheritance (started)
// * Polymorphism (completed basic understanding)

// ### Key Lessons

// * Constructors run automatically when an object is created.
// * `new Student()` creates an object and calls the constructor.
// * Copy constructors create a new object with the same data instead of pointing to the same object.
// * Polymorphism allows the same method call to behave differently depending on the object.

// ### Struggled With

// * Backtracking examples because of unfamiliar Collections syntax.
// * Understanding copy constructors initially.
// * OOP took longer than expected.

// ### Tomorrow's Goal

// * Finish remaining OOP topics:

//   * Abstraction
//   * Interface
// * Start Collections Framework:

//   * ArrayList
//   * List
//   * add()
//   * get()
//   * remove()
//   * size()

// ### Day Status

// ✅ Maintained streak

// ✅ OOP progress made

// ✅ Backtracking fundamentals understood

// ⚠ Collections Framework still pending
