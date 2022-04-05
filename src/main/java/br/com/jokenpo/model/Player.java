package br.com.jokenpo.model;

import br.com.jokenpo.enums.OptionEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Player {

    private String name;

    private OptionEnum option;

}
