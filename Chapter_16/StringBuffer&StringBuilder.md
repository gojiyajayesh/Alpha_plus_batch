# StringBuilder and StringBuffer in Java

## StringBuilder

### Methods and Examples

1. **append()**: Adds the specified string to the end.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    System.out.println(sb.toString()); // Outputs "Hello World"
    ```

2. **insert()**: Inserts the specified string at the specified position.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.insert(6, "Java ");
    System.out.println(sb.toString()); // Outputs "Hello Java World"
    ```

3. **replace()**: Replaces the characters in a substring with another string.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.replace(0, 5, "Hi");
    System.out.println(sb.toString()); // Outputs "Hi World"
    ```

4. **delete()**: Removes the characters in a substring.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.delete(5, 11);
    System.out.println(sb.toString()); // Outputs "Hello"
    ```

5. **deleteCharAt()**: Removes the character at the specified position.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.deleteCharAt(5);
    System.out.println(sb.toString()); // Outputs "HelloWorld"
    ```

6. **reverse()**: Reverses the sequence of characters.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    sb.reverse();
    System.out.println(sb.toString()); // Outputs "dlroW olleH"
    ```

7. **capacity()**: Returns the current capacity.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println(sb.capacity()); // Outputs the capacity (default is 16 + length of the string)
    ```

8. **charAt()**: Returns the character at the specified index.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    char ch = sb.charAt(1);
    System.out.println(ch); // Outputs "e"
    ```

9. **codePointAt()**: Returns the Unicode code point at the specified index.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    int codePoint = sb.codePointAt(1);
    System.out.println(codePoint); // Outputs the Unicode code point of 'e'
    ```

10. **codePointBefore()**: Returns the Unicode code point before the specified index.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    int codePoint = sb.codePointBefore(1);
    System.out.println(codePoint); // Outputs the Unicode code point before 'e'
    ```

11. **codePointCount()**: Returns the number of Unicode code points in the specified text range.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    int count = sb.codePointCount(0, 5);
    System.out.println(count); // Outputs the number of Unicode code points in "Hello"
    ```

12. **ensureCapacity()**: Ensures that the capacity is at least equal to the specified minimum.

    ```java
    StringBuilder sb = new StringBuilder();
    sb.ensureCapacity(50);
    System.out.println(sb.capacity()); // Outputs at least 50
    ```

13. **getChars()**: Copies characters from this sequence into the destination character array.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    char[] dst = new char[5];
    sb.getChars(0, 5, dst, 0);
    System.out.println(dst); // Outputs "Hello"
    ```

14. **indexOf()**: Returns the index within this string of the first occurrence of the specified substring.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    int index = sb.indexOf("World");
    System.out.println(index); // Outputs 6
    ```

15. **lastIndexOf()**: Returns the index within this string of the last occurrence of the specified substring.

    ```java
    StringBuilder sb = new StringBuilder("Hello World World");
    int index = sb.lastIndexOf("World");
    System.out.println(index); // Outputs 12
    ```

16. **length()**: Returns the length (character count).

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    int length = sb.length();
    System.out.println(length); // Outputs 5
    ```

17. **setCharAt()**: Sets the character at the specified position.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.setCharAt(1, 'a');
    System.out.println(sb.toString()); // Outputs "Hallo"
    ```

18. **setLength()**: Sets the length of the character sequence.

    ```java
    StringBuilder sb = new StringBuilder("Hello");
    sb.setLength(2);
    System.out.println(sb.toString()); // Outputs "He"
    ```

19. **substring()**: Returns a new string that is a substring of this sequence.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    String sub = sb.substring(6);
    System.out.println(sub); // Outputs "World"
    ```

20. **toString()**: Converts to a string representing the data in this sequence.

    ```java
    StringBuilder sb = new StringBuilder("Hello World");
    String str = sb.toString();
    System.out.println(str); // Outputs "Hello World"
    ```

## StringBuffer

### Methods and Examples

1. **append()**: Adds the specified string to the end.

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    sb.append(" World");
    System.out.println(sb.toString()); // Outputs "Hello World"
    ```

2. **insert()**: Inserts the specified string at the specified position.

    ```java
    StringBuffer sb = new StringBuffer("Hello World");
    sb.insert(6, "Java ");
    System.out.println(sb.toString()); // Outputs "Hello Java World"
    ```

3. **replace()**: Replaces the characters in a substring with another string.

    ```java
    StringBuffer sb = new StringBuffer("Hello World");
    sb.replace(0, 5, "Hi");
    System.out.println(sb.toString()); // Outputs "Hi World"
    ```

4. **delete()**: Removes the characters in a substring.

    ```java
    StringBuffer sb = new StringBuffer("Hello World");
    sb.delete(5, 11);
    System.out.println(sb.toString()); // Outputs "Hello"
    ```

5. **deleteCharAt()**: Removes the character at the specified position.

    ```java
    StringBuffer sb = new StringBuffer("Hello World");
    sb.deleteCharAt(5);
    System.out.println(sb.toString()); // Outputs "HelloWorld"
    ```

6. **reverse()**: Reverses the sequence of characters.

    ```java
    StringBuffer sb = new StringBuffer("Hello World");
    sb.reverse();
    System.out.println(sb.toString()); // Outputs "dlroW olleH"
    ```

7. **capacity()**: Returns the current capacity.

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    System.out.println(sb.capacity()); // Outputs the capacity (default is 16 + length of the string)
    ```

8. **charAt()**: Returns the character at the specified index.

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    char ch = sb.charAt(1);
    System.out.println(ch); // Outputs "e"
    ```

9. **codePointAt()**: Returns the Unicode code point at the specified index.

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    int codePoint = sb.codePointAt(1);
    System.out.println(codePoint); // Outputs the Unicode code point of 'e'
    ```

10. **codePointBefore()**: Returns the Unicode code point before the specified index.

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    int codePoint = sb.codePointBefore(1);
    System.out.println(codePoint); // Outputs the Unicode code point before 'e'
    ```

11. **codePointCount()**: Returns the number of Unicode code points in the specified text range.

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    int count = sb.codePointCount(0, 5);
    System.out.println(count); // Outputs the number of Unicode code points in "Hello"
    ```

12. **ensureCapacity()**: Ensures that the capacity is at least equal to the specified minimum.

    ```java
    StringBuffer sb = new StringBuffer();
    sb.ensureCapacity(50);
    System.out.println(sb.capacity()); // Outputs at least 50
    ```

13. **getChars()**: Copies characters from this sequence into the destination character array.

    ```java
    StringBuffer sb = new StringBuffer("Hello World");
    char[] dst = new char[5];
    sb.getChars(0, 5, dst, 0);
    System.out.println(dst); // Outputs "Hello"
    ```

14. **indexOf()**: Returns the index within this string of the first occurrence of the specified substring.

    ```java
    StringBuffer sb = new StringBuffer("Hello World");
    int index = sb.indexOf("World");
    System.out.println(index); // Outputs 6
    ```

15. **lastIndexOf()**: Returns the index within this string of the last occurrence of the specified substring.

    ```java
    StringBuffer sb = new StringBuffer("Hello World World");
    int index = sb.lastIndexOf("World");
    System.out.println(index); // Outputs 12
    ```

16. **length()**: Returns the length (character count).

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    int length = sb.length();
    System.out.println(length); // Outputs 5
    ```

17. **setCharAt()**: Sets the character at the specified position.

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    sb.setCharAt(1, 'a');
    System.out.println(sb.toString()); // Outputs "Hallo"
    ```

18. **setLength()**: Sets the length of the character sequence.

    ```java
    StringBuffer sb = new StringBuffer("Hello");
    sb.setLength(2);
    System.out.println(sb.toString()); // Outputs "He"
    ```

19. **substring()**: Returns a new string that is a substring of this sequence.

    ```java
    StringBuffer sb = new StringBuffer("Hello World");
    String sub = sb.substring(6);
    System.out.println(sub); // Outputs "World"
    ```

20. **toString()**: Converts to a string representing the data in this sequence.

    ```java
    StringBuffer sb = new StringBuffer("Hello World");
    String str = sb.toString();
    System.out.println(str); // Outputs "Hello World"
    ```

## Real-Life Use Case Example

### Logging System using StringBuilder (Single-threaded)

In a single-threaded logging system, using `StringBuilder` to concatenate log messages can improve performance.

```java
public class Logger {
    private StringBuilder log = new StringBuilder();

    public void log(String message) {
        log.append(message).append("\n");
    }

    public String getLog() {
        return log.toString();
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log("Starting application...");
        logger.log("Performing task...");
        logger.log("Task completed.");
        System.out.println(logger.getLog());
    }
}
```

### Shared Buffer using StringBuffer (Multi-threaded)

In a multi-threaded environment, using `StringBuffer` to handle shared data ensures thread safety.

```java
public class SharedBuffer {
    private StringBuffer buffer = new StringBuffer();

    public synchronized void append(String text) {
        buffer.append(text);
    }

    public synchronized String getBuffer() {
        return buffer.toString();
    }

    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sharedBuffer.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sharedBuffer.append("B");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(sharedBuffer.getBuffer());
    }
}
```

In the above example, the `SharedBuffer` class uses `StringBuffer` to ensure that multiple threads can safely append text to the buffer without causing data corruption.
