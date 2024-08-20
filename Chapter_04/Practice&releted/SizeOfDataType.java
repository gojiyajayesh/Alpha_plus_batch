import java.lang.reflect.Field;
public class SizeOfDataType {
    public static void main(String[] args) {
        try {
            // Get the field named "SIZE" from the data type class
            Field field = boolean.class.getField("SIZE");
            
            // Get the value of the field, which represents the size
            int size = (int) field.get(null);
            
            // Print the size of the data type
            System.out.println("Size of boolean: " + size + " bits");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
