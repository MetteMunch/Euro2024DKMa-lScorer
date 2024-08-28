import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
class StatisticsTest {


    @Test
    void getNumberOfGoals() throws FileNotFoundException {

        //Arrange
        Statistics st = new Statistics("src/main/resources/Euro2024QualifyingRound.csv");
        String goalScorer = "Højlund";


        //Act
        int expectedValue = 7;
        int actualValue = st.getNumberOfGoals(goalScorer);

        //Assert
        Assertions.assertEquals(expectedValue,actualValue);
    }
}