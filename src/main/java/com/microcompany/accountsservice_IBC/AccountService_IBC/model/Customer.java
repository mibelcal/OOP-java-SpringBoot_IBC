package com.microcompany.accountsservice_IBC.AccountService_IBC.model;


import javax.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY,
            mappedBy = "owner")
    private List<Account> accounts = new ArrayList<>();

    public Customer(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
