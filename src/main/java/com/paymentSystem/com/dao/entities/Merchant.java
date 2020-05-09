package com.paymentSystem.com.dao.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String email;
    private boolean status;

    @Column(name = "transaction_sum")
    private int total_transaction_sum;


}
