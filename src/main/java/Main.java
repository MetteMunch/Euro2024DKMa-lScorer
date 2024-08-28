import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Statistics stat = new Statistics("src/main/resources/Euro2024QualifyingRound.csv");
        System.out.println(stat.getGoalScorers());
        System.out.println("Her oversigt med total antal mål:");
        System.out.println(stat.getGoalScorersWithTotals());
        System.out.println(stat.getNumberOfGoals("Højlund"));

    }
}
