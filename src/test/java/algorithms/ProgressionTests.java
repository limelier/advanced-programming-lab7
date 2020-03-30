package algorithms;

import org.junit.Test;
import token.NumberToken;

import java.util.SortedSet;
import java.util.TreeSet;

import static algorithms.Progression.maxArithmeticProgressionInNumbers;
import static org.junit.Assert.assertEquals;

public class ProgressionTests {
    @Test
    public void test1() {
        SortedSet<NumberToken> tokens = new TreeSet<>();
        tokens.add(new NumberToken(2));
        tokens.add(new NumberToken(4));
        tokens.add(new NumberToken(6));
        assertEquals(3, maxArithmeticProgressionInNumbers(tokens));
    }
}
