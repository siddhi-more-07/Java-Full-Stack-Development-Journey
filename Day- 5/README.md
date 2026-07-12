# Day 5 – Methods in Java

# Topics Covered
    • Understanding methods
    • Method parameters and return values
    • Method overloading
    • Method overriding
    • Practice programs

# Methods in Java
    A method is a block of code that performs a specific task.
    Instead of writing the same code repeatedly, we create methods and call them whenever required. Methods improve code reusability and readability.

    • Method Syntax: 
        accessModifier static returnType methodName(parameters) {
            // method body
        }


Method              Components
--------------------------------------------
Component	        Meaning
public	            Access modifier
static	            Allows calling without creating an object
int	                Return type
add	                Method name
int a, int b	    Parameters
return	            Returns a value


# Types of Methods

1. Predefined Methods (Built-in)
    • Methods already provided by Java libraries.
    • Example: Math.sqrt(), String.length()

2. User-defined Methods
    • Methods created by programmers according to requirements.

# Method Overloading
    • Multiple methods with the same name but different parameters.
    • Achieves compile-time polymorphism.

# Method Overriding
    • A subclass provides a new implementation of a method already defined in the parent class.
    • Same method name and same parameters.
    • Achieves runtime polymorphism.


# Practice Programs
    1) Method to check whether a number is even or odd
    2) Method to calculate factorial
    3) Method to find the largest element in an array
    4) Overloaded methods for area calculation
    5) Overriding methods for animal sounds