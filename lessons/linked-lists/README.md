- title: Linked Lists, Stacks & Queues
- tags: linked list, stack, queue, node

# Objectives

- Create a linked list class and implement common methods: Add a node, remove a node, access a node, find a node. 
- Create a stack class, create a queue class and implement common methods.
- Identify the runtime complexity of each implemented operation.

# Resources

- [Visualgo.net - visualizing data structures](http://visualgo.net/)
- [Big O Cheat Sheet](http://bigocheatsheet.com/)
- [CS50 - Linked Lists](https://study.cs50.net/linked_lists)
- [CS50 - Stacks](https://study.cs50.net/stacks)
- [CS50 - Queues](https://study.cs50.net/queues)

# Lecture

## A quick Array review...

An array is a data structure that is designed to store a group of objects of the same or different types. Arrays can hold primitives as well as references. Each item, or value, in an array is called an element, and each element is accessed by its integer index. 

Arrays offer constant time access to any value in the array.

Arrays are not very dynamic. Adding or removing an element near the middle of a list means that a large number of elements in the array need to be shifted to make room for the newly added element or to fill in the gap created by the deleted element.

Arrays cannot expand or shrink. When the number of elements in the data structure exceeds the size of the backing array, a new array needs to be allocated and the data from the old array needs to be copied into the new array. This is an expensive operation.

## Linked Lists

Let's look at another linear data structure that addresses some of the limitations of arrays. A **linked list** is a data structure consisting of a group of nodes which together represent a sequence.

Simplest form: each element (we will call it a **node**) of a list is comprising of two items - the **data** and a **reference** (aka "link") to the next node. The last node has a reference to `null`. The entry point into a linked list is called the **head** of the list. It should be noted that head is not a separate node, but the reference to the first node. If the list is empty then the head is a `null` reference.

```java
public class Node {
    Node next;
    Object data;
}
```

A linked list is a dynamic data structure, allocating the needed memory while the program is running. The number of nodes in a list is not fixed and it can grow and shrink on demand. 

One disadvantage of a linked list against an array is that it does not allow direct access to the individual elements. If you want to access a particular item then you have to start at the head and follow the references until you get to that item. Also, they have a tendency to use more memory than an array as the references require extra storage space.

## Types of linked lists

- **Singly-linked**: simplest form as described above.
- **Doubly-linked**: a list that has two references, one to the next node and another to previous node.
- **Circular-linked**: the last node of the list points back to the first node (or the head) of the list.

## Stacks

A **stack** is a last in, first out (LIFO) data structure that can be visualized like a stack of papers or pancakes. What you put on top (push) is the first item you take off (pop).

Stack interface:
- `void push(E item)` - inserts `item` at the top of the stack, O(1).
- `E pop()` - remove item at the top of the stack, O(1).
- `int size()` - return the number of items.
- `boolean isEmpty()` - return `true` if no items, otherwise `false`.
- `E top()` - return item at the top of the stack without removing it, O(1).
 
## Queues

A **queue** is a first in, first out (FIFO) data structure that can be visualized as a waiting line. You add to the back of the line (enqueue), the front of the line is the first item you take off (dequeue).

Queue interface:
- `void enqueue(E item)` - inserts `item` at the rear of the queue, O(1).
- `E dequeue()` - remove item from front of queue, O(1).
- `int size()` - return the number of items.
- `boolean isEmpty()` - return `true` if no items, otherwise `false`.
- `E front()` - return item at the front of the queue without removing it, O(1).

## [Exercises](exercises.md)
