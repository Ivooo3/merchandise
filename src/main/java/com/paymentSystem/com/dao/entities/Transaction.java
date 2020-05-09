package com.paymentSystem.com.dao.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int uuid;

    @Min(value = 0L, message = "The value must be positive")
    private int amaunt;
    private String status;

    @Column(name = "email")
    private String customer_email;

    @Column(name = "phone")
    private String customer_phone;

    private int reference_id;

}
