package com.movieflix.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false, length = 200) //Default length is 255
    @NotBlank(message = "Molimo unesite naslov filma!")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Molimo unesite redatelja!")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Molimo unesite izdavačku kuću!")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;

    @Column(nullable = false)
    @NotNull(message = "Molimo unesite godinu izdavanja!")
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Molimo dodajte poster!")
    private String poster;
}
