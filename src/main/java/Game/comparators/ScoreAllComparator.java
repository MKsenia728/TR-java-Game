package Game.comparators;

import Game.Participant;

import java.util.Comparator;

public class ScoreAllComparator implements Comparator<Participant> {
    @Override
    public int compare(Participant o1, Participant o2) {
        return o2.getAllScore() - o1.getAllScore();
    }
}
