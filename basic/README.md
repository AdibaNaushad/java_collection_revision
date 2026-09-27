# Java Fundamentals & Collections Framework: Notes & Code Guide

> Comprehensive notes based on Java Full Stack & Backend Mastery ([00:00:00] to [01:25:00]).

---

## Table of Contents
1. [Java Execution & JVM Internal Architecture](#1-java-execution--jvm-internal-architecture)
2. [Classes, Objects & Memory Management](#2-classes-objects--memory-management)
3. [Java Program Anatomy (`public static void main`)](#3-java-program-anatomy-public-static-void-main)
4. [Data Types: Primitives vs Wrapper Classes](#4-data-types-primitives-vs-wrapper-classes)
5. [Loops, Flow Control & Logic Exercises](#5-loops-flow-control--logic-exercises)
6. [Collections Framework: `List` Interface & `ArrayList` Class](#6-collections-framework-list-interface--arraylist-class)
7. [Comprehensive Code Implementation](#7-comprehensive-code-implementation)

---

## 1. Java Execution & JVM Internal Architecture

Java is both a **compiled** and an **interpreted** language, which grants it the "Write Once, Run Anywhere" (WORA) capability.

### Compilation vs Execution Flow
1. **Source Code (`.java`)**: Plain English-like code written by the developer.
2. **Compiler (`javac`)**: Converts `.java` into bytecode (`.class`). Checks syntax errors at compile time.
3. **Java Virtual Machine (JVM)**: An isolated virtual environment that translates bytecode into machine code at runtime.

### Core JVM Components
* **Class Loader**: Loads compiled `.class` files via classpath using three stages:
  1. *Loading*: Reads the binary data of types.
  2. *Linking*: Verifies bytecode, allocates memory for static fields, and resolves symbolic references.
  3. *Initialization*: Sets static variables to initial values.
* **JVM Language Stack**: Memory allocated per thread. Follows LIFO (Last In, First Out). Stores method frames and local variables.
* **Heap Memory**: Shared across all threads. Stores all runtime objects and class instances. Managed automatically by the Garbage Collector.
* **Method Area**: Stores class metadata, bytecode instructions, and static fields.
* **Program Counter (PC) Register**: Every thread maintains its own PC register tracking the address of the current instruction being executed.
* **JIT (Just-In-Time) Compiler**: Identifies repetitive code segments ("hotspots") during runtime and compiles them directly into native machine code to optimize performance.

---

## 2. Classes, Objects & Memory Management

* **Class**: A blueprint or template representing real-world entities (properties and methods).
* **Object**: A concrete runtime instance of a class allocated in memory.

### Stack vs Heap Allocation
* **Stack**: Holds method calls, local variables, and primitive values. Fast access; frames are popped when methods finish execution.
* **Heap**: Holds the actual instance created with the `new` keyword. Stack references point to the heap memory address.

```java
// Reference 'c1' lives in Stack memory; the actual 'Car' instance lives in Heap memory
Car c1 = new Car();
