package com.kids_management.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
public class Family {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String familyName;

    @OneToMany(mappedBy = "family", cascade = CascadeType.ALL)
    private List<Parent> parents;
    @OneToMany(mappedBy = "family", cascade = CascadeType.ALL)
    private List<Kid> kids;
}

