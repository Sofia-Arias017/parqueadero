package com.sofia.model;

import java.time.LocalDateTime;
import com.sofia.enums.TipoVehiculo;

public class Camioneta extends Vehiculo {

    public Camioneta(String placa, String modelo, LocalDateTime horaIngreso) {
        super(placa, modelo, horaIngreso, TipoVehiculo.CAMIONETA);
    }
}
