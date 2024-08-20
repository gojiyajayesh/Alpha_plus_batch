public class ClassObjects {
    public static void main(String[] args) {
        Animals a1 = new ClassObjects().new Animals(); // Create Object's Of Animals Class
        a1.setDetail("Dog", "Black", 23);
        System.out.println(a1.getAge());
        System.out.println(a1.getName());
        System.out.println(a1.getColor());
    }

    private class Animals { // Class is a Blue Print of Object's and Propertis and Method define in a class
        String color;
        String name;
        int age;

        void setDetail(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        int getAge() {
            return this.age;
        }

        String getName() {
            return this.name;
        }

        String getColor() {
            return this.color;
        }
    }
}