package com.safaricom.mspinlesspartycreateprofilepostv1.model;

public class enums {

    // generate enums for true and false values for status
    public enum Status {
        Y("Y"),
        N("N");

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}
