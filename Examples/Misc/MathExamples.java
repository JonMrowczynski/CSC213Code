/**
 * @author Justin Del Vecchio
 * @author Jon Mrowczynski
 */
void main(){
    printFloatingPointNumericErrorExample();
    printFloatDivisionByZeroExamples();
    printFloatZeroDividedByZero();
    printIntDivisionByZero();
}

void printFloatingPointNumericErrorExample(){
    IO.println(2.0-1.7);
    IO.println();
}

void printFloatDivisionByZeroExamples(){
    IO.println(10.0 / 0.0); // Positive Infinity
    IO.println(-10.0 / 0.0); // Negative Infinity
    IO.println();
}

void printFloatZeroDividedByZero(){
    IO.println(0.0 / 0.0); // Not a Number or NaN
    IO.println();
}

void printIntDivisionByZero(){
    IO.println(10 / 0); // Should be positive infinity, but causes an exception!
    IO.println();
}