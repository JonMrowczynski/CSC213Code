"""
Author: Jon Mrowczynski
Python Version: 3.13.7
"""

def print_welcome_msg() -> None:  # While not required, can use type hinting to help future (or current) developers!
    """
    Simply prints the introductory message to the program. This is a bit too small to potentially include in its own
    function, but it's here to illustrate a point.

    :returns: None
    """
    print('Enter integers one at a time and I will sum them! :D!')
    print("Or, enter 'q' at any time to quit.")


if __name__ == '__main__':  # The commandline arguments are implicitly imported into a Python script
    print_welcome_msg()
    total, user_input = 0, ""  # Python uses dynamic typing so don't need to explicitly declare variable types!

    while user_input != 'q':  # Loop as long as this condition is met.
        user_input = input('Input: ')  # Ask for input.
        
        # If there is an issue processing the input, then handle that issue.
        try:
            total += int(user_input)  # Don't need to explicitly make an Object for user input!
        except ValueError:  # Don't need to explicitly declare a name for the Error Object.
            if user_input != 'q':
                print("Please enter in only integers or 'q', thanks! :)")

    # Don't need to explicitly close the input resource.
    print(f'Final sum = {total}')
