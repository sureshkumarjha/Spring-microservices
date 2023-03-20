package com.microservices.model;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String firstName;
    private String lastName;
    private String address;
    @Column(unique = true)
    @NonNull
    private String email;

}
