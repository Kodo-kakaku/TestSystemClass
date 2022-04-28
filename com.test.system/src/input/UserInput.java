package input;

import java.util.Scanner;

public class UserInput {
    private int userInput;
    private final Scanner scanner;
    private final int maximumNumberOfQuestions;
    private final int minimumNumberOfQuestions;

    public UserInput(int maximumNumberOfQuestions) {
        this.scanner = new Scanner(System.in);
        this.maximumNumberOfQuestions = maximumNumberOfQuestions;
        this.minimumNumberOfQuestions = 1;
    }

    private void badInsert() {
        System.out.printf("The value must be a number " +
                "in the range from %d to %d! Try again!)\n", minimumNumberOfQuestions, maximumNumberOfQuestions);
        scanner.next();
    }

    public int getUserInput() {
        return userInput;
    }

    public boolean isCorrectInput() {
        this.userInput = 0;
        if (scanner.hasNextInt()) {
            this.userInput = scanner.nextInt();
        }
        if (this.userInput >= minimumNumberOfQuestions && this.userInput <= maximumNumberOfQuestions) {
            return true;
        }
        badInsert();
        return false;
    }
}
