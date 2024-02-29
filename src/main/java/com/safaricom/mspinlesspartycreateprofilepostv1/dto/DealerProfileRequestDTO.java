package com.safaricom.mspinlesspartycreateprofilepostv1.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.safaricom.mspinlesspartycreateprofilepostv1.model.enums.Status;

import jakarta.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data


public class DealerProfileRequestDTO {

    @Column(name = "user_name")
    @Builder.Default
    private String userName = "";

    @Column(name = "email")
    @Builder.Default
    private String email = "";

    @Column(name = "msisdn")
    private Long msisdn;

    @Column(name = "status")
    private Status status;

    @Column(name = "user_type")
    @Builder.Default
    private String userType = "";

    @Column(name = "category_code")
    private Long categoryCode;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "country")
    private String country;

    @Column(name = "user_name_prefix")
    private String userNamePrefix;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    // Decimal (9,6)
    @Column(name = "longitude")
    private BigDecimal longitude;

    // Decimal (8,6)
    @Column(name = "latitude")
    private BigDecimal latitude;

    @JsonAnySetter(enabled = true)
    public void setOtherField(String key, Object value) {
        throw new IllegalArgumentException("Field " + key + " is not allowed in the request body");
    }


}
