package com.neoteric.isports.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "payment_details")
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "accountNumber", nullable = false)
    private String accountNumber;

    @Column(name = "bankName", nullable = false)
    private String bankName;

    @Column(name = "accountHolderName", nullable = false)
    private String accountHolderName;

    @Column(name = "ifscCode", nullable = false)
    private String ifscCode;

    @Column(name = "paymentMode", nullable = false)
    private String paymentMode;

    /*@Column(name = "upi_id", nullable = false)
    private String upiID;*/

    @Column(name = "upiNo", nullable = false)
    private String upiNo;

}
