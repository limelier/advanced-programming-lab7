package board;

import token.Token;

import java.util.*;

public class Board {
    private final List<Token> tokens = new ArrayList<>();

    public void addToken(Token token) {
        tokens.add(token);
    }

    public boolean hasPieces() {
        synchronized (tokens) {
            return !tokens.isEmpty();
        }
    }

    public void shuffle() {
        Collections.shuffle(tokens);
    }

    /**
     * Remove and return the last token on the board.
     * @return the removed token
     */
    public Token takeToken() {
        synchronized (tokens) {
            return tokens.remove(tokens.size() - 1);
        }
    }
}
