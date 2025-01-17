package Models;

import Stretegies.WinningStretegy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private GameState gameState;
    private Player winner;
    private int nextMovePlayerIndex;
    private List<WinningStretegy> winningStretegies;

    private Game(List<Player> players,int size,List<WinningStretegy> winningStretegies) {
        this.players = players;
        this.moves = new ArrayList<>();
        this.winningStretegies = winningStretegies;
        this.board = new Board(size);
        this.gameState = GameState.IN_PROGRESS;

    }

    public static class Builder{
        private List<Player> players;
        private int size;
        private List<WinningStretegy> winningStretegies;
        public Builder(){
            players = new ArrayList<>();
            winningStretegies = new ArrayList<>();
        }

        public Builder setPlayers(List<Player> players){
            this.players = players;
            return this;
        }
        public Builder setSize(int size){
            this.size = size;
            return this;
        }
        public Builder setWinningStretegy(List<WinningStretegy> winningStretegies){
            this.winningStretegies = winningStretegies;
            return this;
        }
        public void validate(){
            //TODO : VALIDATION NEEDED
        }

        public Game build(){
            validate();
            Game game = new Game(this.players,this.size,this.winningStretegies);
            return game;
        }

    }

    public static Builder getBuilder(){
          return new Builder();
    }
    public List<Player> getPlayers(){
        return players;
    }

    public void setPlayers(List<Player> players){
        this.players = players;
    }

    public Board getBoard(){
        return board;
    }

    public void setBoard(Board board){
        this.board = board;
    }

    public GameState getGameState(){
        return gameState;
    }

    public void setGameState(GameState state){
        this.gameState = state;
    }

    public List<Move> getMoves(){
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }
}
