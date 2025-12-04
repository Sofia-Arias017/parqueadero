package com.sofia.model;

import java.time.LocalDateTime;
import com.sofia.enums.TipoVehiculo;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String placa, String modelo, LocalDateTime horaIngreso) {
        super(placa, modelo, horaIngreso, TipoVehiculo.BICICLETA);
    }
}
