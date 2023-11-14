package com.AgenciaJA.Aplicacion.Modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaqueteTuristico {

    private Destino destino;
    private String nombre;
    private int duracion;
    private String servicios;

}
