package com.DavidJava.App.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DavidJava.App.dto.GameListDTO;
import com.DavidJava.App.entities.GameList;
import com.DavidJava.App.repositories.GameListRepository;

@Service
public class GameListService {
  @Autowired
  private GameListRepository gameListRepository;

  public List<GameListDTO> findAll(){
    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(x -> new GameListDTO(x)).toList();
  }
  
}