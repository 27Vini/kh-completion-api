package com.vinicius.khcompletion.entities;

import com.vinicius.khcompletion.util.enums.GameCode;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "worlds")
@Getter
@Setter
public class World {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private GameCode game;

    private String imageUrl;
}
