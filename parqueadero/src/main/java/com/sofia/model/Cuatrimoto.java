package com.sofia.model;

import java.time.LocalDateTime;
import com.sofia.enums.TipoVehiculo;

public class Cuatrimoto extends Vehiculo {

    public Cuatrimoto(String placa, String modelo, LocalDateTime horaIngreso) {
        super(placa, modelo, horaIngreso, TipoVehiculo.CUATRIMOTO);
    }
}
