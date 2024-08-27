import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchResultFileReader {

    private String fileName;
    private List<MatchResult> matches;


    public MatchResultFileReader(String fileName) throws FileNotFoundException {
        matches = new ArrayList<>();
        this.fileName = fileName;


    }

    public List<MatchResult> readFile() {
        try (Scanner scanner = new Scanner(new File(fileName))) {

            while (scanner.hasNext()) { //sålænge der er en næste linje er denne sand og kører
                String line = scanner.nextLine(); //læser linjen
                String[] parts = line.split(";"); //deler linjen op i hold og målscorer
                String teams = parts[0];//Her er variable til holdene (den ene side af semikolon)
                List<String> goalScorers = new ArrayList<>();

                if (parts.length >= 2) {
                    String lastPart = parts[1];// her skal tjekkes for om der findes en index 1 eller out of bounce!
                    String[] splitLastPart = lastPart.split(","); //deler målscorer op

                    for (int i = 0; i < splitLastPart.length; i++) {
                        goalScorers.add(splitLastPart[i]);
                    }

                }
                matches.add(new MatchResult(teams, goalScorers));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return matches;
    }
    //TO DO vi skal kunne tjekke med unit test i stedet for via main.


    public List<MatchResult> getMatches() {
        return matches;
    }


}
