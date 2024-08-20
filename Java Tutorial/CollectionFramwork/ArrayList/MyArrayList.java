
public class MyArrayList {
    static class ArrayList<E> {
        Object[] value = null;
        int initialCapacity = 10;
        int pointer = -1;
        int size = 0;

        ArrayList() {
            this.value = new Object[initialCapacity];
        }

        ArrayList(int size) {
            this.value = new Object[size];
        }

        public int size() {
            return size;
        }

        public void refector() {
            Object[] temp = new Object[value.length];
            int i = 0;
            for (Object obj : value) {
                temp[i++] = obj;
            }
            value = new Object[initialCapacity * 2];
            initialCapacity *= 2;
            pointer = -1;
            for (Object obj : temp) {
                value[++pointer] = obj;
            }
        }

        public boolean add(E element) {
            if (pointer >= initialCapacity) {
                refector();
            }
            value[++pointer] = element;
            size++;
            return true;
        }

        public void remove(Object obj) {
            for (int i = 0; i <= pointer; i++) {
                if (value[i].equals(obj)) {
                    int x = i;
                    while ((x + 1) <= pointer) {
                        value[x] = value[x + 1];
                        x++;
                    }
                    pointer--;
                    size--;
                    break;
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i <= pointer; i++) {
                sb.append(String.valueOf(value[i])).append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append("]");
            return sb.toString();
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jayesh");
        list.add("Mahesh");
        list.add("Manju");
        list.add("bhikhu");
        System.out.println(list);

        list.remove("Jayesh");

        System.out.println(list);
    }
}