package com.kids_management.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;
}
