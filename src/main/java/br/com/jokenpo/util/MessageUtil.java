package br.com.jokenpo.util;

import br.com.jokenpo.enums.OptionEnum;
import br.com.jokenpo.model.Player;

import java.util.Scanner;

public class MessageUtil {

    public static void showOptionsToPlay(Player player, Scanner scanner) {
        System.out.flush();
        System.out.println(String.format("Qual a opção de jogo do jogador %s?", player.getName()));
        for(OptionEnum option : OptionEnum.values()) {
            System.out.println(String.format("%s - %s", option.getOpcao(), option.getLabel()));
        }

        String optionInput = null;
        do {
            System.out.println("Opção (Insira o valor númerico): ");
            optionInput = scanner.next();
        }while (!NumberUtil.isInteger(optionInput) || Integer.valueOf(optionInput) < 1 || Integer.valueOf(optionInput) > 3);

        player.setOption(OptionEnum.values()[Integer.valueOf(optionInput) - 1]);
    }

}
