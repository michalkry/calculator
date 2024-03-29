package com.michalkry.calculator;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OperationType {

    ADD ("+"),
    SUBTRACT ("-"),
    MULTIPLE ("*"),
    DIVIDE ("/");


    private String sign;

}
