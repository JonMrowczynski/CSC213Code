"""
Author: Jon Mrowczynski
Python Version: 3.13.7
"""

from typing import Final  # Need to import this if want to implement "constants". Although they aren't really constants...

x = "Hello"  # No explicit type declaration required, just assignment and Python figures out the datatype!

print(type(x))  # x is first a str.

x = 'Hello again!'  # Can use either double or single quotes for a str in Python.

print(type(x))  # x is still a str!

x = 3  # And...you can change the type of x just by assigning it a different type! 
# While this is very convenient, it is bad practice to change the type of a variable like this!

print(type(x))  # x is an int, and there are no (programmatic) problems changing this because Python implements dynamic typing!

# Some built-in data types in Python include, but are not limited to:
# int -> arbitrary precision integer.
# float -> double precision floating point number.
# str -> a string of characters.
# bool -> boolean value (True or False).
# list -> an ordered collection of items.
# tuple -> an immutable ordered collection of items.
# set -> An unordered collection of unique items.
# dict -> a collection of key-value pairs.
# None -> represents the absence of an Object.

# Fittingly, snake_case is the naming convention used for variables/methods in Python
my_snake_cased_variable = 3.14

my_truncated_snake_cased_variable = int(3.14)  # Can be casted using a function call.
print(my_truncated_snake_cased_variable)
print()

# Sometimes variables are implicitly casted!
print(3 * 4.0) # Here the 3 gets implicitly casted to a floating-point value.
print()

# Python's support for constants is a bit weird! Could use type hinting, but that doesn't really make a constant...
MY_CONSTANT: Final = 7
print(MY_CONSTANT)
print() 

# There are ways to implement actual constants in Python, but it is a bit round-about.

# We are technically just implementing what is called "type annotation" or "type hinting", which helps static analyzers, but they
# not guaranteed to actually enforce these types during runtime.
MY_CONSTANT = 8  # No complaints! Because we just type hinted that it should be constant.
print(MY_CONSTANT)

