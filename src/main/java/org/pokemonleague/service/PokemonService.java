package org.pokemonleague.service;

import lombok.AllArgsConstructor;
import org.pokemonleague.model.Pokemon;
import org.pokemonleague.repository.PokemonRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
@AllArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> getPokemon() {
        // TODO: Learn why get (because this is an optional?)
        return (List<Pokemon>) pokemonRepository.findAll();
    }
}
