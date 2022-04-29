package survey;

public class Questionnaire {
    private String question;
    private String rightAnswer;

    public Questionnaire() {

    }

    public Questionnaire(String question, String rightAnswer) {
        this.question = question;
        this.rightAnswer = rightAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }
}
