package interrogation;

import survey.QuestionnaireWithAnswers;

import java.util.Arrays;

public class ConductingSurvey {
    private int totalCorrectAnswers;
    private final QuestionnaireWithAnswers[] survey;

    public ConductingSurvey(QuestionnaireWithAnswers... questions) {
        this.totalCorrectAnswers = 0;
        this.survey = Arrays.copyOf(questions, questions.length);
    }

    public void nextQuestion(int numberOfQuestion) {
        System.out.println(survey[numberOfQuestion].getQuestion());
        String[] answers = survey[numberOfQuestion].getAnswers();
        for (int i = 0; i < answers.length; i++) {
            System.out.printf("%d.%s\n", i + 1, answers[i]);
        }
    }

    public void checkAnswer(int answer, int numberOfQuestion) {
        String rightAnswer = this.survey[numberOfQuestion].getRightAnswer();
        String userAnswer = this.survey[numberOfQuestion].getAnswerById(answer);

        if (rightAnswer.equals(userAnswer)) {
            this.totalCorrectAnswers++;
        }
    }

    public String getResult() {
        return String.format("Result: right %d, not right %d",
                totalCorrectAnswers, this.survey.length - totalCorrectAnswers);
    }

    public int quantityOfAnswers() {
        int minQuantity = survey[0].getAnswers().length;
        for (int i = 1; i < survey.length; i++) {
            int nextQuantity = survey[i].getAnswers().length;
            if (minQuantity > nextQuantity) {
                minQuantity = nextQuantity;
            }
        }
        return minQuantity;
    }

    public int quantityOfQuestion() {
        return survey.length;
    }
}
