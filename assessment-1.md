1. What is the output of this code?

```java
String helloWorld = "Hello, World!";
if(helloWorld.length() % 2 == 0){
  System.out.println("A");
} else{
  System.out.println("B");
}
System.out.println("C");
```

A:


2. Use a while loop to store each letter in a String to an array of char

Sample Input: "GRACE HOPPER"
Expected output: ['G', 'R', 'A', 'C', 'E', ' ','H', 'O', 'P', 'P', 'E', 'R'];

A: 

```java
int[] numbers = new int[]{2, 4, 4, 10 10, 401, 101 }; //Expected Result: 399
```


3a. Given an array of integers, write code to find the index of the largest integer present in the array.

A:

3b. Given an array of integers called numbers, write code to find the difference between the largest and smallest integer;

A:

4. Given the following code for a String array, use a loop structure to populate the weekDays array with the appropriate values from "Sunday" to "Monday".

```java
String[] weekDays = new String[7];
```

A:

5. The following code snippet shows a custom array class that provides simple methods for accessing data in the array. Implement its setValue, getValue, and getLength function

```java
class FakeArrayInterface{
	void setValue(int idx, int value);
	int getValue(int index);
	int getLength();
}
class ArrayWrapper implements FakeArrayInterface{
	int[] arr;

	public ArrayWrapper(int length){
		 arr = new int[length];
	}


  public int getLength(){
      //Write your code below
  }

	public void setValue(int idx, int value){
	   //Write your code below;
	}

	public int getValue(int idx){
    //Complete the return statement below.
		return ;
	}
}
```

6. Debug the following function, which is meant to swap an array's value at two indices.
 
   The following function call should swap the array's first element and 3rd element.
   swap(array, 0, 2)
   EX: [10, 2, 3, 4, 5] -> [3, 2, 10, 4, 5]

```java
public void swap(int[] arr, int index1, int index2){
	int temp = arr[index2];
    arr[index2] = arr[index1];
    arr[index1] = index2;
}


```
7. Given a sorted array of integers, write code to find the most commonly-occuring integer.

Sample input: [0, 4, 9, 10, 10, 10, 10, 25, 25, 100];
Expected Output: 10;

