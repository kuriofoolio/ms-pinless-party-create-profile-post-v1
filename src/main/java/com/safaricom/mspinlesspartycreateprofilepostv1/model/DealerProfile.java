package com.safaricom.mspinlesspartycreateprofilepostv1.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import com.safaricom.mspinlesspartycreateprofilepostv1.model.enums.Status;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "tbl_dealer_profile")
public class DealerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

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

    @CreatedDate
    @Column(name = "createdon", nullable = false, updatable = false)
    @Generated(value = "INSERT")
    private LocalDateTime createdOn;

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

}
