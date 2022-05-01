import input.UserInput;
import interrogation.ConductingSurvey;
import survey.QuestionnaireWithAnswers;

public class Main {
    public static void main(String[] args) {

        QuestionnaireWithAnswers firstQuestion = new QuestionnaireWithAnswers(
                "C++ is an object oriented language, and C, BASIC, and Pascal are _____ languages",
                "procedural",
                "procedural", "scripting", "general purpose", "web based"
        );

        QuestionnaireWithAnswers secondQuestion = new QuestionnaireWithAnswers(
                "In C++, a pointer is",
                "variable for storing addresses",
                "address of a variable", "variable for storing addresses",
                "data type of an address variable", "constant value"
        );

        QuestionnaireWithAnswers thirdQuestion = new QuestionnaireWithAnswers(
                "\"Google Language Translator\" is an example of the application of",
                "machine learning",
                "internet", "debugging", "computer simulations", "machine learning"
        );

        ConductingSurvey survey = new ConductingSurvey(firstQuestion, secondQuestion, thirdQuestion);
        UserInput input = new UserInput(survey.quantityOfAnswers());

        System.out.println("Hi! Take an excellent computer science test:");
        for(int i = 0; i < survey.quantityOfQuestion(); i++) {
            survey.nextQuestion(i);
            while (true) {
                if (input.isCorrectInput()) {
                    survey.checkAnswer(input.getUserInput(), i);
                    break;
                }
            }
        }
        System.out.println(survey.getResult());
    }
}