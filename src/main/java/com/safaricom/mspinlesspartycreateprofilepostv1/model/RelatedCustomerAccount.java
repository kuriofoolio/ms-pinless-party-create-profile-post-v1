package com.safaricom.mspinlesspartycreateprofilepostv1.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "entp_integration")
public class RelatedCustomerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    public ArrayList<Id> id;

    @Column(name = "salutation")
    @Builder.Default
    public String salutation = "";

    @Column(name = "first_name")
    @Builder.Default
    public String firstName = "";

    @Column(name = "last_name")
    @Builder.Default
    public String lastName = "";

    @Column(name = "category_code")
    @Builder.Default
    public String categoryCode = "";

    @Column(name = "email_address")
    @Builder.Default
    public String emailAddress = "";

}