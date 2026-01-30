"""
Author: Jon Mrowczynski
Python Version: 3.13.7
"""

# Boolean values are "True" or "False".

i_am_true = True
i_am_false = False
i_am_also_true = True

# if-elif-else branching is supported, although Python shortens "if else" to "elif".
# Also, indentation is used to associated code.

if i_am_true:
    print('This executed because the if condition was True.')
elif i_am_also_true:
    print('Even though the elif condition is also True, since the if condition was True, this will not execute.')
else:
    print('This would only execute if all other conditions were False.')

# Can use conditional expressions commonly used for assignments.
i_am_dependent = 1 if i_am_true else 0
print(i_am_dependent)

# Python does have a "switch" style mechanism (introduced in 3.10), but it doesn't seem to be widely used yet...
# However, it can help to improve the readability by cleaning up more complex if-elif-else logic branching.
pattern = "Set me to something"
match pattern:
    case 'a':
        print('Do something here if "pattern" is "a".')
    case 3:
        print('Do something here if "pattern" is 3.')
    case _:
        print('This is the catch all case that runs if "pattern" doesn\'t match any of the other cases.')

print()
# Logical operators include "and", "or", and "not".
print('False and False:', False and False)  # The expression on the right is dead code due to short-circuiting.
print('False and True:', False and True)  # The expression on the right is dead code due to short-circuiting.
print('True and False:', True and False)
print('True and True:', True and True)
print() 

print('False or False:', False or False)
print('False or True:', False or True)
print('True or False:', True or False)  # The expression on the right is dead code due to short-circuiting.
print('True or True:', True or True)  # The expression on the right is dead code due to short-circuiting.
print()

print('not False:', not False)
print('not True:', not False)
