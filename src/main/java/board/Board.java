package board;

import token.Token;

import java.util.HashSet;
import java.util.Set;

public class Board {
    private Set<Token> tokens = new HashSet<>();

    public void addToken(Token token) {
        tokens.add(token);
    }
}
