package com.safaricom.mspinlesspartycreateprofilepostv1.dto;

import java.util.ArrayList;

import com.safaricom.mspinlesspartycreateprofilepostv1.model.Details;
import com.safaricom.mspinlesspartycreateprofilepostv1.model.Id;
import com.safaricom.mspinlesspartycreateprofilepostv1.model.RelatedCustomerAccount;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

public class TestDTO {
    
    public ArrayList<Id> id;
    public Details details;
    public ArrayList<RelatedCustomerAccount> relatedCustomerAccount;
    
}
