6. Collections Framework: List Interface & ArrayList Class
The Structural Hierarchy
    Iterable<E> (Interface)
        ↑
    Collection<E> (Interface)
        ↑
      List<E> (Interface)
        ↑
    AbstractList<E> (Abstract Class)
        ↑
    ArrayList<E> (Concrete Class)
Why Program to an Interface?
Java
List<String> names = new ArrayList<>();
List (Interface): Defines the behavioral contract/template (what methods must exist: add(), get(), remove(), size(), contains()). It contains method signatures without implementation bodies.

ArrayList (Concrete Class): Implements the List interface using a dynamically resizable array under the hood.

Design Advantage: Writing List<T> list = new ArrayList<>() follows the principle of loose coupling. You can switch to LinkedList or another List implementation without altering business logic dependent on List.

Generics (<E>)
Ensures type safety at compile time, eliminating runtime ClassCastException.

Placeholder <E> is substituted by the concrete wrapper type (e.g., <Integer>, <String>).
