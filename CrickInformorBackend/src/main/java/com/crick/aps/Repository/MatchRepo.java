package com.crick.aps.Repository;

import com.crick.aps.Entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo  extends JpaRepository<Match, Integer> {

    //i want to fetch the match by providing  teamHeading

    Optional<Match> findByTeamHeading(String teamHeading);

  
}
