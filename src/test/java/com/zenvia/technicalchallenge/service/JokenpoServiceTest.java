package com.zenvia.technicalchallenge.service;

import com.zenvia.technicalchallenge.constants.Result;
import com.zenvia.technicalchallenge.dto.ResponseDTO;
import com.zenvia.technicalchallenge.enums.Choices;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JokenpoServiceTest {

    @InjectMocks
    private JokenpoService jokenpoService;

    @Test
    public void play_shouldReturnResponseDTO() {
        ResponseDTO response = jokenpoService.play(Choices.ROCK);
        assertEquals(ResponseDTO.class, response.getClass());
    }

    @RepeatedTest(10)
    public void play_shouldReturnValidResultWhenPlayerChoseRock() {
        ResponseDTO response = jokenpoService.play(Choices.ROCK);
        if(Choices.ROCK.equals(response.getComputerChoice()))
            assert (Result.DRAW.equals(response.getResult()));
        if(Choices.PAPER.equals(response.getComputerChoice()))
            assert (Result.COMPUTER_WON.equals(response.getResult()));
        if(Choices.SCISSORS.equals(response.getComputerChoice()))
            assert (Result.PLAYER_WON.equals(response.getResult()));
    }

    @RepeatedTest(10)
    public void play_shouldReturnValidResultWhenPlayerChosePaper() {
        ResponseDTO response = jokenpoService.play(Choices.PAPER);
        if(Choices.ROCK.equals(response.getComputerChoice()))
            assert (Result.PLAYER_WON.equals(response.getResult()));
        if(Choices.PAPER.equals(response.getComputerChoice()))
            assert (Result.DRAW.equals(response.getResult()));
        if(Choices.SCISSORS.equals(response.getComputerChoice()))
            assert (Result.COMPUTER_WON.equals(response.getResult()));
    }

    @RepeatedTest(10)
    public void play_shouldReturnValidResultWhenPlayerChoseScissors() {
        ResponseDTO response = jokenpoService.play(Choices.SCISSORS);

        if(Choices.ROCK.equals(response.getComputerChoice()))
            assert (Result.COMPUTER_WON.equals(response.getResult()));
        if(Choices.PAPER.equals(response.getComputerChoice()))
            assert (Result.PLAYER_WON.equals(response.getResult()));
        if(Choices.SCISSORS.equals(response.getComputerChoice()))
            assert (Result.DRAW.equals(response.getResult()));
    }
}
