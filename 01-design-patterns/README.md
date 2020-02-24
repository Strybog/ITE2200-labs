## Design Patterns

### Composite design pattern

> Allows you to compose objects into a tree structure

- Is a _structural_ design pattern
- Both branches and leaves can be treated uniformly
- Try to break it down into simple _elements_ and _containers_ first.

- Scenarios where this pattern can be modelled include
  - computer's file system
  - organizational chart
  - family tree hierarchy

---

### Observer design pattern

> Defines a one to many relationship among objects, so that when one object changes state (publisher or observable), all dependent objects (subscribers or observers) are notified and updated automatically.

- Is a _behavioural_ design pattern
- One to many relationship -> One (subject), Many (observers)
- Disadvantage: **Memory leaks** as you need to explicitly register and unregister the observers.

- Scenarios where this pattern can be modelled include
  - event handing in web application; when user clicks a button, all objects that depend on the button's _click event_ should be notified that a click event occurred
  - Social media
  - Email subscription

---

### Strategy design pattern

> Defines multiple algorithms, separated as concrete strategies and makes their objects interchangeable.

- Is a _behavioural_ design pattern
- Solves the design problem - _How can an algorithm be selected and exchanged at run-time?_ & _How can a class be configured with an algorithm at run-time instead of implementing an algorithm directly?_
- Useful when we have multiple algorithms for specific task and we want flexibility in choosing an algorithm at runtime for specific task

- Scenarios where this pattern can be modelled include
  - Calculating prices in an order processing system
  - `Collections.sort()` method that takes a comparator parameter, based on different implementations of comparator interfaces.

---

### Resources

1. List of patterns and implementations (in Java)

   > https://www.javacodegeeks.com/design-patterns-java-tutorials

2. Beginners introduction to design patterns (implementations in Java here as well)

   > https://dzone.com/articles/design-patterns-for-beginners-with-java-examples

3. Detailed Design Patterns Reference with sample code (W3C)

   > https://w3sdesign.com/GoF_Design_Patterns_Reference0100.pdf

4. Composite design pattern and implementation in Java

   > https://www.javacodegeeks.com/2015/09/composite-design-pattern.html

5. Composite design pattern

   > https://refactoring.guru/design-patterns/composite

6. Observer design pattern

   > https://refactoring.guru/design-patterns/observer

7. Strategy design pattern

   > https://refactoring.guru/design-patterns/strategy

8. Strategy design pattern with Java example

   > https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial

#### Videos

1. Strategy design pattern - https://www.youtube.com/watch?v=Nx8iUv-ZnPw

2. Observer design pattern - https://www.youtube.com/watch?v=wiQdrH2YpT4

3. Composite design pattern - https://www.youtube.com/watch?v=2HUnoKyC9l0
