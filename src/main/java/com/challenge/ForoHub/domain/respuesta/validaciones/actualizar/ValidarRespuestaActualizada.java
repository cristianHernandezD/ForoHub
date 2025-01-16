package com.challenge.ForoHub.domain.respuesta.validaciones.actualizar;

import com.challenge.ForoHub.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {
    public void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
