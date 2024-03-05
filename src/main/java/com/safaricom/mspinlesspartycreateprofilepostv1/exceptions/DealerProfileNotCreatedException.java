package com.safaricom.mspinlesspartycreateprofilepostv1.exceptions;

import com.fasterxml.jackson.databind.RuntimeJsonMappingException;

public class DealerProfileNotCreatedException extends RuntimeJsonMappingException {

    public DealerProfileNotCreatedException(Long userid) {
        super("Dealer with " + userid + "not created.");
    }

}
