import input.UserInput;
import interrogation.ReviewTesting;
import test.Question;

public class Main {
    public static void main(String[] args) {
        Question firstQuestion = new Question(
                "C++ is an object oriented language, and C, BASIC, and Pascal are _____ languages",
                "procedural",
                "procedural", "scripting", "general purpose", "web based"
        );

        Question secondQuestion = new Question(
                "In C++, a pointer is",
                "variable for storing addresses",
                "address of a variable", "variable for storing addresses",
                "data type of an address variable", "constant value"
        );

        Question thirdQuestion = new Question(
                "\"Google Language Translator\" is an example of the application of",
                "machine learning",
                "internet", "debugging", "computer simulations", "machine learning"
        );

        ReviewTesting testing = new ReviewTesting(firstQuestion, secondQuestion, thirdQuestion);
        System.out.println("Hi! Take an excellent computer science test:");
        System.out.println(testing.quantityOfAnswers());
        UserInput input = new UserInput(testing.quantityOfAnswers());
        for(int i = 0; i < testing.quantityOfQuestion(); i++) {
            testing.nextQuestion(i);
            while (true) {
                if (input.isCorrectInput()) {
                    testing.checkAnswer(input.getUserInput(), i);
                    break;
                }
            }
        }
        System.out.println(testing.getResult());
    }
}