package com.AgenciaJA.Aplicacion.Modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Destino {

    private String nombre;
    private String ciudad;
    private String descripcion;
    private Image imagenes;
    private String clima;


}
