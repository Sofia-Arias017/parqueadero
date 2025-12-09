package com.sofia.view;

import java.util.Scanner;

import com.sofia.service.ParqueaderoFacade;

public class MenuConsole {

    private final Scanner scan = new Scanner(System.in);
    private final ParqueaderoFacade facade;

    public MenuConsole() {
        this.facade = new ParqueaderoFacade(
                new ValidarPagoConsola(),
                new ValidarTipoConsola()
        );
    }

    public void iniciar() {
        int opcion = -1;

        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opcion: ");

            switch (opcion) {
                case 1 -> registrarIngreso();
                case 2 -> registrarSalida();
                case 0 -> System.out.println("Gracias por usar el sistema.");
                default -> System.out.println("Opcion invalida.");
            }

        } while (opcion != 0);
    }

    private void registrarIngreso() {
        System.out.println("---- INGRESO ----");
        String placa = leerTexto("Ingrese la placa: ").toUpperCase();

        String resultado = facade.registrarIngreso(placa);
        System.out.println(resultado);
    }

    private void registrarSalida() {
        System.out.println("---- SALIDA ----");
        String placa = leerTexto("Ingrese la placa: ").toUpperCase();

        String resultado = facade.procesarSalida(placa);
        System.out.println(resultado);
    }

    private void mostrarMenu() {
        System.out.println("--- PARQUEADERO ---");
        System.out.println("1. Registrar ingreso");
        System.out.println("2. Registrar salida");
        System.out.println("0. Salir");
    }

    private int leerEntero(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }

    private String leerTexto(String msg) {
        System.out.println(msg);
        return scan.nextLine().trim();
    }
}
