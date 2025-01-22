// Class Mother
class Mother {
    int x = 10; // Member variable
    
    // Method to show the value of x
    void show() {
        System.out.println("This is the show method of Mother class. Value of x: " + x);
    }
}

// Class Child that extends Mother
class Child extends Mother {
    // Empty body, inherits all properties and methods from Mother
}

// Class Application to test the inheritance
public class Application {
    public static void main(String[] args) {
        // Creating an object of Mother
        Mother m = new Mother();
        m.show(); // Calls the show method of Mother

        // Creating an object of Child
        Child ch = new Child();
        ch.show(); // Calls the inherited show method from Mother
    }
}
