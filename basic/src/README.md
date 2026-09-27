```markdown
# Java Core Fundamentals

A quick reference guide covering entry point mechanics, data types, and core control flow logic.

---

## 1. Anatomy of the `main` Method

```java
public static void main(String[] args)

```

| Component | Description |
| --- | --- |
| `public` | Access modifier making the class and entry point accessible from anywhere outside the package. |
| `static` | Allows the JVM to execute the method directly without instantiating the class in memory. |
| `void` | Return type specifying that the method does not return any data. |
| `main` | Standard identifier the JVM scans for as the program's starting execution point. |
| `String[] args` | Command-line arguments passed into the program as an array of strings at execution. |

---

## 2. Data Types: Primitives vs. Wrapper Classes

### Primitives

Low-level data types stored directly on the stack with fixed memory footprints:

* **Integers:**
* `byte` — 1 byte (8 bits)
* `short` — 2 bytes (16 bits)
* `int` — 4 bytes (32 bits)
* `long` — 8 bytes (64 bits)


* **Floating-Point:**
* `float` — 4 bytes (32 bits)
* `double` — 8 bytes (64 bits)


* **Text & Logic:**
* `char` — 2 bytes (16-bit Unicode, e.g., `'A'`)
* `boolean` — 1 bit logical value (`true` / `false`)



### Wrapper Classes

Object representations of primitives (e.g., `Byte`, `Short`, `Integer`, `Long`, `Float`, `Double`, `Character`, `Boolean`).

* **Utility Methods:** Provide built-in parsing and conversion utilities (e.g., `Integer.toString(a)`, `Integer.parseInt(str)`).
* **Generics & Collections:** Required when working with Java Collections (e.g., `List<Integer>`), as collections cannot store raw primitives.

---

## 3. Loops, Flow Control & Logic

### DRY Principle *(Don't Repeat Yourself)*

* `for` loop: Ideal when the total iteration count is known in advance.
```java
for (int i = 0; i < n; i++) {
    // Loop body
}

```


* `while` loop: Best suited for condition-based iteration when loop counts are dynamic.
```java
while (condition) {
    // Loop body
}

```



### Unary Operators

* `i++` **(Post-increment):** Evaluates the current value inside the expression first, then increments.
* `++i` **(Pre-increment):** Increments the value first, then evaluates the updated value in the expression.

```


```
