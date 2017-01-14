            - title: Generics
- tags: generics, parameterized types

# Objectives

- learning objective 1: Inspect, analyze, and understand how the Android framework leverages generics to support code reuse.
- learning objective 2: Write code that uses generic types to increase flexibility and reusability.

# Resources

- [Generics](/generics)
- [Generics Trail](http://docs.oracle.com/javase/tutorial/java/generics/index.html)

# Lecture


Today, we'll explore generics as they are applied in the Android framework. Visit [generics](/generics) for a refresher from previous units.


## Vocabulary

Generics : A feature in Java's type system allowing “a type or method to operate on objects of various types while providing compile-time type safety.”

  EX: The Java collections framework  

You are leveraging generics everytime you declare a collection with a specified type

```List<Foo> fooItems; ```
```List<Integer> grades; ```

Where else have we seen generics in the past?

Example

public class IconicAdapter extends RecyclerView.Adapter<RowHolder> {

  @Override
  public RowHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return(new RowHolder(getLayoutInflater() .inflate(R.layout.row, parent, false)));
  }

  @Override
  public void onBindViewHolder(RowHolder holder, int position) {  
    holder.bindModel(items[position]);
  }

  @Override
  public int getItemCount() {
    return(items.length);
  }

 },,,


Structured Exercise: 



More Individual Exercise: 


