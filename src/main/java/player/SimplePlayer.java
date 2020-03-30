package player;

import board.Board;
import token.NumberToken;
import token.Token;
import token.WildcardToken;

public class SimplePlayer extends Player {
    public SimplePlayer(String name, Board board) {
        super(name, board);
    }

    private void takeRandomToken() {
        // assuming board was shuffled
        Token token = board.takeToken();

        if (token instanceof NumberToken) {
            numberTokens.add((NumberToken) token);
        } else {
            wildcardTokens.add((WildcardToken) token);
        }
    }

    @Override
    public void run() {
        while (board.hasPieces()) {
            takeRandomToken();
        }
        System.out.println(name + " finished with a progression of length " + maxArithmeticProgression());
    }
}
