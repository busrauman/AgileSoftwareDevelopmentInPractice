package de.kimminich.agile.samplesolutions.excercise6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class CardOccurrences {

    private Map<Integer, Integer> tuples = new HashMap<>();

    public CardOccurrences(int[] cards) {
        for (int card : cards) {
            addCard(card);
        }
    }

    public void addCard(int card) {
        if (tuples.get(card) == null) {
            tuples.put(card, 1);
        } else {
            tuples.put(card, tuples.get(card) + 1);
        }
    }

    public Set<Integer> cardTypes() {
        return tuples.keySet();
    }

    public Collection<Integer> cardOccurrences() {
        return tuples.values();
    }

}
