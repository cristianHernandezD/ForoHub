package com.challenge.ForoHub.domain.topico;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}
