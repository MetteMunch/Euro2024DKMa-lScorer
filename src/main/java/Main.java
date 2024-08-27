import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MatchResultFileReader mrfr = new MatchResultFileReader("src/main/resources/Euro2024QualifyingRound.csv");
        mrfr.readFile();
        System.out.println(mrfr.getMatches());
    }
}
