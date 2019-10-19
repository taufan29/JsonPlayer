package com.iren.listteamplayer;

import java.util.ArrayList;

public class PlayerResult {
    private ArrayList<Player> player;

    public PlayerResult(ArrayList<Player> player) {
        this.player = player;
    }

    public ArrayList<Player> getPlayer() {
        return player;
    }
}
