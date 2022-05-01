import org.junit.Before;
import org.junit.Test;
import survey.QuestionnaireWithAnswers;

import static org.junit.Assert.assertEquals;

public class SurveyTest {
    private QuestionnaireWithAnswers question;
    private final String[] testAnswers = {"Some right answer",
            "bad answer", "bad answer", "very bad answer"};

    @Before
    public void initTest() {
        this.question = new QuestionnaireWithAnswers(
                "question?",
                "Some right answer",
                "Some right answer", "bad answer", "bad answer", "very bad answer"
        );
    }

    @Test
    public void testQuestion() {
        assertEquals("question?", question.getQuestion());
    }

    @Test
    public void testRightAnswer() {
        assertEquals("Some right answer", question.getRightAnswer());
    }

    @Test
    public void testGetAnswers() {
        String[] answers = question.getAnswers();
        for (int i = 0; i < testAnswers.length; i++) {
            assertEquals(this.testAnswers[i], answers[i]);
        }
    }

    @Test
    public void testGetAnswersById() {
        for (int i = 0; i < testAnswers.length; i++) {
            assertEquals(this.testAnswers[i], question.getAnswerById(i));
        }
    }
}
