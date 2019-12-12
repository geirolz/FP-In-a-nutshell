# Referential Transparency
The expression referential transparency is used in various domains, such as mathematics, logic, linguistics, philosophy and programming. It has quite different meanings in each of these domain. Here, we will deal only with computer programs, although we will show analogy with maths (simple maths, don’t worry)

<div class="notebox">Once a stateful instance is created no one can mute his state</div>
 
###In Maths
<div class="notebox">Referential transparency is the property of expressions that can be replaced by other expressions having the same value without changing the result in any way. </div>

### In functional programming
<div class="notebox">Referential Transparency is generally defined as the fact that an expression, in a program, may be replaced by its value (or anything having the same value) without changing the result of the program.</div>

---

## Let's do some example

### Yes, Maths! Again!

Consider this example:

x = 2 + (3 * 4)

We may replace the subexpression (3 * 4) with any other expression having the same value without changing the result (the value of x). The most evident expression to use, is of course 12:

x = 2 + 12

Any other expression having the value 12 (maybe (5 + 7)) could be used without changing the result. As a consequence, **the subexpression (3 * 4) is referentially transparent.**

We may also replace the expression 2 + 12 by another expression having the same value without changing **the value of x, so it is referentially transparent too**:

x = 14

It's easy to reason in this terms! Referential transparency allow us to reason easily!

---

### Cool, Programming..:)

Even in functional programming we can reason in this way: **method can be referentially transparent**, which is the case if a call to this method may be replaced by its return value!


```java
    int add(int a, int b) {
        return a + b;
    }
    
    int mult(int a, int b) {
        return a * b;
    }
    
    int x = add(2, mult(3, 4))
```

In this example, the mult method is referentially transparent because any call to it may be replaced with the corresponding return value. This may be observed by replacing mult(3, 4) with 12:

```java
int x = add(2, 12)

//In the same way, add(2, 12) may be replaced with the corresponding return value, 14:
int x = 14
```

### So, what's NOT Referentially Transparent

```java

int add(int a, int b) {
    int result = a + b;
    System.out.println("Returning " + result);
    return result;
}
```