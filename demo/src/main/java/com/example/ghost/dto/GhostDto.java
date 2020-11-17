package com.example.ghost.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class GhostDto {
    private Long id;
    private String name;
    private String role;
    private String bio;
    @JsonFormat (pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private Date birth;
}
