# Functions Composability

All functions are **combinable**.

If we have a function `f: A -> B` and a function `g: B -> C` 
then we can compose them obtaining a function `z: A -> C`.

Typically the method used to combine two functions is named "**andThen**".

`z = f.andThen(g)`

### Advantages
- Combinable and modular code
- More readable code

---
## "andThen" method in Java
Let's implements `andThen` in Java.

```java
    interface Function<A, B>{
            B apply(A a);
            default Function<A, C> andThen(Function<B, C> f){
                a -> f.apply(this.apply(a));
            }       
    }
```

#### FP example
```java
    Function<Integer, String> intToStr = i -> i.toString();
    Function<String, String> toEuro = s -> s + "€";

    //-1    
    intToStr.andThen(toEuro).apply(10);//"10€"
```

##### OOP Example
```java
    public String intToStr(Integer i){ return i.toString(); }
    public String toEuro(String value){ return value + "€"; }   
    //Logical flow reversed, the input is the output of previusly call.
    toEuro(intToStr(10))//"10€" 
```
---
## Exercise

Take a look at package `com.github.geirolz.fp.functions.exercise`.
We have a class named `com.github.geirolz.fp.functions.exercise.EvenAverageCalculator` and the relative test class.

* Launch the test and fix the code, if necessary;
* Refactor the `compute()` method in order to compute that value with a 2 functions combination.

Hints:
Use `stream()`, `filter()`, `mapToDouble()`, `collect()` and `average()`.