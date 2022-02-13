package com.zenvia.technicalchallenge.service;

import com.zenvia.technicalchallenge.constants.Result;
import com.zenvia.technicalchallenge.dto.ResponseDTO;
import com.zenvia.technicalchallenge.enums.Choices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class JokenpoService {

    public ResponseDTO play(Choices playerChoice){

        log.info("JokenpoService.play - Player chose: {}", playerChoice);

        Choices computerChoice = getComputerChoice();

        log.info("JokenpoService.play - Computer chose: {}", computerChoice);

        String result = match(playerChoice,computerChoice);

        ResponseDTO responseDTO = new ResponseDTO(playerChoice,computerChoice,result);

        log.info("JokenpoService.play - Result: {}", result);

        return responseDTO;
    }

    private Choices getComputerChoice() {
        return Choices.values()[new Random().nextInt(Choices.values().length)];
    }

    private String match(Choices playerChoice, Choices computerChoice){
        if(Choices.ROCK.equals(playerChoice) && Choices.SCISSORS.equals(computerChoice))
            return Result.PLAYER_WON;
        else if(Choices.PAPER.equals(playerChoice) && Choices.ROCK.equals(computerChoice))
            return Result.PLAYER_WON;
        else if(Choices.SCISSORS.equals(playerChoice) && Choices.PAPER.equals(computerChoice))
            return Result.PLAYER_WON;
        else if(playerChoice.equals(computerChoice))
            return Result.DRAW;
         else
            return Result.COMPUTER_WON;
    }
}
