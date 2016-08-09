- author: abass@c4q.nyc
- language: java
- topics: conditional, if, else, control
- difficulty: 1
- format: coding
- attribution: original

### Question
Write a program that prompts the user for a username and password.
Any user name is acceptable, but the password must contain the word coalition (not-case sensitive).


```java
public static String readInput(){
  Scanner scanner = new Scanner(System.in);
  String out = "";
  while(scanner.hasNext()){
      out += scanner.next();
  }
  return out;
}
```
