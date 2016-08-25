Maps are useful for representing key - value relationship of objects. Implement the following method, which takes as inputs: a starting integer, and ending integer. It returns a map that maps Strings to Integers, where the key is the String representation of the integer and the value is the Integer value.


```java
public Map<String, Integer> createMapOfIntegers(int start, int end){

}
```

Please work through these exercises, completing as many as you can in class.  

1. **Finish moons:** Finish the HashMap of number of moons for each planet.

1. **Moons as method:** Convert this to a _method_ that _returns_ this hashmap.  It should look like this:

  ```java
  public static HashMap<String, Integer> getNumberOfMoons() {
      // Write code here!
  }
  ```


1. **Moons overload:** Create an _overload_ for this method that takes a planet name as an argument and returns the specific number of moons.  Be careful how you handle an argument that is not the name of a planet.

  ```java
  public static int getNumberOfMoons(String planet) {
      // Write code here!
  }
  ```

1. **Is a planet:** One nice bonus of having this hashmap is that you can check whether a string is the name of a planet by checking whether that string is a key in the hashmap.  Write a method that does this:

  ```java
  public static boolean isPlanet(String name) {
      // Write code here!
    }
```

Test your method on a few real and fake planet names.

1. **State capitals:** Copy the [Capitals.java file](exercises/Capitals.java) into your project. It includes a method `getCapitals()` that returns a hashmap from state names to capitals.  In the `main()` method, write a program that prompts the user for a state name.  If the user enters a state name, print out,


  ```
  The capital of (state) is (capital).
  ```

  Otherwise, print out,

  ```
  (name) is not a state!
  ```

  Make sure you test your program on correct and incorrect state names.

1. **Map of word lengths:** Write a method that takes an array list of strings as a parameter, and creates and returns a hash map whose keys are the strings from the array and whose values are the lengths of these strings.

  ```java
  public static HashMap<String, Integer> getLengths(ArrayList<String> strings) {
    // Write code here!
  }
  ```

  For example, if you call it with an array containing "hello" and "goodbye", you'll get back a hash map with two keys: "hello" associated with the value 5, and "goodbye" associated with the value 7.

  Test it with code similar to this.

  ```java

  ArrayList<String> words = new ArrayList<String>();
  words.add("banana");
  words.add("pineapple");
  words.add("cantaloupe");

  HashMap<String, Integer> lengths = getLengths(words);
  System.out.println(lengths.get("banana"));      // should print 6
  System.out.println(lengths.get("cantaloupe"));  // should print 10
  System.out.println(lengths.get("broccoli"));    // should print null
  ```


1. **(Bonus) Two lists make a map:**  Another way to represent a mapping is with the key and value columns in the tables

shown above, using one `ArrayList` for the keys and one `ArrayList` for the columns.  

  For example, to represent the number of moons for each planet, the keys will be a `ArrayList<String>` containing Mercury, Venus, Earth, Mars, _etc._ and the values will be a `ArrayList<Integer>` containing 0, 0, 1, 2, _etc._  To look up the value for a key, first find the index of the key in the keys list, and then extract the corresponding index from the values list.

  The lesson project [`ListMap`](exercises/ListMap.java) contains a class named `ListMap`, which sets this up for you.  There are three methods for you to implement: one to put a key and value into the "map", one to look up a key, and one to remove a key and value.  The `main()` method contains tests: once you have implemented the other three methods correctly, all the tests should print "true"!

  Note: While this is a correct way to implement maps in Java, the reason we don't usually do it this way is because it is inefficient once there are many keys and values in the map.
