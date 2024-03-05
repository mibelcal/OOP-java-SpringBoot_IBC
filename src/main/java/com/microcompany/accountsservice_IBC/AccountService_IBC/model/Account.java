package com.microcompany.accountsservice_IBC.AccountService_IBC.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(1)
    private Long id;

    @Size(min = 3, max = 10)
    private String type;

    @DateTimeFormat
    @NotNull
    Date openingDate;

    @Min(0)
    private int balance;

    @Min(1)
    private Long ownerId;

//    @Transient
//    @JsonIgnore
//    Customer owner;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    @ToString.Exclude
    private Customer owner;



}
