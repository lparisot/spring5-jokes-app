package com.lpa.springbootjokes.repositories;

import com.lpa.springbootjokes.models.Joke;
import org.springframework.data.repository.CrudRepository;

public interface JokeRepository extends CrudRepository<Joke, Long> {
}
