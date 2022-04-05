package br.com.jokenpo.enums;

public enum OptionEnum {

    PEDRA(1, "Pedra") {

        @Override
        public OptionEnum getOptionWillLose() {
            return OptionEnum.PAPEL;
        }

    },

    PAPEL(2, "Papel") {

        @Override
        public OptionEnum getOptionWillLose() {
            return OptionEnum.TESOURA;
        }

    },

    TESOURA(3, "Tesoura") {

        @Override
        public OptionEnum getOptionWillLose() {
            return OptionEnum.PEDRA;
        }

    };

    private int opcao;

    private String label;

    OptionEnum(int opcao, String label) {
        this.opcao = opcao;
        this.label = label;
    }

    public int getOpcao() {
        return opcao;
    }

    public String getLabel() {
        return label;
    }

    public abstract OptionEnum getOptionWillLose();

}
