// Demonstrating Constructors with a Person Class
class Person {
    String name;
    int age;

    // 1. Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default Constructor Called: Name = " + name + ", Age = " + age);
    }

    // 2. Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called: Name = " + name + ", Age = " + age);
    }

    // 3. Copy Constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
        System.out.println("Copy Constructor Called: Name = " + name + ", Age = " + age);
    }

    // Method to display person details
    public void display() {
        System.out.println("Person Details: Name = " + name + ", Age = " + age);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        Person person1 = new Person();
        person1.display();

        // Using Parameterized Constructor
        Person person2 = new Person("Alice", 25);
        person2.display();

        // Using Copy Constructor
        Person person3 = new Person(person2);
        person3.display();
    }
}
