class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor (without using 'this')
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }


     public static void main(String[] args) {
        // Original object
        Person p1 = new Person("Ramu", 20);

        // Copy object
        Person p2 = new Person(p1);

        // Display both objects
        System.out.println("Original Person:");
        p1.display();

        System.out.println("Copied Person:");
        p2.display();
    }
}