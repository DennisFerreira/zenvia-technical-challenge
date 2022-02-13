package com.zenvia.technicalchallenge.converters;

import com.zenvia.technicalchallenge.enums.Choices;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class StringToChoicesEnumConverter implements Converter<String, Choices> {

    @Override
    public Choices convert(String source) {
        try{
            return Choices.valueOf(source.trim().toUpperCase(Locale.ROOT));
        } catch(Exception e){
            return Choices.valueOf(source);
        }
    }
}
