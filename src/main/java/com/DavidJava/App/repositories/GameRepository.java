package com.DavidJava.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DavidJava.App.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
  
}
