package com.zenvia.technicalchallenge.controller;

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
    public ResponseEntity<String> play(@RequestHeader("choice") Choices choice){
        log.info("JokenpoController.play - Value of 'choice': {}", choice);
        String result = jokenpoService.play(choice);
        return ResponseEntity.ok(result);
    }
}
