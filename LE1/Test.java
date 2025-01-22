class One {
    // Parameterized constructor
    One(int x) {
        System.out.println("Constructor of One is called with x = " + x);
    }
}
class Two extends One {
    // Explicit constructor for Two
    Two(int x) {
        super(x); // Call the parameterized constructor of One
        System.out.println("Constructor of Two is called with x = " + x);
    }
}


public class Test {
    public static void main(String[] args) {
        // Creating an object of Two
        Two obj = new Two(10); // Passes 10 to the parent constructor
    }
}

