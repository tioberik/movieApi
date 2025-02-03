package com.movieflix.dto;

import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
public class MovieUploadRequest {

    @Schema(type = "string", format = "binary", description = "Movie poster image file")
    private MultipartFile file;

    @Schema(type = "json", description = "Movie details in JSON format")
    private Json movieDto;

}
