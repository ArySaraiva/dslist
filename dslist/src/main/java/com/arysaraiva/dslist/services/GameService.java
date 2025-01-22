package com.arysaraiva.dslist.services;

import com.arysaraiva.dslist.dto.GameMinDTO;

import com.arysaraiva.dslist.entities.Game;
import com.arysaraiva.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
