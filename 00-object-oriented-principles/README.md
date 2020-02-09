## Introduction to Object Oriented Programming

> OO Programming models objects in the software system.

Recap

1. Decomposition

   > Breaking down a complex problem into smaller parts/subproblems to simplify difficult design tasks.

   Why

   - Subproblems can be solved independently
   - The solutions to the subproblems can be 'composed' to solve the original problem.

   Advantages

   - Different people can work on different subproblems
   - Parallelization may be possible
   - Maintenance is easier

2. Abstraction
   > Abstraction is the way humans deal with complexity.
   - The context is critical before forming an abstraction.
   - Abstraction constitutes of attributes (the properties) and behaviours (the actions, functions, methods).
   - Ignores inconvenient details
   - Helps with decomposition

3) Encapsulation
   > Blackbox - pass in inputs and get outputs
   - class with its own properties and methods
   - access modifiers with Java (public, private, protected...)
   - controls who can access properties and methods within class
   - who can/can't update state directly/indirectly

4. Inheritance

   > Extending the functionality of an object so that it can acquire the properties and methods of an existing class/object.

   - Aims to provide reusability so class
   - Parent/super/base class - class which properties & methods are inherited from
   - Child/sub/derived class - class which extends the features of another class
   - _No multiple inheritance in Java_, see diamond problem that creates ambiguity

5. Polymorphism

   > Allows us to perform a single action in many different ways.

   - Allows multiple implementations from a generic method

---

### Lab Problem

Every student at the University of Guyana is required to use SRMS when undertaking studies at the university.

To register, each student provides his/her name, gender and email. The student is asked to provide an active email address for receiving updates from newsletters. After registration and getting accepted to pursue a programme, a student is given a unique student identifier, that is associated with the student for his/her entire time during the programme. This unique identifier is called a _USI_ short for _unique student identifier_.

The university provides General and Specialized studies for a specific set of programmes, these are:

1. Information Technology (General)
2. Information Technology (Specialized)
3. Computer Science (General)
4. Computer Science (Specialized)

The General student is required to attend at least 75% of his/her classes in order to be eligilbe to write the final exam to pass the programme. If he/she fails to reach the attendance count, the General Student is withdrawn from the programme. The programme classes are completed within 60 days.

However, the Specialized programmes are more intensive and the Specialized student is required to attend at least 80% of his/her sessions in class to be eligible to write the final exam for the programme. If he/she fails to reach the attendance count, the Specialized Student is withdrawn from the programme. Classes are completed within 80 days.

### Exercise

1. Decompose the problem, using object oriented decomposition.
   - Identify the relevant abstractions within context of the problem
   - Include class properties and methods
2. Implement encapsulation, inheritance and polymorphism as relative to problem context
