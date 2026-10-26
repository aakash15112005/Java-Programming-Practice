package Exception_handling;

class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class ExceptionFinal {

    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks entered");
        }

        System.out.println("Valid marks: " + marks);
    }

    public static void main(String[] args) {

        String input = "abc";

        try {
            int marks = Integer.parseInt(input);
            checkMarks(marks);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Result checking completed");
        }
    }
}