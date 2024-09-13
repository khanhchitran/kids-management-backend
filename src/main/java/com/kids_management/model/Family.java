package com.kids_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String familyName;

    @OneToMany(mappedBy = "family", cascade = CascadeType.ALL)
    private List<Parent> parents;
    @OneToMany(mappedBy = "family", cascade = CascadeType.ALL)
    private List<Kid> kids;
}

