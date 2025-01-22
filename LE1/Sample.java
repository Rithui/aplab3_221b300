class Mother {
    static void show() {
        System.out.println("Static show() in Mother: Hello World");
    }
}

class Child extends Mother {
    static void show() { // Static method in Child
        System.out.println("Static show() in Child: Hello JUET");
    }
}

public class Sample {
    public static void main(String[] args) {
        Mother m1 = new Child(); // Parent reference, Child object
        m1.show(); // Calls the static method in Mother

        Child ch = new Child(); // Child reference
        ch.show(); // Calls the static method in Child
    }
}


