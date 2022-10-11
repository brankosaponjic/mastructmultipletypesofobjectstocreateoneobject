package com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.player;

import com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.equipment.Equipment;
import com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.person.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {MyDateMapper.class}, componentModel = "spring")
public interface ItalianFootballPlayerMapper {

    @Mapping(target = "name", expression = "java(person.getFirstname() + ' ' + person.getLastname())")
    @Mapping(source = "person.dateOfBirth", target = "dob", dateFormat = "yyyy-MM-dd")
    @Mapping(source = "person.contractDate", target = "enlistmentDate")
    @Mapping(target = "backNumber", constant = "20")
    FootballPlayer personToFootballPlayer(Person person, Equipment equipment);
}
