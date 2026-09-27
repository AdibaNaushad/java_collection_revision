import java.util.*;


public class ListAndArrayListDemo {
    public static void main(String[] args) {
        // 1. Primitive vs Wrapper Conversion
        int num = 42;
        String numStr = Integer.toString(num);
        System.out.println("Converted Primitive to String: " + numStr);

        // 2. Fixed Primitive Array
        int[] primitiveArray = {10, 20, 30};
        System.out.print("Primitive array elements: ");
        for (int i = 0; i < primitiveArray.length; i++) {
            System.out.print(primitiveArray[i] + " ");
        }
        System.out.println();

        // 3. List Interface backed by ArrayList Class (Generics: Integer Wrapper)
        List<Integer> numberList = new ArrayList<>();

        // Core Methods under List & ArrayList
        numberList.add(100);             // add(E element)
        numberList.add(200);
        numberList.add(300);
        numberList.add(1, 150);          // add(int index, E element) - inserts at index 1

        System.out.println("List size: " + numberList.size());
        System.out.println("Element at index 2: " + numberList.get(2));
        System.out.println("Contains 200? " + numberList.contains(200));

        // Iteration via index-based get() method
        System.out.print("List contents: ");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.print(numberList.get(i) + " ");
        }
        System.out.println();

        // 4. Pattern Printing Practice (from tutorial exercise)
        System.out.println("\nPattern output:");
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
