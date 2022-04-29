package survey;

import java.util.Arrays;

public class QuestionnaireWithAnswers extends Questionnaire {
    private String[] answers;

    public QuestionnaireWithAnswers() {
        super();
    }

    public QuestionnaireWithAnswers(String question, String answer, String... answers) {
        super(question, answer);
        this.answers = Arrays.copyOf(answers, answers.length);
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getAnswerById(int id) {
        return answers[id];
    }
}
