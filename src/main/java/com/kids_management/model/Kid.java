package com.kids_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Kid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String userName;
    private String password;

    @OneToMany(mappedBy = "kid")
    private List<Task> tasks;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;
}
