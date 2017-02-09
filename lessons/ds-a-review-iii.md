# Exercises

***For each of the following exercises, complete the exercise AND calculate the worst-case runtime in Big-O notation of your solution***

1) Write a function called `wordToArray(String word)` that takes in a string as an argument and returns an array that contains all of the letters of that word.


2) Write a function `truncate(String input, int truncateBy)` to truncate a string if it is longer than the specified number of characters. The function should take two arguments, the first argument being the string and the second argument being the number of characters to truncate the string by. Truncated strings should end with an ellipsis sequence ("..."). If the specified number is large than the length of the string, the entire string should be returned.


3) Write a function called `checkUnique(String input)` that takes in a string as an argument and checks if the string has all unique characters. In other words, the function should check to make sure there are no duplicate characters in the string. If the string's characters are all unique, the function should return true. Otherwise it should return false.


4) Write a method that takes a string parameter.  For longer strings, the method returns a new string constructed out of the first three letters of the argument, followed by three periods (`"..."`), followed by the last letter of the argument.

However, if the resulting string is not shorter than the argument, the method should return the argument instead.

For example,

```java
elide("Hello!")               // returns "Hello!"
elide("Hello, world!")        // returns "Hel...!"
elide("That's not my name.")  // returns "Tha...."
```

Remember that `String.substring()` can take two arguments: the start index and the end index.


5) Write a function `xToNum(x, num)` that takes as arguments two numbers: **x** and **num** and returns the sum of all numbers from **x** to **num** (including both). For example:

```java
xToNum(4, 8)  // = 4 + 5 + 6 + 7 + 8 = 30
```

will return 30.


6) Write a function `stringArrays` that takes two arrays as arguments and returns ONE string that contains all the words in both arrays, separated by commas. In other words, the function joins both arrays together then turns everything into a string.

Example:
```js
stringArrays(['arya', 'sansa', 'bran'], ['daenerys', 'tyrion', 'jon']); // returns 'arya, sansa, bran, daenerys, tyrion, jon'
```


7) Assume you have a function called `isSubstring(String s1, String s2)` which checks if one word word is a substring
of another. Given two strings, s1 and s2, write a function called `isRotated` to check if s2 is a rotation of s1 using only one call to `isSubstring` (e.g., "waterbottle" is a rotation of "erbottlewat").

Examples:
```js
isRotated("waterbottle","erbottlewat" ); //returns true
isRotated("waterbottle","bottlerewat" ); //returns false
isRotated("dragon","agondr" ); //returns true
isRotated("dragon","dog" ); //returns false
```


8) Write a function `decode(code)` that decodes a string of 0's and 1's into a two-digit number. The input string will consist of a sequence of 0's - representing the first digit, followed by a sequence of 1's - representing the second digit. Return an array which contans both digits.

For example, the string:

```
"0001111"
```

Represents the number 34, and will be returned in an array: [3, 4]


9) Describe at least three properties of a node in a doubly linked list.
