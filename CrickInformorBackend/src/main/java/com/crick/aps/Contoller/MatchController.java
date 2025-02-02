package com.crick.aps.Contoller;

import com.crick.aps.Entities.Match;
import com.crick.aps.Services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService){
        this.matchService= matchService;
    }

    //get Live Matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
    return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    //get All matches

    @GetMapping("/allmatch")
    public ResponseEntity<List<Match>>getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

    //get point table

    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }
}
