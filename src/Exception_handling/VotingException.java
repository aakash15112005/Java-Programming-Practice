package Exception_handling;

class VotingException1 extends Exception {
    VotingException1(String message) {
        super(message);
    }
}

public class VotingException {

    static void checkAge(int age) throws VotingException1 {
        if (age < 18) {
            throw new VotingException1("Not eligible for voting...");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        }
        catch (VotingException1 e) {
            System.out.println(e.getMessage());
        }
    }
}