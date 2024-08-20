public class Constructor {
    public static void main(String[] args) {
        int arr[] = { 1 };
        Account a1 = new Account();// Default Constructor Called
        a1.password = 123;
        Account a2 = new Account("jayesh", 12345, arr); // parameterized Constructor Called
        Account a3 = new Account(a2); // Sellow Copy Constructor
        System.out.println(a3.balanse[0]);
        a2.balanse[0] = 12;
        System.out.println(a2.balanse[0]);
        System.out.println(a3.balanse[0]); // Change a2 balance but this output is also 12 so it store the locatin of
                                           // arr reference
        Account a4 = new Account(a2); // Deep Copy Copy Constructor
        System.out.println(a3.balanse[0]);
        a2.balanse[0] = 12;
        System.out.println(a2.balanse[0]);
        System.out.println(a4.balanse[0]); // Change a2 balance no Reflecte in a4
    }
}

class Account {
    String username;
    int password;
    int balanse[];

    // Default Constructor
    Account() {
        System.out.println("Constructor is called...");
    }

    // Parameterized Constructor
    Account(String name, int pwd, int[] balanse) {
        System.out.println("Parameterized Constructor is called...");
        username = name;
        password = pwd;
        this.balanse = new int[1];
        this.balanse[0] = balanse[0];
    }

    /**
     * Shallow Copy Constructor Plaese folowing code is uncomment if use shellow
     * copy Constructor is used
     */

    // Account(Account a)
    // {
    // System.out.println("Copy Constructor Called...");
    // this.username=a.username;
    // this.password=a.password;
    // this.balanse=a.balanse;
    // }
    Account(Account a) // Deep Copy Constructor
    {
        System.out.println("Copy Constructor Called...");
        this.username = a.username;
        this.password = a.password;
        balanse = new int[1];
        this.balanse[0] = a.balanse[0];
    }
}