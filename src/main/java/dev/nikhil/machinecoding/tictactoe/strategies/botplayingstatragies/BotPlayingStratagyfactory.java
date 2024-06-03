package dev.nikhil.machinecoding.tictactoe.strategies.botplayingstatragies;

import dev.nikhil.machinecoding.tictactoe.models.BotDifficultyLevel;

public class BotPlayingStratagyfactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficulty) {
        return switch (difficulty){
            case EASY -> new EasyBotplayingStatragy();
            case MEDIUM -> new MediumBotplayingStatragy();
            case HARD -> new HardBotPlayingStatragy();
        };
    }
}
