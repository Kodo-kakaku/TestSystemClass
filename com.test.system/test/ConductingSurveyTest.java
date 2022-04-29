import interrogation.ConductingSurvey;
import org.junit.Before;
import org.junit.Test;
import survey.QuestionnaireWithAnswers;

import static org.junit.Assert.assertEquals;

public class ConductingSurveyTest {
    private ConductingSurvey survey;

    @Before
    public void initTest() {
        this.survey = new ConductingSurvey(
                new QuestionnaireWithAnswers(
                        "question 1?",
                        "Some right answer 1",
                        "Some right answer 1", "bad answer 1", "bad answer 1", "very bad answer 1"
                ),
                new QuestionnaireWithAnswers(
                        "question 2?",
                        "Some right answer 2",
                        "Some right answer 2", "bad answer 2", "bad answer 2", "very bad answer 2"
                ),
                new QuestionnaireWithAnswers(
                        "question 3?",
                        "Some right answer 3",
                        "Some right answer 3", "bad answer 3", "bad answer 3", "very bad answer 3"
                )
        );
    }

    @Test
    public void testQuantityOfAnswers() {
        assertEquals(4, this.survey.quantityOfAnswers());
    }

    @Test
    public void testQuantityOfQuestion() {
        assertEquals(3, this.survey.quantityOfQuestion());
    }

    @Test
    @Before
    public void testCheckAnswer() {
        this.survey.checkAnswer(0, 0);
    }

    @Test
    public void testResult() {
        assertEquals("Result: right 1, not right 2",
                this.survey.getResult());
    }
}
