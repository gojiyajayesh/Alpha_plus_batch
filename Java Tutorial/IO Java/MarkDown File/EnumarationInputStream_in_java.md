# Enumeration Interface in Java

## Overview

The `Enumeration` interface in Java is a legacy interface that represents a collection of elements. It is used to iterate over a collection of objects, similar to the more modern `Iterator` interface. `Enumeration` provides methods to traverse through a collection sequentially.

## Methods

### 1. `boolean hasMoreElements()`

```java
boolean hasMoreElements()
```

- **Description**:
  - Tests if there are more elements available in the enumeration.

### 2. `Object nextElement()`

```java
Object nextElement()
```

- **Description**:
  - Returns the next element in the enumeration. If there are no more elements, it throws a `NoSuchElementException`.

## Example Usage

### Example 1: Basic Enumeration with Vector

```java
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            String fruit = enumeration.nextElement();
            System.out.println(fruit);
        }
    }
}
```

**Explanation**:

- A `Vector` is created and populated with strings.
- `Enumeration` is obtained from the `Vector` using the `elements()` method.
- The `while` loop iterates over the elements using `hasMoreElements()` and `nextElement()`.

### Example 2: Using Enumeration with SequenceInputStream

```java
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        byte[] data1 = "Hello, ".getBytes();
        byte[] data2 = "World!".getBytes();

        InputStream stream1 = new ByteArrayInputStream(data1);
        InputStream stream2 = new ByteArrayInputStream(data2);

        Vector<InputStream> streams = new Vector<>();
        streams.add(stream1);
        streams.add(stream2);

        Enumeration<InputStream> enumeration = streams.elements();
        InputStream sequenceStream = new SequenceInputStream(enumeration);

        try {
            int b;
            while ((b = sequenceStream.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                sequenceStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```

**Explanation**:

- Two `ByteArrayInputStream` instances are created with byte arrays.
- A `Vector` of `InputStream` objects is created and populated.
- A `SequenceInputStream` is created using the `Enumeration` of the vector.
- Data is read from the `SequenceInputStream` and printed to the console.

## When to Use

- **Legacy Code**: Use `Enumeration` when working with older codebases or APIs that use this interface.
- **Simple Iteration**: For simple, sequential access to elements in a collection.

## Differences from Iterator

- **Iterator**: `Iterator` is the modern alternative to `Enumeration` and provides additional functionality like `remove()`. It also uses generics, which makes it type-safe.
- **Enumeration**: `Enumeration` is more limited and does not support removal of elements or generics.
