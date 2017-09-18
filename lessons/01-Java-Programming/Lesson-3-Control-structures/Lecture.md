# Control Flow
## If..Else and Conditionals
##### Java Programming, DSA

---

## Objectives

- Understand conditional expressions
- Write an "if" statement
- Write an "if... else" statement
- Write a "while" loop
- Write a "for" loop
- Write a "switch" statement
- Use break and continue keywords

---

## Resources

* [Main Resources Page](https://github.com/C4Q/AC-Android/tree/organization#java)
* [Java Docs on Control Flow](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
* [Video: If Statements](https://www.youtube.com/watch?v=jjx5mJOcLqM)
* [Video: Switch Statements](https://www.youtube.com/watch?v=oLpUfseieuE)
* [Video: Ternary Operators](https://www.youtube.com/watch?v=igc_jsQIoxY)

---

## Warm up exercise

```
public int average(int a, int b, int c) {
    int average = 0; // update this code to return the average of a,b,c
    return average;
}
```

* How can we make `average` more precise?

---

## Boolean Expressions

* Two boolean types `true` and `false`
* Boolean expression is code that evaluates to `true` or `false`

```java
boolean thisEvaluatesToTrue = 5 > 2;
System.out.println(thisEvaluatesToTrue);
boolean or = true || false;
// System.out.println(or);
boolean and = true && false;
// System.out.println(and);
```
---

## Boolean Operators

Operators that yield a `boolean` result. They ask `true`, `false` questions.

|Operator|Meaning|
|:-:|:--|
|```==```|Equals|
|```!=```|Not Equals|
|```>```|Greater than|
|```<```|Less than|
|```>=```|Greater than or equal to|
|```<=```|Less than or equal to|
|```&&```|Conditional And|
|```||```|Conditional Or|


---

## The Truth Table

All the possible combinations of `p` and `q` using the OR 
operator

|   p  |   q  | p \|\| q |
|:----:|:----:|:------:|
| true | true |  true  |
| true | false|  true  |
| false| true |  true  |
| false| false|  false |

The AND operator

|   p  |   q  | p && q |
|:----:|:----:|:------:|
| true | true |  true  |
| true | false|  false |
| false| true |  false |
| false| false|  false |

* A note on short-circuting

---

### Operator Exercise

* Given `p = true`, what is the result of `!p`
* Given `p = true` and `q = false`, what is the result of `p == !q`
* Given `p = true` and `q = false`, what is the result of `(p && q) || (!q)`

---

## Break

---

## Ternary Operators

* Simplified `if else` statement.
* Ideal for single statement, non-void statements

```
int carMileage = 500;
int minCarAge = carMileage > 300000 ? 15 : 5
```

---

## Questions?

[CodingBat](http://codingbat.com/prob/p159531)

---

## Unit 2: While and For Loops

While Loop
```
initializer;
while (condition) {
    execute_some_commands();
}
```

For Loop
```
for (initializer; condition; increment/interval) {
    execute_some_commmands();
}
```

---

While Loop Example

```
boolean isThirsty = true;
int cup = 1;
while (isThirsty) {
    System.out.println("drinking water");
    ++cup;
    if(cup == 3) {
        isThirsty = false;
    }
}

```

* Convert this to `for` loop.
* Create an infinite `while` loop.
* Create an infinite `for` loop.


---

## In-Class Exercises

---
