package br.com.jokenpo.service;

import br.com.jokenpo.model.Player;

public class JokenpoService {

    public Player checkWhoWin(Player playerA, Player playerB) throws Exception {
        if(playerA.getOption() == playerB.getOption())
            throw new Exception("Empate");

        Player winner = playerA.getOption().getOptionWillLose() == playerB.getOption() ? playerB : playerA;

        return winner;
    }

}
