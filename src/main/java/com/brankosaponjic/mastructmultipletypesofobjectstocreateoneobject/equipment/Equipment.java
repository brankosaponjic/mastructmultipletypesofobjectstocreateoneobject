package com.brankosaponjic.mastructmultipletypesofobjectstocreateoneobject.equipment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipment {
    private ColorType jersey;
    private ColorType shorts;
    private ColorType socks;
}
