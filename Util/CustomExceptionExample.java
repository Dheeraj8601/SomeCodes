// class MyCustomException extends Exception {
//     public MyCustomException() {
//         super("This is a custom exception.");
//     }
// }

// public class CustomExceptionExample {
//     public static void main(String[] args) {
//         try {
//             // Simulate a situation that triggers your custom exception
//             int result = divide(10, 0);
//             System.out.println("Result: " + result);
//         } finally {
//             System.err.println("Finally block executed.");
//         }
//     }

//     // Define a method that can throw your custom exception
//     public static int divide(int dividend, int divisor) throws MyCustomException {
//         if (divisor == 0) {
//             throw new MyCustomException();
//         }
//         return dividend / divisor;
//     }
// }

// Define a custom exception by extending Exception class
class MyCustomException extends Exception {
    public MyCustomException() {
        super("This is a custom exception.");
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulate a situation that triggers your custom exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }catch (MyCustomException e) {
            System.err.println("Caught MyCustomException: " + e.getMessage());
        }
    }

    // Define a method that can throw your custom exception
    public static int divide(int dividend, int divisor) throws MyCustomException {
        if (divisor == 0) {
            throw new MyCustomException();
        }
        return dividend / divisor;
    }
}

// Define a custom exception by extending Exception class

