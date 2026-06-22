import java.util.Arrays;

/**
 * Contains some examples using functions and explaining how they work in various contexts.
 * 
 * @author Jon Mrowczynski
 */
void main() {
    // A function call doesn't require an object, for it to be called, just what is passed into it. It can be called
    // directly from the calls!
    final var result = Math.log10(10);
    doesNotReturnAnything();
    passByValuePrimitiveExample();
    parameterVariabilityExample(result, result);
    
    IO.println();

    passByValueObjectReferenceExample();
}

/**
 * When a function doesn't return any value, its return type is void.
 * 
 * You can still call return, though! This will exit the function just like any other return statement, but no value can be returned.
 * 
 * This function also doesn't have any parameters, which is fine! 
 * 
 * You can give a function as many parameters as you want, but you should try to keep it to 7 or less.
 */
void doesNotReturnAnything(/* No parameters*/) {
    // Do something here.
    return; // Can still return! Just can't return a value.
}

/**
 * Java is pass-by-value, where all primitive values and object references are copied when passed to a method. Therefore any
 * updates to those values JUST update the COPY of the values/references.
 */
void passByValuePrimitiveExample() {
    var myDouble = 3.14;
    IO.println("Starting value of myDouble in passByValueExample: " + myDouble);
    add2Wrong(myDouble);
    IO.println("Ending value of myDouble after calling add2Wrong: " + myDouble);
    IO.println();
    IO.println("Starting value of myDouble: " + myDouble);
    myDouble = add2Correct(myDouble); 
    IO.println("Ending value of myDouble after calling add2Correct: " + myDouble);
}

/**
 * While we CAN change the value of a variable within a function (as long as the parameter isn't declared final) that change
 * won't be reflected in the original value that was passed in.
 * 
 * @param myDouble used for demo purposes. This will not be updated.
 */
void add2Wrong(double myDouble) {
    myDouble += 2;
    IO.println("myDouble inside add2Wrong: " + myDouble);
}

/**
 * Declaring a function's parameter as final prevents it from being able to be changed within the function! While
 * {@code myVariableDouble} may not be changed in the function, using final prevents the possibility of
 * {@code myConstantDouble} from ever being changed within the function.
 * 
 * @param myDouble used for demo purposes. 
 */
void parameterVariabilityExample(final double myConstantDouble, double myVariableDouble) {
    myVariableDouble += 2; // No problem!
    // myConstantDouble += 2; // This would cause a compilation issue! Cannot update final parameter.
}

/**
 * If you want to update a value that is passed-in, you must return the modified value and then assign it to the original
 * variable. Since we are returning something, we have to declare the datatype of the thing we are returning.
 * 
 * @param myDouble used for demo purposes. While not updated in this function, it can update the original value if the
 *                 returned quantity gets assigned to it.
 * @return the updated {@code double} value.
 */
double add2Correct(double myDouble) { return myDouble + 2; }

void passByValueObjectReferenceExample() {
    int[] ints = {1, 2, 3};
    IO.println("ints before add2Wrong: " + Arrays.toString(ints));
    add2Wrong(ints);
    IO.println("ints after add2Wrong: " + Arrays.toString(ints));
    IO.println();
    IO.println("ints before add2Correct: " + Arrays.toString(ints));
    add2Correct(ints);
    IO.println("ints after add2Correct: " + Arrays.toString(ints));
}

/**
 * Here goes some useful information about how to use this function.
 * 
 * @param arr the array that is used as a template to generate a new array.
 * @return the newly generated array.
 */
int[] add2Wrong(int[] arr) {
    var newArr = new int[arr.length];
    for(var i = 0; i < arr.length; ++i) { newArr[i] = arr[i] + 2; }
    arr = newArr;
    IO.println("ints inside add2Wrong: " + Arrays.toString(arr));
    return newArr;
}

/**
 * Java is also pass-by-value for object references! The reference to the object is the thing that is copied, not the entire
 * object. Therefore, if you have a reference to the object, then you can modify the data contained in the object.
 * 
 * @param ints the {@code int} array that will be modified.
 */
void add2Correct(final int[] ints) {
    for (var i = 0; i < ints.length; ++i) { ints[i] += 2; }
}