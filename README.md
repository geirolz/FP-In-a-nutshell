# FP in a nutshell
Functional Programming principles in a nutshell

## Programming paradigms
> *A programming paradigm is an approach to programming a computer based on a mathematical theory or 
>  a coherent set of principles
— P. Van Roy*

It defines:
* how computation is expressed and works;
* how a program is organized
    * structure: what parts
    * behaviour: how parts compute
    * interaction: how parts interact
    
<div class="centered">
    <img src="https://www.researchgate.net/profile/Peter_Van_Roy/publication/241111987/figure/fig1/AS:298670202343424@1448219933039/Languages-paradigms-and-concepts.png" />
</div>

### Examples
Some programming paradigms:
* Imperative paradigm: "Describes computation in terms of statements that change a program state" (Pascal, C, ...)
* Object oriented paradigm: "Send messages between objects to simulate the temporal evolution of a set of 
real world phenomena" (Java, C#, ...)
* Functional paradigm: "Computation is carried on entirely through the evaluation of expressions" (Haskell, Scheme, ...)
* Logic paradigm: "Answer a question via search for a solution, using facts and inference rules" (PROLOG, ...)
* ...

And what about the mixed programming paradigms? 
No one paradigm solves all problems in the easiest or most efficient way. 
* Scala: OOP + FP
* Oz: LP + FP
...

## Functional programming

### Historical notions
Lambda calculus ~1930s

Developed by the mathematician Alonzo Church.

It's a formal system in mathematical logic for expressing computation based on function abstraction 
and application using variable binding and substitution. 
**It's an universal model of computation that can be used to simulate any turing machine.**

<div class="centered">
    <img src="https://upload.wikimedia.org/wikipedia/commons/3/3a/Greek_lc_lamda_thin.svg" />
</div>

### Another mathematical useful concept
Category Theory introduced in 1942-1945 by Samuel Eilenberg and Saunders Mac Lane.

More and more neatly...
> *A category is an embarrassingly simple concept. A category consists of objects and arrows that go between them.
— Bartosz Milewski*

<div class="centered">
    <img src="https://upload.wikimedia.org/wikipedia/commons/e/ef/Commutative_diagram_for_morphism.svg" />
</div>

**It found a practical application in programming language theory, especially in functional programming languages.**

### Main characteristics
> *Programming in a functional language consists of building definitions and using the computer to evaluate expressions.
— Richard Bird - Philip Wadler*

* **Immutability: we create values or objects by initializing them. Then we use them, but we do not change their values or their state.**
* **Referential transparency: a program has the same effects and output on the same input;**
* Functions as a first-class object;
* Higher order functions;
* Lazy evaluation;
* Static polymorphic typing;
* User-defined data types;
* Pattern matching;
* List comprehension.