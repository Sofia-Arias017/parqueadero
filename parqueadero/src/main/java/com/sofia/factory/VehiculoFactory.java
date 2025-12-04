package com.sofia.factory;

import java.time.LocalDateTime;

import com.sofia.enums.TipoVehiculo;
import com.sofia.model.Bicicleta;
import com.sofia.model.Cuatrimoto;
import com.sofia.model.Tricimoto;
import com.sofia.model.Moto;
import com.sofia.model.Sedan;
import com.sofia.model.Suv;
import com.sofia.model.Camioneta;
import com.sofia.model.Vehiculo;

public class VehiculoFactory {

    public static Vehiculo crearVehiculo(TipoVehiculo tipo, String placa, String modelo) throws Exception {
        LocalDateTime ahora = LocalDateTime.now();

        switch (tipo) {
            case BICICLETA:
                return new Bicicleta(placa, modelo, ahora);

            case MOTO:
                return new Moto(placa, modelo, ahora);

            case TRICIMOTO:
                return new Tricimoto(placa, modelo, ahora);

            case CUATRIMOTO:
                return new Cuatrimoto(placa, modelo, ahora);

            case SEDAN:
                return new Sedan(placa, modelo, ahora);

            case SUV:
                return new Suv(placa, modelo, ahora);

            case CAMIONETA:
                return new Camioneta(placa, modelo, ahora);

            default:
                throw new Exception("Tipo de vehiculo no soportado: " + tipo);
        }
    }

    public static Vehiculo crearVehiculo(int opcion, String placa, String modelo) throws Exception {
        return switch (opcion) {
            case 1 -> crearVehiculo(TipoVehiculo.MOTO, placa, modelo);
            case 2 -> crearVehiculo(TipoVehiculo.BICICLETA, placa, modelo);
            case 3 -> crearVehiculo(TipoVehiculo.SEDAN, placa, modelo);
            case 4 -> crearVehiculo(TipoVehiculo.SUV, placa, modelo);
            case 5 -> crearVehiculo(TipoVehiculo.CAMIONETA, placa, modelo);
            case 6 -> crearVehiculo(TipoVehiculo.TRICIMOTO, placa, modelo);
            case 7 -> crearVehiculo(TipoVehiculo.CUATRIMOTO, placa, modelo);
            default -> throw new Exception("Error: Tipo (opcion) de Vehiculo no soportado -> " + opcion);
        };
    }
}
