/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package edu.kit.metadatahub.doip.rest;

/**
 * Define valid operations for REST interface of DOIP.
  */
public enum Operations {
    OP_CREATE("0.DOIP/Op.Create"),
    OP_RETRIEVE("0.DOIP/Op.Retrieve"),
    OP_UPDATE("0.DOIP/Op.Update"),
    OP_DELETE("0.DOIP/Op.Delete"),
    OP_SEARCH("0.DOIP/Op.Search"),
    OP_VALIDATE("0.DOIP/Op.Validation");
    
    private final String value;

    Operations(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Operations fromValue(String v) {
        for (Operations c: Operations.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
 
}
