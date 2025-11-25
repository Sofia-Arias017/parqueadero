package com.sofia.factory;

import java.time.LocalDateTime;

import com.sofia.model.Moto;
import com.sofia.model.Suv;
import com.sofia.model.Vehiculo;
import com.sofia.model.builder.CarroBuilder;

public class VehiculoFactory {

    public static Vehiculo crearVehiculo(int opcion, String placa, String modelo) throws Exception {
        return switch (opcion) {
            case 1 -> new Moto(placa, modelo, LocalDateTime.now());
            case 3 -> new CarroBuilder()
                    .conPlaca(placa)
                    //.conModelo(modelo)
                    .conHora(LocalDateTime.now().minusDays(3))
                    .build();
            case 4 -> new Suv(placa, modelo, LocalDateTime.now());
            default -> throw new Exception("Error: Tipo de Vehiculo no soportado");
        };
    }

}