package com.AgenciaJA.Aplicacion.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private String identificacion;
    private String nombre;
    private String correoElectronico;
    private String numTelefono;
    private String direccionResidencia;

}


