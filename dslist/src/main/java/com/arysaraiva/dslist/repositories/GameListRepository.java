package com.arysaraiva.dslist.repositories;

import com.arysaraiva.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
