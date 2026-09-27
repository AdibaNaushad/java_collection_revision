public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

public: Access modifier making the class and entry point accessible from anywhere outside the package.

static: Allows the JVM to execute the method without creating an instance/object of the class in memory.

void: Return type specifying that the method does not return any data.

main: The standard identifier the JVM scans for as the program entry point.

String[] args: Command-line arguments passed as an array of strings into the program at execution.

4. Data Types: Primitives vs Wrapper Classes
Primitives
Low-level data types stored directly on the stack with fixed memory limits:

byte (1 byte), short (2 bytes), int (4 bytes / 32 bits), long (8 bytes)

float (4 bytes), double (8 bytes)

char (2 bytes, Unicode single quote: 'A')

boolean (1 bit logical value: true / false)

Wrapper Classes
Object representations of primitives (e.g., Integer, Long, Double, Character, Boolean):

Wrapped over primitives to provide utility methods (e.g., Integer.toString(a), parsing, conversions).

Essential for working with Generics and Collections (since Java Collections cannot store primitives directly).

5. Loops, Flow Control & Logic Exercises
Dry Principle (Don't Repeat Yourself)
for loop: Best when iteration count is known beforehand (for (int i = 0; i < n; i++)).

while loop: Best for condition-based iteration (while (condition)).

Unary Operators:

i++ (Post-increment): Evaluates current value in expression first, then increments.

++i (Pre-increment): Increments value first, then evaluates in expression.
