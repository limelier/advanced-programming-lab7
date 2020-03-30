package game;

import board.Board;
import player.Player;
import player.SimplePlayer;
import token.WildcardToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static util.TokenUtil.randomNumberToken;

public class Game {
    final int progressionToWin = 5;
    List<Player> players = new ArrayList<>();
    Board board = new Board();

    private void addPlayers() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many players are playing?");
        int numPlayers = in.nextInt();

        for (int i = 1; i <= numPlayers; i++) {
            players.add(new SimplePlayer("Player " + i, board));
        }
    }

    private void setupBoard() {
        final int maxToken = 30;
        final int numTokens = 30;
        final int numWildcards = 3;
        for (int i = 0; i < numTokens; i++) {
            board.addToken(randomNumberToken(maxToken));
        }
        for (int i = 0; i < numWildcards; i++) {
            board.addToken(new WildcardToken());
        }
        board.shuffle();
    }

    public void setup() {
        setupBoard();
        addPlayers();
    }

    public void run() {
        for (var player : players) {
            new Thread(player).start();
        }
    }
}
