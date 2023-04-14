package org.pokemonleague.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/")
public class PokemonController {

    @RequestMapping(value = "pokemon", method = RequestMethod.GET)
    public String getPokemon() {
        return "Pikachu!";
    }
}
