package com.zenvia.technicalchallenge.controller;

import com.zenvia.technicalchallenge.dto.ResponseDTO;
import com.zenvia.technicalchallenge.enums.Choices;
import com.zenvia.technicalchallenge.service.JokenpoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jokenpo")
@Slf4j
public class JokenpoController {

    @Autowired
    private JokenpoService jokenpoService;

    @GetMapping(value = "/play")
    public ResponseEntity<ResponseDTO> play(@RequestHeader("choice") Choices playerChoice){
        log.info("JokenpoController.play - Sending to service with value of 'choice': {}", playerChoice);
        ResponseDTO response = jokenpoService.play(playerChoice);
        log.info("JokenpoController.play - Response: {}", response);
        return ResponseEntity.ok(response);
    }
}
