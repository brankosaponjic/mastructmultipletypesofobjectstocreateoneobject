package com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.player;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class MyDateMapper {

    private final String THE_FORMAT = "YYYY-MM-dd HH:mm";
    private final DateTimeFormatter DATETIMEFORMATTER = DateTimeFormatter.ofPattern(THE_FORMAT);

    public LocalDateTime asLocalDateTime(String str) {
        return LocalDateTime.parse(str, DATETIMEFORMATTER);
    }

    public String asString(LocalDateTime dateTime) {
        return dateTime.format(DATETIMEFORMATTER);
    }
}
