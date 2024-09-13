package com.kids_management.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;

    private Family family;
}
