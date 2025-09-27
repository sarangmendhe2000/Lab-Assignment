
const Factorial = (n) => {
    // Base cases for 0! and 1!
    if (n === 0 || n === 1) {
        return 1;
    }

    // Handles negative or non-integer input
    if (n < 0 || !Number.isInteger(n)) {
        return "Invalid Input";
    }

    // Recursive calculation
    return n * Factorial(n - 1);
};

export default Factorial;