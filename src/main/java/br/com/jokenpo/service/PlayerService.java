package br.com.jokenpo.service;

import br.com.jokenpo.model.Player;

public class PlayerService {

    public Player create(String name) {
        Player player = new Player();
        player.setName(name);

        return player;
    }

}
