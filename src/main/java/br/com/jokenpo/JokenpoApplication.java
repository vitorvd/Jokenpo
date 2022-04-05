package br.com.jokenpo;

import br.com.jokenpo.enums.OptionEnum;
import br.com.jokenpo.model.Player;
import br.com.jokenpo.service.JokenpoService;
import br.com.jokenpo.service.PlayerService;
import br.com.jokenpo.util.MessageUtil;

import java.util.Scanner;

public class JokenpoApplication {

    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
        JokenpoService jokenpoService = new JokenpoService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do primeiro jogador: ");
        Player playerA = playerService.create(scanner.next());

        System.out.println("Informe o nome do segundo jogador: ");
        Player playerB = playerService.create(scanner.next());

        MessageUtil.showOptionsToPlay(playerA, scanner);

        MessageUtil.showOptionsToPlay(playerB, scanner);

        try {
            Player winner = jokenpoService.checkWhoWin(playerA, playerB);
            System.out.println(String.format("O vencedor foi %s com a opção de %s.", winner.getName(), winner.getOption().getLabel()));
        } catch (Exception e) {
            System.out.println(String.format("O Jokenpô entre %s e %s deu empate. Ambos jogaram %s.", playerA.getName(), playerB.getName(), playerA.getOption().getLabel()));
        }

    }

}
