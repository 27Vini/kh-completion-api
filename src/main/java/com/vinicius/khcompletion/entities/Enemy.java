package com.vinicius.khcompletion.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "enemies")
@Getter
@Setter
public class Enemy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,  length = 120)
    private String name;
    @Column(name = "image_url", length = 500)
    private String imageUrl;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "enemy_worlds", joinColumns = @JoinColumn(name = "enemy_id"), inverseJoinColumns = @JoinColumn(name = "world_id"))
    private Set<World> worlds = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "enemy_drops", joinColumns = @JoinColumn(name = "enemy_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
    private Set<Item> drops = new HashSet<>();
}
