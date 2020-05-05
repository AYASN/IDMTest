import java.util.Collections;
import java.util.List;

public class RaceResults {

    private List<Competitor> competitors;

    public RaceResults(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    void onNewResult(String tagNumber, TimeDuration resultTime) {
        competitors.add(new Competitor(tagNumber, resultTime));
    }

    void printResults() {
        Collections.sort(competitors);
        System.out.println(competitors);
    }

    private class Competitor implements Comparable<Competitor>  {
        private String tagNumber;
        private TimeDuration resultTime;

        public Competitor(String tagNumber, TimeDuration resultTime) {
            this.tagNumber = tagNumber;
            this.resultTime = resultTime;
        }

        public int compareTo(Competitor other) {
            return resultTime.compareTo(other.resultTime);
        }
    }
}
