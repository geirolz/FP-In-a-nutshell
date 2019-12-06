# Function
A Function is an abstraction to **map**(convert) a value from a **domain** to another **domain**(codomain).

![Drag Racing](src/main/resources/imgs/function_draw.png)

In the figure we have **Integer** as domain and **String** as codomain, so we have a function from **Integer** to **String** 
and we can write it as `Integer -> String`.

Generalizing we can define a function as `f: A → B` _(from `A` to `B`)_

Typically the method used to execute a function is named `apply`. 

`String result = f.apply(10)`

---
## "apply" method in Java

```java
    interface Function<A, B>{
        B apply(A a);
    }
```

In the most of cases this interface is implemented as an **anonymous function**.

#### Example
```java
    Function<Integer, String> intToStr = new Function<Integer, String>{
        public String apply(Integer intValue){
            return intValue.toString();
        }   
    }
```

### Lamba expressions in Java
From Java 8 on we can use **lamba expressions** to obtain a more readable and concise code.

```java
    Function<Integer, String> intToStr = intValue -> intValue.toString();
```

