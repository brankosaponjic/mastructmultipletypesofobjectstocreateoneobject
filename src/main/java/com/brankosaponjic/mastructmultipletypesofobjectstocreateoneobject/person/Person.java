package com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String firstname;
    private String lastname;
    private Date dateOfBirth;
    private LocalDateTime contractDate;
}
