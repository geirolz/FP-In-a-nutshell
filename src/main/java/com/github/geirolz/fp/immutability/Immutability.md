# Immutability
Immutability is one of the most important things in functional programming.

<div class="notebox">Once a stateful instance is created no one can mute his state</div>
 
#### Advantages
- Thread safety
- Atomicity of failure
- Absence of hidden side-effects


https://www.leadingagile.com/2018/03/immutability-in-java/

---
#### Immutability in java
Java is not a purely functional programming language.
  
Immutability in Java consist in:
 - **Avoiding setter** methods
 - Respecting **data encapsulation**.
 - Keeping fields **final**.  

```java
    public class Person{
        private final String name;
        private final Integer money;
    
        public Person(String name, Integer money){
            this.name = name;
            this.money = money;
        }    
        
        public String getName(){ return this.name; }    
        public Integer getMoney(){ return this.money; }    
    }   
```

---
## Cool! But if i need to mute states ?

Don't mute already existing instance, **create a new one**.

Copy all fields and change only what you need to mute.

##### Mutable style
```java
    Person renato = new Person("Renato", 100);
    Person andrea = new Person("Andrea", 100);

    //Renato earn 100€, renato has 200€
    renato.setMoney(renato.getMoney() + 100);
    
    //Andrea lose 100€, andrea has 0€
    andrea.setMonet(andrea.getMoney() - 100);     
```

##### Immutable style
```java
    Person renato = new Person("Renato", 100);
    Person andrea = new Person("Andrea", 100);

    //Renato earn 100€, renato has 200€
    Person richRenato = new Person(renato.getName(), renato.getMoney() + 100);
    
    //Andrea lose 100€, andrea has 0€
    Person poorAndrea = new Person(andrea.getName(), andrea.getMoney() - 100);
     
```

---
#### Another typical example

How to count a list size without using mutable state? Using recursion! 

**Scala** examples, because **Java** doesn't support tail recursion.

```scala
def size(list: Seq[Int]): Int =
    list match {
      case Nil => 0 // if list.isEmpty()
      case el :: tail => size(tail) + 1 // otherwise
    }
```

or better ....

```scala
  def sizeTailRec(listIn: Seq[Int]): Int = {
    def sizeAcc(list: Seq[Int], acc: Int): Int =
      list match {
        case Nil => acc // if list.isEmpty()
        case el :: tail => sizeAcc(tail, 1+acc) // otherwise
      }

    sizeAcc(listIn, 0)
  }
```

if you try with `List.range(1, 100000)`:
* with the 1st example -> `java.lang.StackOverflowError`.
* with the 2nd example it works fine. It uses the **tail recursion**.