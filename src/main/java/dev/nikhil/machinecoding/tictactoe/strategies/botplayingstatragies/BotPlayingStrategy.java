package dev.nikhil.machinecoding.tictactoe.strategies.botplayingstatragies;

import dev.nikhil.machinecoding.tictactoe.models.Board;
import dev.nikhil.machinecoding.tictactoe.models.Cell;

public interface BotPlayingStrategy {

    Cell makeMove(Board board);
}
