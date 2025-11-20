package com.sofia.model;

import java.time.LocalDateTime;

import com.sofia.enums.TipoVehiculo;

public class Carro extends Vehiculo {

    public Carro(String placa, String modelo, LocalDateTime horaIngreso) {
        super(placa, modelo, horaIngreso, TipoVehiculo.SEDAN);
        
    }
    
   
}
