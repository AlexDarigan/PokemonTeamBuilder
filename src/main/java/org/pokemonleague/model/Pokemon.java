package org.pokemonleague.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Pokemon {

    @Id private int pkmnId;
    private String pkmnName;
    private String type1;
    private String type2;
    private int stage;
}


