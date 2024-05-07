package com.crick.aps.Services;

import com.crick.aps.Entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    //get all matches
    List<Match> getAllMatches();
    //get Live matches

    List<Match> getLiveMatches();

    // get ipl point table
    List<List<String>> getPointTable();
}
