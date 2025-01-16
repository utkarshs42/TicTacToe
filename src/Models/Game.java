package Models;

import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private GameState state;
    private Player winner;
    private int nextMovePlayerIndex;
}
