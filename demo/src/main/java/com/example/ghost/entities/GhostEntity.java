package com.example.ghost.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

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
        @JsonFormat (pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
        private Date birth;
}
