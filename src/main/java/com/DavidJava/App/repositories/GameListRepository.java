package com.DavidJava.App.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DavidJava.App.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
