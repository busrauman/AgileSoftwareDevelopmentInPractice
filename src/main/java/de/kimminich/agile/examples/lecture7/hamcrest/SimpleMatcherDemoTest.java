package de.kimminich.agile.examples.lecture7.hamcrest;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SimpleMatcherDemoTest {

    @Test
    public void shouldKnowAnswerToEverything() {
        int answerToEverything = DeepThought.calculate();

        assertThat(answerToEverything, is(equalTo(42)));
    }

    @Test
    @Ignore
    public void shouldNotKnowAnswerToEverything() {
        int answerToEverything = DeepThought.miscalculate();

        assertEquals(42, answerToEverything);
    }

    private static final class DeepThought {

        public static int calculate() {
            return 42;
        }

        public static int miscalculate() {
            return Integer.MAX_VALUE * (int) Math.PI;
        }

    }
}
