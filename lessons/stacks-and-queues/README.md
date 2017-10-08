# Stacks and Queues

# Objectives
- Review Abstract Data Types
- Understand and implement a Stack Data Structure
- Understand and implement a Queue Data Structure

# Resources
- [Oracle Queue Tutorial](https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html)
- [Stack Api](http://docs.oracle.com/javase/6/docs/api/java/util/Stack.html)

# Lecture

## Abstract Data Types Revisited

Abstract Data Types (ADT's), as described previously, are not concrete classes for data storage, but rather constructs, or ideas for how data may be stored, retrieved, sorted, or removed. A ```Map``` for example, is an Abstract Data Type used to model the storage of data as Key/Value pairs. Although the classes that implement this model might be different, they should share the same behavior, or methods which should be called to implement Map-like behavior. Although a ```HashMap<K, V>``` may be an unordered collection of Key/Value pairs, and a ```TreeMap<K, V>``` may be an ordered collection of Key/Value pairs, ordered by the keys entered, they both implement the methods that all Maps are expected to implement. The same can be said for the ```List``` Abstract Data Type, with such implementations as an ```ArrayList<E>``` (with elements ordered by an index), and ```LinkedList<E>``` (with elements ordered by their relationships with other elements within the list itself).

Stacks and Queues are also Abstract Data Types - and just as Maps and Lists have varying types of data structures that implement their models, so too do Stacks and Queues. 

## Queue

A ```Queue``` is a First-In-First-Out (FIFO) data structure. It allows you to add elements to one end of a list, and remove elements from the opposite end. Queues can be used to provide a list ordered by the moment elements are added or removed to that data type. For example, imagine you are an HR Manager, and you are in charge of maintaining a list of employees by their start date, to determine who should be allowed to retire first:

Employee data can be stored in a ```class``` called ```Employee.java```:

```java
package com.company;

import java.util.Date;

public class Employee implements Comparable {
    private String name;
    private Date startDate;

    public Employee(String name) {
        this.name = name;
        this.startDate = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    @Override
    public int compareTo(Object o) {
        return (int)(((this.getStartDate().getTime() - ((Employee) o).getStartDate().getTime()))/1000);
    }
}
```

This object implements something called ```Comparable``` - this is because a ```PriorityQueue<E>``` requires that objects entered into the queue are sortable, or comparable to each other - in this case, by ```startDate``` value. There are other implementations, like ```ArrayBlockingQueue<E>```, that just add elements to the queue without worring about sorting them, but these have their own caveats, so we'll use this implementation for now....

So, you wouldn't want employees hired in 2010 (assuming they're still under 65 years old), to be asked to retire before employees hired in 2005. One way to keep track of this is to create a program that stores each employee in a data structure, the day they get hired, so that people who are hired earlier, can be asked to retire before those who were hired more recently. A data structure we can use to do this is called an ```PriorityQueue<E>```:

```java
package com.company;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    private static Queue<Employee> retirementQueue = new PriorityQueue<>();

    public static void main(String[] args) {

        retirementQueue.offer(new Employee("Danny"));
        retirementQueue.offer(new Employee("Helen"));
        retirementQueue.offer(new Employee("Yojana"));
    }
}
```

### Adding to the Queue

Adding to the queue is simple, and similar to an ```ArrayList<E>```, in that calling the ```.add()``` or ```.offer()``` methods will allow you to add the element to the end of the queue, which makes sense, since every new employee will also be the most recent employee at that given time.

### Heads and Tails

The **Head** of a queue is the oldest entry in the queue, and the **Tail** is the most recent entry. If you want to confirm who the most senior employee is on your queue, you could run the ```.peek()``` method, which will return the head of the queue, without removing it. If you want to both get (return) AND retire (remove) the most senior employee, you could use the method ```.poll()```:

```java
package com.company;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    private static Queue<Employee> retirementQueue = new PriorityQueue<>();

    public static void main(String[] args) {

        retirementQueue.offer(new Employee("Danny"));
        retirementQueue.offer(new Employee("Helen"));
        retirementQueue.offer(new Employee("Yojana"));
        retirementQueue.offer(new Employee("Old Man Logan"))
        retirementQueue.offer(new Employee("Ridita"));
        retirementQueue.offer(new Employee("Lily"));
        
        retirementQueue.peek();
        
        retirementQueue.poll();
        retirementQueue.poll();
        
    }
}
```

Perhaps someone passed away before they could retire :coffin:, and you wanted to update your queue accordingly - you could use the method ```.remove()```

## Stack

A Stack is a Last-In-First-Out (LIFO) data structure. It allows you to add
elements to one end of a list, and remove elements from that same end. This is
a form of memory organization that grows in one direction. Many embedded memory
chips implement a stack as the primary interface to storing and receiving data.
Stacks are considered the one of the simplest memory forms that can be used to
build a computer.

## Queues

A Queue is a First-In-First-Out (FIFO) data structure. It allows you to add
elements to one end of a list, and remove elements from the opposite end.
Queues can be used to provide a list ordered by the time elements have arrived.
If you wanted to program the line for a deli counter, you would use a queue.

> **Exercise** Write a function that reads six numbers from the command line,
and prints the sum of all six afterwards. Use a queue to store each input as its
received, receiving all six inputs before calculating the output.

> **Exercise** Write a function readTwoInts() that reads two integers from the
command line, and returns the sum. Write a second function runTwoInts() that
reads an integer from the command and calls readTwoInts() that many times. Each
return value from readTwoInts() should be stored in a queue. After all calls to
readTwoInts() complete, print the sum of all numbers in the queue.

> **Exercise** Write a function palindrome detector that accepts a
Dequeue<Integer> as an input. The Dequeue will always have either zero, or an
even number of elements. This function should remove an element from each end of
the dequeue and compare them. If the dequeue has zero elements, the function
should print "No input". If the elements removed from the ends of the dequeue do
not match, then the function should print "Not a palindrome". Otherwise, the
function should output "Palindrome Found".

## Stack
A Stack is a Last In First Out (LIFO) data structure. It allows you to add
elements to one end of a list, and remove elements from that same end. This is
a form of memory organization that grows in one direction. Many embedded memory
chips implement a stack as the primary interface to storing and receiving data.
Stacks are considered the one of the simplest memory forms that can be used to
build a computer.
