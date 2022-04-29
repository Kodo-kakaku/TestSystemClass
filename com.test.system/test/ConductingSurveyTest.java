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



}
