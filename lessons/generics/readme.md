- title: Generics and Parameterized Types
- tags: generics types

# Objectives

- Review extending abstract classes
- Master reading types and Generic notation
- Understand when to use generics
- Review techniques to organize code in an object-oriented fashion.

# Resources

- [Java Docs](https://docs.oracle.com/javase/tutorial/java/generics/types.html)
- link to resource 2

# Lecture

Recall that abstract classes are a special kind of class that are used just for inheritance and that cannot be instantiated.


Why would we use an abstract class over an interface? An interface defines what an object can do, while an abstract class defines what an object is.

Different subclasses of a class may need to be capable of representing different types of data.

Think back to our examples of the HashMap data structure and ArrayLists.

```java
Map map = new HashMap();

List list = new ArrayList();

```

The HashMap example above does not raise any compile errors, but it can still be improved. This initialization does not leverage Java's type-safety features.

You should favor specifying types for your object declarations and initialization.

```java
Map<String, AbstractCar> map = new HashMap<>();

List<Integer> numbers = new ArrayList<>();
```

Compare the two examples above. It is generally a good idea to specify what data types you want these container objects to hold. Best practice is to use these structures to contain the same type of elements (or subclasses of a given type).


# Generics

Generic types or generics for short are the secret to being able to specify a specific type when creating our earlier instances of HashMaps and ArraysLists.

Generics allow us to create a class that works for any Object, while the type isn't specified until instantiation. The syntax for Generics is angle brackets and an uppercase letter, e.g. ArrayList<E>. Some interesting things to note:


You can think of a type parameter as a placeholder for a type to be specified at the time the parameterized type is used, just as a formal method argument is a placeholder for a value that is passed at runtime.


You can add a SubClass to ContainerClass<SuperClass>.
ContainerClass<SubClass> is not a subtype of ContainerClass<SuperClass>.
The superclass of all ContainerClass<E> is ContainerClass<?>.

Can you think of any examples of generics that you have seen so far?



### More on Generics

List<E> is read as "list of E", and List<String> is read as "list of string", where String is the actual type parameter


The type bound <T extends Comparable<T>> may be read as "for every type T that can be compared to itself" (mutually comparable type)

Generics enhance Java with special syntax for dealing with entities, such as Lists, that you commonly want to step through element by element. If you want to iterate through ArrayList, for instance, you could write code like:

```
for (String s : myArrayList) {
    String s = System.out.println(s);
  }
```

This syntax works for any type of object that is Iterable (that is, implements the Iterable interface).

### Benefits of Generics

- Stronger type checks at compile time. Fixing compile-time errors is easier than fixing runtime errors.

- Eliminating code that looks like this
```java
List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0);
```
This refactored code better serves our needs:
```java
List<String> list = new ArrayList<String>();
list.add("hello");
String s = list.get(0);   // no cast
```

- Enabling programmers to implement generic algorithms.

- Better code reusability - By using generics, programmers can implement generic algorithms that work on collections of different types, can be customized, and are type safe and easier to read.

### Naming type parameters

The recommended naming convention is to use uppercase, single-letter names for type parameters. For common generic patterns, the recommended names are:
K - A key, such as the key to a map
V - A value, such as the contents of a List, Set, or the values in a Map
E - An exception class
T - A generic type


## Criteria for Parameterizing a class

- Is the parameterized type a core class at the center of the class you're creating?. i.e, does the "thing" at the center of the class apply widely, and are the features  surrounding it identical.

- Common behavior: You do pretty much the same operations regardless of the "thing" at the center of the class.




See also [WildCards](https://docs.oracle.com/javase/tutorial/java/generics/upperBounded.html)

### Unbounded WildCards

List<?>, represents a list of some unknown type

Collection<?> ("collection of unknown"),

The unbound wildcard type above, such as in List<?>, represents a list of some unknown type. Since we don't know what the element type of c stands for, we cannot add objects to it. The add() method takes arguments of type E, the element type of the collection. When the actual type parameter is ?, it stands for some unknown type.

Any parameter we pass to add would have to be a subtype of this unknown type. Since we don't know what type that is, we cannot pass anything in. The sole exception is null, which is a member of every type.

### Bounded WildCard

![Bounded WildCard](http://i.imgur.com/6ofVsCK.png)
