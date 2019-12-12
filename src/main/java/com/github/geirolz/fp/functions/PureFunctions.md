# Pure Functions

A pure function is:

* a function where the return value is only determined by its input values, without observable side effects. 

* referential Transparent

A pure function keeps the state local and can only access what you pass it, so it’s easy to see its dependencies. We don’t always write functions like this. When a function accesses some other program state, such as an instance or global variable, it is no longer pure.

Let's have a look at what is NOT a Pure Function

---

# (Im)Pure Functions
 
```java 
Set<Integer> s = new HashSet<>();
 
public static boolean foo(int x) {
    return s.contains(Integer.valueOf(x))
}
 
s.add(Integer.valueOf(1));
foo(1); //true
s.remove(Integer.valueOf(1))
foo(1) //false   
```
## Can you write useful programs without side effects?
This interaction with the outside world won’t occur in the middle of a computation, but only when you finish the computation.

In other words, side effects will be delayed and applied separately.
