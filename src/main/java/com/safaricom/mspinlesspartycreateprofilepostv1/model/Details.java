package com.safaricom.mspinlesspartycreateprofilepostv1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class Details {
    @Column(name = "pin")
    @Builder.Default
    public String pin = "";

}
