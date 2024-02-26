package com.safaricom.mspinlesspartycreateprofilepostv1.exceptions;

import com.fasterxml.jackson.databind.RuntimeJsonMappingException;

public class UserNotFoundException extends RuntimeJsonMappingException {

    public UserNotFoundException(Long userid) {
        super("Dealer with " + userid + "not found.");
    }

}
