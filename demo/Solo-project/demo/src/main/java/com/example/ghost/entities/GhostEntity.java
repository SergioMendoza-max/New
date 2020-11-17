package com.example.ghost.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "GHOST")
@Getter
@Setter


    public class GhostEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String name;

        @Column
        private String role;

        @Column
        private String bio;

        @Column
        private String birth;
}
