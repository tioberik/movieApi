package com.movieflix.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private Integer movieId;

    @NotBlank(message = "Molimo unesite naslov filma!")
    private String title;

    @NotBlank(message = "Molimo unesite redatelja!")
    private String director;

    @NotBlank(message = "Molimo unesite izdavačku kuću!")
    private String studio;

    private Set<String> movieCast;

    @NotNull(message = "Molimo unesite godinu izdavanja!")
    private Integer releaseYear;

    @NotBlank(message = "Molimo dodajte poster!")
    private String poster;

    @NotBlank(message = "Molimo dodajte url postera!")
    private String posterUrl;
}
