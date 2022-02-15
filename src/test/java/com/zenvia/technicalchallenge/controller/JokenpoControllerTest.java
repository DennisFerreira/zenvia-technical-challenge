package com.zenvia.technicalchallenge.controller;

import com.zenvia.technicalchallenge.service.JokenpoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(JokenpoController.class)
public class JokenpoControllerTest {

    @MockBean
    private JokenpoController jokenpoController;

    @MockBean
    private JokenpoService jokenpoService;

    @Autowired
    private MockMvc mvc;

    @Test
    public void play_shouldReturnStatusOK() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/jokenpo/play")
                .header("playerChoice","paper");

        MvcResult result = mvc.perform(requestBuilder).andReturn();
        assertEquals(HttpStatus.OK.value(),result.getResponse().getStatus());
    }
    @Test
    public void play_shouldReturnBadRequest() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/jokenpo/play")
                .header("playerChoice","BATATA");
        MvcResult result = mvc.perform(requestBuilder).andReturn();
        assertEquals(HttpStatus.BAD_REQUEST.value(),result.getResponse().getStatus());
    }
}
