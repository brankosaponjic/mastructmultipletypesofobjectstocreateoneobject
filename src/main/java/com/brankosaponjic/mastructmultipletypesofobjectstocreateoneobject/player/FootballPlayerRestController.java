package com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.player;

import com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.equipment.ColorType;
import com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.equipment.Equipment;
import com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.person.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@RestController
@RequiredArgsConstructor
public class FootballPlayerRestController {
    private final ItalianFootballPlayerMapper mapper;

    @GetMapping("/footballplayer")
    public FootballPlayer italianFootballPlayer() {
        Person person = new Person("Paolo","Rossi",new Date(56, Calendar.SEPTEMBER,23), LocalDateTime.now());
        Equipment equipment = new Equipment(ColorType.AZURE,ColorType.WHITE,ColorType.AZURE);
        return mapper.personToFootballPlayer(person,equipment);
    }
}
