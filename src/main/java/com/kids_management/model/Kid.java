package com.kids_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Kid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;

    private int age;
    private String userName;
    private String password;
    @OneToMany(mappedBy = "kid")
    private List<Task> tasks;
    private Family family;
}
