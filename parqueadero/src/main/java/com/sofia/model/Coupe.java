package com.sofia.model;

import java.time.LocalDateTime;
import com.sofia.enums.TipoVehiculo;

public class Coupe extends Vehiculo {

    public Coupe(String placa, String modelo, LocalDateTime horaIngreso) {
        super(placa, modelo, horaIngreso, TipoVehiculo.COUPE);
    }
}
