package com.sofia.view;

import java.util.Scanner;
import com.sofia.enums.TipoVehiculo;

public class ValidarTipoConsola implements IValidarTipo {

    private final Scanner scan = new Scanner(System.in);

    @Override
    public String seleccionarModelo(String placa) {
        System.out.println("Ingrese el modelo del vehiculo " + placa + ":");
        return scan.nextLine();
    }

    @Override
    public int seleccionarTipoVehiculo() {
        System.out.println("Seleccione el tipo de vehiculo:");
        TipoVehiculo[] tipos = TipoVehiculo.values();
        for (int i = 0; i < tipos.length; i++) {
            System.out.println((i + 1) + ". " + tipos[i].name());
        }

        return Integer.parseInt(scan.nextLine());
    }
}
