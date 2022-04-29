package input;

import java.util.Scanner;

public class UserInput {
    private int userInput;
    private final Scanner scanner;
    private final int maximumNumberOfQuestions;
    private final int minimumNumberOfQuestions;

    public UserInput(int maximumNumberOfQuestions) {
        this.userInput = 0;
        this.minimumNumberOfQuestions = 1;
        this.scanner = new Scanner(System.in);
        this.maximumNumberOfQuestions = maximumNumberOfQuestions;
    }

    // User input is reduced by one for the correctness of the array index
    public int getUserInput() {
        return --userInput;
    }

    public boolean isCorrectInput() {
        this.userInput = -1;
        if (scanner.hasNextInt()) {
            this.userInput = scanner.nextInt();
            return this.userInput >= minimumNumberOfQuestions && this.userInput <= maximumNumberOfQuestions;
        }
        return badInsert();
    }

    private boolean badInsert() {
        System.out.printf("The value must be a number " +
                "in the range from %d to %d! Try again!)\n", minimumNumberOfQuestions, maximumNumberOfQuestions);
        scanner.next();
        return false;
    }
}
