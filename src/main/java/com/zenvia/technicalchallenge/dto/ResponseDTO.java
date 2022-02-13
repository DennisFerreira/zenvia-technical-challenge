package com.zenvia.technicalchallenge.dto;

import com.zenvia.technicalchallenge.enums.Choices;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ResponseDTO {

    private Choices playerChoice;
    private Choices computerChoice;
    private String result;

}