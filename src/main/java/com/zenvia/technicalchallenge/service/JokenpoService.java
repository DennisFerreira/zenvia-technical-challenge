package com.zenvia.technicalchallenge.service;

import com.zenvia.technicalchallenge.enums.Choices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class JokenpoService {

    public String play(Enum playerChoice){

        log.info("JokenpoService.play - Start - Player chose: {}", playerChoice);

        Choices computerChoice = Choices.values()[new Random().nextInt(Choices.values().length)];

        log.info("JokenpoService.play - Computer chose: {}", computerChoice);

        String result = match(playerChoice,computerChoice);

        log.info("JokenpoService.play - Result: {}", result);

        return result;
    }

    private String match(Enum playerChoice, Enum computerChoice){
        if(Choices.ROCK.equals(playerChoice) && Choices.SCISSORS.equals(computerChoice))
            return "Player won";
        else if(Choices.PAPER.equals(playerChoice) && Choices.ROCK.equals(computerChoice))
            return "Player won";
        else if(Choices.SCISSORS.equals(playerChoice) && Choices.PAPER.equals(computerChoice))
            return "Player won";
        else if(playerChoice.equals(computerChoice)) {
            return "Draw";
        } else {
            return "Computer won";
        }

    }
//    (Player::Pedra, Player::Papel) => Resultado::VitoriaPapel,
//            (Player::Pedra, Player::Tesoura) => Resultado::VitoriaPedra,
//            (Player::Tesoura, Player::Papel) => Resultado::VitoriaTesoura
}
