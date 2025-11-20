package com.sofia.model;

import java.time.LocalDateTime;

import com.sofia.enums.TipoVehiculo;

public class Moto extends Vehiculo {

    public Moto(String placa, String modelo, LocalDateTime horaIngreso) {
        super(placa, modelo, horaIngreso, TipoVehiculo.MOTO);
    
    }
    
}
