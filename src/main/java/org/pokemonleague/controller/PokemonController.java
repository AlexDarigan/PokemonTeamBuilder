package org.pokemonleague.controller;

import lombok.AllArgsConstructor;
import org.pokemonleague.model.Pokemon;
import org.pokemonleague.service.PokemonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/")
@AllArgsConstructor
public class PokemonController {

    private final PokemonService pokemonService;

    @RequestMapping(value = "pokemon", method = RequestMethod.GET)
    public List<Pokemon> getPokemon() {
        return pokemonService.getPokemon();
    }

}
