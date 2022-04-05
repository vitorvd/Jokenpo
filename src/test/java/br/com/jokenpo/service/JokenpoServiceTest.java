package br.com.jokenpo.service;

import static org.junit.jupiter.api.Assertions.*;

import br.com.jokenpo.enums.OptionEnum;
import br.com.jokenpo.model.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JokenpoServiceTest {

    private static JokenpoService service;
    private static PlayerService playerService;

    private static Player playerA, playerB;

    @BeforeAll
    public static void init() {
        service = new JokenpoService();
        playerService = new PlayerService();

        playerA = playerService.create("Vitor");
        playerB = playerService.create("Júlia");
    }

    @Test
    public void opcaoJogoPedraParaVencer() throws Exception {
        playerA.setOption(OptionEnum.PEDRA);
        playerB.setOption(OptionEnum.TESOURA);

        Player winner = service.checkWhoWin(playerA, playerB);

        assertEquals(OptionEnum.PEDRA, winner.getOption());
    }

    @Test
    public void opcaoJogoPapelParaVencer() throws Exception {
        playerA.setOption(OptionEnum.PEDRA);
        playerB.setOption(OptionEnum.PAPEL);

        Player winner = service.checkWhoWin(playerA, playerB);

        assertEquals(OptionEnum.PAPEL, winner.getOption());
    }

    @Test
    public void opcaoJogoTesouraParaVencer() throws Exception {
        playerA.setOption(OptionEnum.TESOURA);
        playerB.setOption(OptionEnum.PAPEL);

        Player winner = service.checkWhoWin(playerA, playerB);

        assertEquals(OptionEnum.TESOURA, winner.getOption());
    }

    @Test
    public void opcaoJogoEmpate() {
        playerA.setOption(OptionEnum.PAPEL);
        playerB.setOption(OptionEnum.PAPEL);

        assertThrows(Exception.class, () -> service.checkWhoWin(playerA, playerB));
    }

}
