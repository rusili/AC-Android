# Review of Abstract Classes, Lists, and Maps

## Objectives:
- Review abstract classes and how to use the following data structures to organize data.
- ArrayLists
- HashMaps

## Vocabulary

|Term|Definition|
|:--:|:---------|
|**Array**|a static data structure that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed. This means that an Array's size is immutable.|
|**ArrayList**|a dynamic data structure, meaning items can be added and removed from the list. This means that an ArrayList's size is mutable. A normal array in java is a static data structure, because you are stuck with the initial size of your array at assignment. An ArrayList can change in size by adding or removing elements.|
|**HashMap**|a dynamic data structure, meaning items can be added and removed from the map. Comparable to a dictionary, allowing users to store key/value pairs (like names/phone numbers, or words/definitions).|
|**Interface**|an abstract type that is used to specify a behavior that classes must implement. Interfaces are declared using the interface keyword, and may only contain method signatures, and constant declarations.|
|**Abstract Class**|classes that contain one or more abstract methods. An abstract method is a method that is declared, but contains no implementation. Abstract classes may not be instantiated, and require subclasses to provide implementations for the abstract methods.|

## Resources

### Documents

- [Java docs](http://docs.oracle.com/javase/tutorial/collections/intro/index.html)
- [Abstract Classes](http://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)

### Videos

- [Video: Arrays in Java](http://www.youtube.com/watch?v=Mfacb9T4biQ)
- [Video: ArrayLists](http://www.youtube.com/watch?v=mkCTxtLe7XU)
- [Video: HashMaps](http://www.youtube.com/watch?v=-JOSjIan2g0)
- [Video: Inheritance](http://www.youtube.com/watch?v=wzW-251bGgM)
- [Video: Abstract Classes](http://www.youtube.com/watch?v=CUC522qMGe8)
- [Video: Interfaces](http://www.youtube.com/watch?v=UumX4mQKQlA)

# Lecture

Data structures are an important part of any programming language, especially Java. The Java programming language has a great number of data structures used to store elements/data in a myriad number of ways. Some of the more popular data structures you may encounter are Arrays, ArrayLists, and HashMaps.

### Arrays

Arrays are a data structure where elements of the same data type are assigned in order, by an index. An example of an array of String elements ( String[] ) can be seen in the code snippets below:

```java
// String elements directly assigned to an int array, setting its length to only 5 elements

String[] stringArray = {"John", "Amy", "Theo", "Bharat", "Cristella"};
```

```java
// String array declared, and initialized with an array of exactly 5 int elements

String[] stringArray = new String[5];
```

A programmer who wants to know how many elements have been assigned to an array, or how many indices for elements have been allocated during initialization of this array, may use the ```.length``` property, which may be called on all array objects:

```java
// This will return the length, or the number of elements assigned to the array object

stringArray.length;
```

All elements in an array have an index number. The first element has an index number of 0, and the index of the last element is equal to the length of the array, minus 1.

A programmer may also access or reassign elements within the array, by using the element's index:

```java
// This will allow a user to access the first element of the array, at index 0

stringArray[0];

// This will allow the user to access the last element of the array, regardless of actual index number

stringArray[stringArray.length - 1];

// This will allow the user to access an element in the array, by its index, and assign it a value

stringArray[2] = "Hyun";

```

### Lists, and ArrayLists

An ArrayList behaves very much like an array, in that you may find out the number of elements in it, add elements only of a certain type, where each element has an index, and you can access/change the value of an element by calling it with its index. However, with an array, you cannot increase its size once you have initialized it, without replacing the entire array with a new one, containing both the old and new elements. You can, however, do this with an ArrayList.

```java
// First, you instantiate an ArrayList

ArrayList<String> stringArrayList = new ArrayList<>();
```

You might have seen the keyword ```String``` in angle brackets next to the static type **ArrayList**, as in ```ArrayList<String>``` - this is similar to how you might create an array of type ```String[]```:

```java
String[] stringArray = new String[5];
```

You are essentially stating that the ArrayList you are instatiating will only accept elements of type ```String``` - this is called the ArrayList's **type parameter**. When we do this, under the hood, we are leveraging the power of something called **generics** (we will not cover this today, but soon).

Now that we have this ArrayList object called ```stringArrayList```, let's add elements to it! We can do this with a method called ```.add()```, and we simply pass an argument of type ```String``` into the method's parameter:

```java
stringArrayList.add("Juan-Carlos");
stringArrayList.add("Ashique");
stringArrayList.add("Oksana");
```

The method ```.add()``` will add a new element to the end of the ArrayList.

Now that we've added elements to our ArrayList, let's find out its length. The method we can call for that is ```.size()```:

```java
stringArrayList.size();
```

If we want to update a value at a certain index that already exists, you can use the method ```.set()```:

```java
stringArrayList.set(1, "Pawel");
```

With that method call, we have just updated the value of the element at index 1 from "Ashique", to "Pawel"!

If we want to add an element between two other elements, we can call the method ```.add()```, but with the specific index we want to add our element to:

```java
stringArrayList.add(1, "Selma");
```

This will shift all of the other elements to the next index, while adding the string "Selma" to index 1.

If we want to remove an element, we can call the method ```remove()```, passing in an index to the parameter:

```java
stringArrayList.remove(1);
```

This will shift all of the other elements after the passed-in index, back by one index, effectively removing the element at that index.

ArrayLists are a very flexible data structure when it comes to adding elements in a numbered order. However, unless you know the index of the element you wish to access, you will most likely have to check every single element to confirm that you are accessing the correct one. Also, the values stored at each index might change with use, and so calling an element by its index might bring unexpected results.

### Maps, and HashMaps

Maps are different from ArrayLists, in that entries in this data structure are stored as key/value pairs. Maps like HashMaps are often called dictionaries in other languages, because they are similar to how one can search for the definition (value) of a word (key) by simply finding the word (key) in the dictionary. Let's create a HashMap:

```java
HashMap<String, String> kindsOfPets = new HashMap<>();
```

This is very similar to how we created an ArrayList object earlier, except that this time, there are two **type parameters** - one for the **key** (the word you will use to get the value you wish to store), and one for the **value** (the actual value you wish to recall when using the key).

Now that we have our HashMap, let's add some values to it, by using the method ```.put()```, and passing in two ```String``` values - one for the key, and one for the value:

```java
kindsOfPets.put("cat", "a domestic feline pet");
kindsOfPets.put("dog", "a domestic canine pet");
kindsOfPets.put("hamster", "a domestic rodent pet");
```

There are several obvious differences between an ArrayList and a HashMap, from what we can already see - there are no indices, meaning you do not add them to a certain location, or a certain order, within the data structure. Also, instead of assigning an elemnt to a particular index, we have made an association between a word, and a definition.

Let's say, after putting a word and its definition into a HashMap, we also want to get a definition (value) out of a HashMap, by using it's word (key). We can simply use the method ```.get()``` on the HashMap object:

```java
// This will retreive the definition "a domestic canine pet"

kindsOfPets.get("dog");
```

There is a catch to using a HashMap - although each value may be different, all of the keys you put into this data structure must be unique. Which means, if you use the key "dog" more than once to enter a definition, you won't be adding a second definition, you will instead replace the previous one:

// Original entry
kindsOfPets.put("dog", "a domestic canine pet");

// Replaced entry
kindsOfPets.put("dog", "a person's most hyperbolically bestest friend ever!");

<!--
We have learned about these data structures before. They are actually just concrete implementations of some abstract classes defined in Java's Collections framework.  

  - ArrayList extends the AbstractList class and implements the following interfaces (List, RandomAccess, Cloneable, and java.io.Serializable).
  - HashMap which extends AbstractMap<K, V> and implements Map<K, V>, Cloneable, and Serializable

We don't really need to dive into such detail about the hierarchy of these structures, but in short A Java class containing data fields and records AND methods that operate on some content may serve as a data structure.

--->

### On Abstract classes

  Abstract classes can implement interfaces as well by using the ```implement``` keyword. However, because they are abstract, they don't need to implement all methods. The AbstractList interface implements common methods, which allows concrete implementations like ArrayList and LinkedList to be free from burdening of implementing all methods if they implemented the List interface directly.

  Because abstract classes need to be subclasses, they cannot be declared as final. "They are also opposite of each other, abstract keyword enforces to extend a class, for using it, on the other hand, final keyword prevents a class from being extended. In real world also, abstract signifies incompleteness, while final is used to demonstrate completeness. Bottom line is, you can not make your class abstract and final in Java, at same time, it’s a compile time error.

### On Structures

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
 /*This constructor builds an ArrayList that is initialized to have an initial capacity equal to capacity. The capacity of the ArrayList can grow automatically as elements are added to the list.*/
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
