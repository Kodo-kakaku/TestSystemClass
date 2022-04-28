package interrogation;

import test.Question;
import java.util.Arrays;

public class ReviewTesting {
    private final Question[] questions;
    private int totalCorrectAnswers = 0;

    public ReviewTesting(Question... questions) {
        this.questions = Arrays.copyOf(questions, questions.length);
    }

    public void nextQuestion(int numberOfQuestion) {
        System.out.println(questions[numberOfQuestion].getQuestion());
        String[] options = questions[numberOfQuestion].getOptions();
        for(int i = 0; i < options.length; i++){
            System.out.printf("%d.%s\n", i + 1, options[i]);
        }
    }

    public void checkAnswer(int userAnswer, int numberOfQuestion) {
        if (this.questions[numberOfQuestion].isCorrectAnswer(--userAnswer)) {
            this.totalCorrectAnswers++;
        }
    }

    public String getResult() {
        return String.format("Result: right %d, not right %d",
                totalCorrectAnswers, questions.length - totalCorrectAnswers);
    }

    public int quantityOfAnswers() {
        return questions[0].getOptions().length;
    }

    public int quantityOfQuestion() {
        return questions.length;
    }
}
