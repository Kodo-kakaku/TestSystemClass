package test;

public class Question {
    private String question;
    private Answer answer;
    private AnswersOptions options;

    public Question() {

    }

    public Question(String question, String answer, String... options) {
        this.question = question;
        this.answer = new Answer(answer);
        this.options = new AnswersOptions(options);
    }

    public String getQuestion() {
        return question;
    }

    public boolean isCorrectAnswer(int userAnswer) {
        return this.answer.answer().equals(options.getOption(userAnswer));
    }

    public String[] getOptions() {
        return options.getOptions();
    }
}
