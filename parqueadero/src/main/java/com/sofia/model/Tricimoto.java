package com.sofia.model;

import java.time.LocalDateTime;
import com.sofia.enums.TipoVehiculo;

public class Tricimoto extends Vehiculo {

    public Tricimoto(String placa, String modelo, LocalDateTime horaIngreso) {
        super(placa, modelo, horaIngreso, TipoVehiculo.TRICIMOTO);
    }
}
