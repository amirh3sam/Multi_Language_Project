"""


In Python, an object is a fundamental concept in object-oriented programming (OOP). Everything in Python is an object,
 which means that every value, variable, function, and data structure in Python is represented as an object. Objects
 are instances of classes, and classes define the blueprint or template for creating objects.
"""


# Object Creation: To create an object, you instantiate a class. This involves calling the class as if it were a
# function to create a new instance of that class. For example:
class MyClass:
    pass


obj = MyClass()  # Creating an instance (object) of MyClass


# Attributes and Methods: Objects have attributes (variables) and methods (functions) associated with them.
# These attributes and methods are defined in the class from which the object was created.

class Person:
    def __init__(self, name):
        self.name = name

    def greet(self):
        return f"Hello, my name is {self.name}"


person = Person("Alice")
print(person.greet())  # Output: Hello, my name is Alice

# Identity: Each object in Python has a unique identity, which can be obtained using the id() function. Two objects
# with the same values will have different identities unless they are the same object.
a = [1, 2, 3]
b = [1, 2, 3]

print(id(a))  # Identity of list 'a'
print(id(b))  # Identity of list 'b'

# The identities are different, even though the lists have the same values
# Data Types as Objects:
# In Python, even basic data types like integers, floats, and strings are implemented as objects.
# For example, you can call methods on integers and strings:
num = 42
num_str = str(num)  # Converting an integer to a string
print(num_str)  # Output: "42"

text = "Hello, World!"
text_upper = text.upper()  # Converting a string to uppercase
print(text_upper)  # Output: "HELLO, WORLD!"
"""
Inheritance and Polymorphism: Python supports inheritance, allowing you to create new classes based on existing ones. 
Objects of subclasses inherit the attributes and methods of their parent classes. Polymorphism enables objects of 
different classes to be treated as objects of a common base class, allowing dynamic method dispatch."""
class Animal:
    def speak(self):
        pass

class Dog(Animal):
    def speak(self):
        return "Woof!"

class Cat(Animal):
    def speak(self):
        return "Meow!"

def animal_sound(animal):
    return animal.speak()

dog = Dog()
cat = Cat()

print(animal_sound(dog))  # Output: "Woof!"
print(animal_sound(cat))  # Output: "Meow!"

"""
In Python, the object-oriented paradigm is central to the language's design, making it easy to work with objects and 
classes, as well as to implement object-oriented design principles like encapsulation, inheritance, and polymorphism."""

