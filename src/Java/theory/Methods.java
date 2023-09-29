package Java.theory;

public class Methods {



        /**
         In Java, methods are blocks of code that perform a specific task or set of tasks. Methods are essential for organizing and structuring code, promoting reusability, and making programs more modular. Here's an overview of how to declare, define, and use methods in Java:

         Method Declaration:
         A method declaration in Java consists of several parts:

         Access Modifier: Specifies the visibility or accessibility of the method. Common access modifiers include public, private, protected, and package-private (default).

         Return Type: Specifies the data type of the value that the method returns. If the method doesn't return a value, use the void keyword.

         Method Name: The name of the method, which should follow Java naming conventions.

         Parameters: A list of input parameters enclosed in parentheses. Each parameter consists of a data type and a parameter name.


         */

        //Method Definition:
        /**
        In this example:

        public is the access modifier.
        int is the return type (the method returns an integer).
        add is the method name.
        (int a , int b) are the method parameters.
        */
        public int add(int a, int b) {
            int sum = a + b;
            return sum;
        }

    //Method Invocation:
    int result = add(5, 3); // Invoking the add method with arguments 5 and 3
    /**
    Method Overloading:
    Java allows you to define multiple methods with the same name in a class, as long as they have different parameter lists.
    This is known as method overloading. Java determines which method to call based on the number and types of arguments passed.
     */
    public int addMore(int a, int b) {
        return a + b;
    }

    public double addMore(double a, double b) {
        return a + b;
    }
    /**Static Methods:

    Static methods belong to the class rather than an instance of the class. You can call them using the class name,
     and they can't access instance-specific variables.
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
    //To call a static method, use the class name:
    int product = Methods.multiply(5, 3); // Calling a static method through the class name

    /**
     Method overriding is a concept in object-oriented programming that allows a subclass to provide a specific implementation for a method that is already defined in its superclass. When a subclass overrides a method, it provides its own version of that method with the same name and parameters as the superclass method. Method overriding is used to achieve polymorphism, where different objects can respond to the same method call in a way that is specific to their individual classes.

     Here's how method overriding works in Java:

     Inheritance: Method overriding is possible because of the inheritance relationship between classes. You have a superclass (parent class) and a subclass (child class), and the subclass inherits methods from the superclass.

     Method Signature: To override a method, the subclass must provide a method with the same method signature (name, return type, and parameter list) as the method in the superclass.

     @Override Annotation: It's a good practice to use the @Override annotation before the overridden method in the subclass. This annotation tells the compiler that you intend to override a method from the superclass, and it helps catch errors if you make a mistake in the method signature.

     Here's an example demonstrating method overriding in Java:
     */
/*
    class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal1 = new Dog();
            Animal animal2 = new Cat();

            animal1.makeSound(); // Output: Dog barks
            animal2.makeSound(); // Output: Cat meows
        }
    }

 */

}
