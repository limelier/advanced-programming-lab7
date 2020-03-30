package algorithms;

import token.NumberToken;

import java.util.SortedSet;
import java.util.TreeSet;

public class Progression {
    public static int maxArithmeticProgressionInNumbers(SortedSet<NumberToken> tokens) {
        int maxProgressionLength = 0;
        for (var firstToken : tokens) {
            SortedSet<NumberToken> secondCandidates = new TreeSet<>(tokens);
            secondCandidates.remove(firstToken);
            for (var secondToken : secondCandidates) {
                int progressionLength = 2;
                int delta = secondToken.getValue() - firstToken.getValue();
                NumberToken topToken = secondToken;
                SortedSet<NumberToken> otherTokens = new TreeSet<>(secondCandidates);
                otherTokens.remove(secondToken);

                for (var token : otherTokens) {
                    if (token.getValue() - topToken.getValue() == delta) {
                        topToken = token;
                        progressionLength++;
                    }
                }
                maxProgressionLength = Integer.max(maxProgressionLength, progressionLength);
            }
        }
        return maxProgressionLength;
    }
}
