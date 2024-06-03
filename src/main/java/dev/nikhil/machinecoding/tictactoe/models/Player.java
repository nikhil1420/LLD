package dev.nikhil.machinecoding.tictactoe.models;

public class Player {
    private Symbol symbol;
    private String playerName;
    private PlayerType playerType;
    public Player(Symbol symbol, String playerName, PlayerType playerType) {
        this.symbol = symbol;
        this.playerName = playerName;
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
