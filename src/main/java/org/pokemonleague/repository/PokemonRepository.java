package org.pokemonleague.repository;

import org.pokemonleague.model.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {

}
