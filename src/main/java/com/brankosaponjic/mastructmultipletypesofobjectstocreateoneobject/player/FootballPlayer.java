package com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.player;

import com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.equipment.Equipment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FootballPlayer {
    private String name;
    private int backNumber;
    private String dob;
    private String enlistmentDate;
    private Equipment equipment;
}
