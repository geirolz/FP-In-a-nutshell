# Function
A Function is an abstraction to **map**(convert) a value from a **domain** to another **domain**(codomain).

![Drag Racing](src/main/resources/imgs/function_draw.png)

In the figure we have **Integer** as domain and **String** as codomain, so we have a function from **Integer** to **String** 
and we can write it as `Integer -> String`.

Generalizing we can define a function as `f: A → B` _(from `A` to `B`)_

---

#### Functions in Java
In java we can see the function abstraction as a simple interface with a method named `apply` 
that accept only one argument of type `A` and returns an instance of `B`.

```java
    interface Function<A, B>{
        B apply(A a);
    }
```

Referring to previously example, here we have a function from `Integer` to `String`
```java
    Function<Integer, String> intToStr = new Function<Integer, String>{
        public String apply(Integer value){
            return value.toString();
        }   
    }
```

We can even think methods as function. 
This method accept an `Integer` and returns a `String` exactly like our function above, so this method can be written as function.  
```java
    //Integer -> String    
    public String intToStr(Integer value){
        return value.toString();
    }
```

---
#### Function composability

All functions as **combinable**.

If we have a function `f: A -> B` and a function `g: B -> C` 
then we can compose them obtaining a function `z: A -> C`.

Typically the method used to combine two functions is named "**andThen**".

`z = f.andThen(g)`


---
#### Function composability in Java

```java
    public String intToStr(Integer i){
        return i.toString();
    }
    public String toEuro(String value){
        return value + "€";
    }  

    toEuro(intToStr(10))//"10€" 
```

```java
     interface Function<A, B>{
            B apply(A a);
            default Function<A, C> andThen(Function<B, C> f){
                a -> f.apply(this.apply(a));
            }       
     }

    Function<Integer, String> intToStr = i -> i.toString();
    Function<String, String> toEuro = s -> s + "€";

    //-1    
    intToStr.andThen(toEuro).apply(10);//"10€"
```




