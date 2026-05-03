package br.com.alura.screenmatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosSerie(@JsonAlias ("Title") String titulo,
                         @JsonAlias ("totalseasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
