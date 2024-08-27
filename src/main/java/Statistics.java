import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {

    private List<MatchResult> matchResults;

    public Statistics(String fileName) throws FileNotFoundException {
        MatchResultFileReader mrfr = new MatchResultFileReader(fileName);
        matchResults = mrfr.readFile();
    }

    public Set<String> getGoalScorers(){
        Set<String> goalScorers = new HashSet<>();

        for(MatchResult m: matchResults){
            List<String> scorers = m.getGoalScorers();
            goalScorers.addAll(scorers);
        }
        return goalScorers;
    }

    public Map<String,Integer> getGoalScorersWithTotals(){
        Map<String,Integer> scorerWithTotals = new HashMap<>();

        for(MatchResult m: matchResults){ //Her omdannes listen med typen MatchResult til String liste med alene målscorene
            List<String> scorers = m.getGoalScorers();

            for(String s: scorers){
                if(scorerWithTotals.containsKey(s)){ //hvis målscorer allerede er i HashMap, så skal værdi tillægges 1
                    scorerWithTotals.put(s, scorerWithTotals.get(s)+1); //dette kan gøres på en smartere måde med getOrDefault

                } else {
                    scorerWithTotals.put(s,1);
                }
            }
        }
        return scorerWithTotals;
    }

//    public int getNumberOfGoals(String goalScorer){
//
//
//    }
}
