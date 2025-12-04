package com.sofia.repository;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.sofia.enums.TipoVehiculo;
import com.sofia.factory.VehiculoFactory;
import com.sofia.model.Vehiculo;

public class ParqueaderoDatos {

    private static ParqueaderoDatos instancia;

    private final Map<String, Vehiculo> mapaPlacas = new HashMap<>();

    public static ParqueaderoDatos getInstance() {
        if (instancia == null) {
            instancia = new ParqueaderoDatos();
        }
        return instancia;
    }

    private ParqueaderoDatos() {
        try {
            mapaPlacas.put("ABC123", 
                VehiculoFactory.crearVehiculo(TipoVehiculo.SEDAN, "ABC123", "2023")
            );

            mapaPlacas.put("ABC124", 
                VehiculoFactory.crearVehiculo(TipoVehiculo.SEDAN, "ABC124", "2024")
            );

            mapaPlacas.put("ABC125", 
                VehiculoFactory.crearVehiculo(TipoVehiculo.SEDAN, "ABC125", "2025")
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void guardar(Vehiculo vehiculo) {
        mapaPlacas.put(vehiculo.getPlaca(), vehiculo);
    }

    public void registrarIngreso(String placa) {
        Vehiculo v = mapaPlacas.get(placa);

        if (v == null) {
            throw new IllegalArgumentException("La placa no existe: " + placa);
        }

        v.registrarIngreso();
    }

    public boolean existePlaca(String placa) {
        return mapaPlacas.containsKey(placa);
    }

    public Vehiculo buscar(String placa) {
        return mapaPlacas.get(placa);
    }
}
