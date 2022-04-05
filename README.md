# Jokenpo

O desafio foi escolhido através do desafio técnico da ZENVIA. O molde do projeto, com as regras de negócios podem ser encontradas [aqui](https://dojopuzzles.com/problems/jokenpo/).

# Para rodar o projeto

O projeto foi desenvolvido unicamente em Java, sendo assim o Java e o JDK é indispensável.

1. Realizar o clone do projeto com: git clone https://github.com/vitorvd/Jokenpo.git
2. Importar na sua IDE (Eclipse, IntelliJ, NetBeans) como um Maven Project
3. Após a importação, aguarde a indexação das dependências
4. Com o fim da indexação, rode a classe principal: JokenpoApplication
5. Para rodar os testes, executa a classe: JokenpoServiceTest.

# Com o projeto rodando

1. Você terá de informar o nome dos dois jogadores, um de cada vez;
2. Em seguida, você informará a opção de jogo escolhida por cada jogador, respectivamente;
3. Após isso, terá o resultado final exibido no terminal.

# Como o problema foi resolvido

É um jogo simples, mas o grande obstáculo foi encontrar uma solução agradável identificar qual opção de jogo (pedra, papel ou tesoura) venceria.
A primeira coisa a se imaginar é fazer um cadeia de if-else, contudo, isso não é uma boa prática e assim optei por criar um enum chamado OptionEnum.

A OptionEnum possui três valores possíveis: PEDRA, PAPEL e TESOURA, que representa uma opção de jogo. Dentro de cada valor, eu criei um método onde iria identificar para qual outra opção de jogo ela deveria perder, desta forma simplificando todo o processo em apenas uma condição.
Há também a hipótese de dar empate o jogo e quando isso acontece eu lanço uma Excpetion (poderia até ter criado uma personalizada).