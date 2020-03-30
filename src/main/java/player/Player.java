package player;

import board.Board;
import token.NumberToken;
import token.Token;
import token.WildcardToken;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import static algorithms.Progression.maxArithmeticProgressionInNumbers;

public abstract class Player implements Runnable {
    protected String name;
    protected Board board;
    protected SortedSet<NumberToken> numberTokens = new TreeSet<>();
    protected Set<WildcardToken> wildcardTokens = new HashSet<>();

    protected int maxArithmeticProgression() {
        return wildcardTokens.size() + maxArithmeticProgressionInNumbers(numberTokens);
    }

    public Player(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    public abstract void run();
}
