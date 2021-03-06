package com.chessAI;

import com.chessAI.player.BlackPlayer;
import com.chessAI.player.Player;
import com.chessAI.player.WhitePlayer;

public enum Alliance {
    WHITE{
        @Override
        public int getDirection() {
            return -1;
        }

        @Override
        public boolean isBlack() {
            return false;
        }

        @Override
        public boolean isWhite() {
            return true;
        }

        @Override
        public Player choosePlayer(final WhitePlayer whitePlayer, final BlackPlayer blackPlayer) {
        return whitePlayer;
        }
    },
    BLACK {
        @Override
        public int getDirection() {
            return 1;
        }

        @Override
        public boolean isBlack() {
            return true;
        }

        @Override
        public boolean isWhite() {
            return false;
        }

        @Override
        public Player choosePlayer(final WhitePlayer whitePlayer, final BlackPlayer blackPlayer) {
            return blackPlayer;
        }
    };

    public abstract int getDirection();

    public abstract boolean isBlack();
    public abstract boolean isWhite();
    public abstract Player choosePlayer(WhitePlayer whitePlayer, BlackPlayer blackPlayer);


}
