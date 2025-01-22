package com.arysaraiva.dslist.repositories;

import com.arysaraiva.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
