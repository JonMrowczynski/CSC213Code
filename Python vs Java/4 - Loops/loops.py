"""
Author: Jon Mrowczynski
Python Version: 3.13.7
"""

condition = True
while (condition):  # Basically just executes code until condition becomes False.
    print('Execute stuff here util condition is False.')
    condition = False
print()

# All for loops in Python are for-each loop. These can only iterate over the iterable and can't change their values.
myList = [1, 2, 3]
for item in myList:
    print(item)
    item = -1  # This doesn't change any of the item values because in for-each loop.
print(myList)
print()

# But they can mimic the style of indexed for loops
for i in range(3): # Run something 3 times.
    print(i)
# Even though, "i" was defined in the for loop, oddly, it is still accessible outside of it!
print(i) # This is a bit unusual and ignores similar variable scopes that other languages implement.
print()

# These can be used to alter the values of the iterable!
for i in range(len(myList)):
    if (myList[i] == 2):
        myList[i] = -1  # This changes the character at the corresponding index! But only if it equals 'd'.
print(myList)
print() 

# "else" after a loop is supported. The code in the "else" only gets executed if the loop exits normally (no break was encountered).
condition = True
while (condition):
    print('Execute stuff here until condition is False.')
    condition = False
else:
    print('Only execute this if the loop exited normally.')
print()

for i in range(3):
    print(i)
    break
else:
    print("This shouldn't be executed because of the break.")
print()

# Can "continue" if you want to stop executing just an iteration of the loop. This can be used in a while loop as well,
# but only a for loop is shown.
for i in range(3):
    if i == 1:  # Basically, skip the printing if i == 1!.
        continue 
    print(i)