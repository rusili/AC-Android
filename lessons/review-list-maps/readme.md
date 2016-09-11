- title: Review of Abstract Classes, Lists, and Maps
- tags: abstract,

# Objectives:
  Review abstract classes and how to use the following data structures to organize data.
- ArrayLists
- HashMaps

# Resources

- [Java docs](http://docs.oracle.com/javase/tutorial/collections/intro/index.html)
- [Abstract Classes](http://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)


# Lecture

Knowledge of data structures is super important for programmers to understand how to approach different kinds of problems. A data structure is a particular way of organizing data in a computer so that it can be used efficiently.


Example:

  - ArrayList

  - HashMap  

We have learned about these data structures before. They are actually just concrete implementations of some abstract classes defined in Java's Collections framework.  

  - ArrayList extends the AbstractList class and implements the following interfaces (List, RandomAccess, Cloneable, and java.io.Serializable).
  - HashMap which extends AbstractMap<K, V> and implements Map<K, V>, Cloneable, and Serializable

We don't really need to dive into such detail about the hierarchy of these structures, but in short A Java class containing data fields and records AND methods that operate on some content may serve as a data structure.

### On Abstract classes

  Abstract classes can implement interfaces as well by using the ```implement``` keyword. However, because they are abstract, they don't need to implement all methods. The AbstractList interface implements common methods, which allows concrete implementations like ArrayList and LinkedList to be free from burdening of implementing all methods if they implemented the List interface directly.

  Because abstract classes need to be subclasses, they cannot be declared as final. "They are also opposite of each other, abstract keyword enforces to extend a class, for using it, on the other hand, final keyword prevents a class from being extended. In real world also, abstract signifies incompleteness, while final is used to demonstrate completeness. Bottom line is, you can not make your class abstract and final in Java, at same time, it’s a compile time error.

When dealing with a new data structure, you will want to know how to

- instantiate it
- add elements to it
- retrieve elements from it.
- Can we iterate through it?

The ArrayList class, for example, has multiple overloaded constructors.
```java
List l1 = new ArrayList(); //This constructor builds an empty ArrayList
List l2 = new ArrayList(Collection c);
//This constructor builds an ArrayList  that is initialized with the elements of the collection c.
List l3 = new ArrayList(int capacity);
 //This constructor builds an ArrayList that is initialized to have an initial capacity equal to capacity. The capacity of the ArrayList can grow automatically as elements are added to the list.
```

Take a few minutes to apply the different constructors of an ArrayList.
Then, try adding and removing elements from the List,

The HashMap class also has a few overloaded constructors, but for now, we will work with these two:

```java
HashMap map = new HashMap(); //Constructs an empty HashMap

HashMap map1 = new HashMap(int initialCapacity); //Constructs an empty HashMap with the specified initial capacity

```

Some questions we may ask about our data structure

1) If I put several elements into my data structure, is it possible to retrieve those same elements in that same order?

2) If I put several elements (that can be compared/ that implement ```comparable```,  will they always be sorted by some criteria?)

3) Can it contain duplicates?


Take a few minutes to answer these questions for the previously-discussed data structures.


## Definitions

ArrayLists: Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list.

HashMap: Hash table based implementation of the Map interface. This implementation provides all of the optional map operations, and permits null values and the null key.

ArrayLists and HashMaps are part of the [Collections package](http://docs.oracle.com/javase/tutorial/collections/intro/index.html) in Java.

The abstract data types and interfaces allow collections to be manipulated independently of the details of their representation.


## Exercise and Group-Review

- Clone the following repo - https://github.com/abassawo/ParkingGarage and follow the README instructions.

- [More Maps exercises](https://github.com/C4Q/AC3.3/blob/master/lessons/hashmaps-and-sets/exercises/maps-exercises.md)


[Exit Ticket](docs.google.com/spreadsheets/d/1Dhso6GXmD60tvOJPc88RNfnOJVQH_yYJrFiuEBd0gVU/edit#gid=891675450)
