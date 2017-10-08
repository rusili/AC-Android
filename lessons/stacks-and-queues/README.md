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

Abstract Data Types (ADT's), and described previously, are not conrete classes for data storage, but rather constructs, or ideas for how data may be stored, retrieved, sorted, or removed. A ```Map``` for example, is an Abstract Data Type used to model the storage of data as Key/Value pairs. Although the classes that implement this model might be different, they should share the same behavior, or menthods which should be called to implement Map-like behavior. Although a ```HashMap<K, V>``` may be an unordered collection of Key/Value pairs, and a ```TreeMap<K, V>``` may be an ordered collection of Key/Value pairs, ordered by the keys entered, they both implement the methods that all Maps are expected to implement. The same can be said for the ```List``` Abstract Data Type, 

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
